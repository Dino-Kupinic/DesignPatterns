package Factory;

class Car implements Vehicle {
  @Override
  public void startEngine() {
    System.out.println("Car engine starts with a quiet hum.");
  }
}
