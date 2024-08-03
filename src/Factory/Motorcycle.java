package Factory;

public class Motorcycle implements Vehicle {
  @Override
  public void startEngine() {
    System.out.println("Motorcycle engine roars to life.");
  }
}
