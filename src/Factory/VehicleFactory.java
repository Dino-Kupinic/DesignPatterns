package Factory;

public abstract class VehicleFactory {
  public abstract Vehicle createVehicle();

  public void deliverVehicle() {
    Vehicle vehicle = createVehicle();
    System.out.print("Delivering new vehicle. ");
    vehicle.startEngine();
  }
}
