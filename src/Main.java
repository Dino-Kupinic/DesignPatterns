import Decorator.Coffee;
import Decorator.MilkDecorator;
import Decorator.SimpleCoffee;
import Decorator.SugarDecorator;
import Factory.CarFactory;
import Factory.MotorcycleFactory;
import Factory.VehicleFactory;
import Observer.Farmer;
import Observer.WeatherStation;
import Strategy.BikeNavigation;
import Strategy.CarNavigation;
import Strategy.NavigationApp;
import Strategy.WalkNavigation;

public class Main {
  public static void main(String[] args) {
    // Singleton ----------------------
    Singleton.ZooKeeper keeper1 = Singleton.ZooKeeper.getInstance();
    keeper1.addAnimal();

    Singleton.ZooKeeper keeper2 = Singleton.ZooKeeper.getInstance();
    keeper2.addAnimal();

    System.out.println(keeper1 == keeper2);

    // Observer ----------------------
    WeatherStation station = new WeatherStation();
    Farmer farmer1 = new Farmer("John");
    Farmer farmer2 = new Farmer("Jane");

    station.addObserver(farmer1);
    station.addObserver(farmer2);

    station.setWeather("Rainy");

    // Factory ----------------------
    VehicleFactory carFactory = new CarFactory();
    carFactory.deliverVehicle();

    VehicleFactory motorcycleFactory = new MotorcycleFactory();
    motorcycleFactory.deliverVehicle();

    // Strategy ----------------------
    NavigationApp app = new NavigationApp();

    app.setStrategy(new CarNavigation());
    app.navigateTo("Central Park");

    app.setStrategy(new BikeNavigation());
    app.navigateTo("Times Square");

    app.setStrategy(new WalkNavigation());
    app.navigateTo("Local Cafe");

    // Decorator ----------------------
    Coffee simpleCoffee = new SimpleCoffee();
    System.out.println(simpleCoffee.getDescription() + " costs $" + simpleCoffee.getCost());

    Coffee milkCoffee = new MilkDecorator(simpleCoffee);
    System.out.println(milkCoffee.getDescription() + " costs $" + milkCoffee.getCost());

    Coffee sweetMilkCoffee = new SugarDecorator(milkCoffee);
    System.out.println(sweetMilkCoffee.getDescription() + " costs $" + sweetMilkCoffee.getCost());
  }
}