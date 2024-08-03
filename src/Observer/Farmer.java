package Observer;

public class Farmer implements WeatherObserver {
  private String name;

  public Farmer(String name) {
    this.name = name;
  }

  @Override
  public void update(String weatherCondition) {
    System.out.println(name + " is adapting to " + weatherCondition + " weather.");
  }
}
