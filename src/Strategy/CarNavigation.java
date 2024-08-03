package Strategy;

public class CarNavigation implements NavigationStrategy {
  @Override
  public void navigate(String destination) {
    System.out.println("Navigating by road to " + destination);
  }
}
