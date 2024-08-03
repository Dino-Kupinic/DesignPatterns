package Strategy;

public class BikeNavigation implements NavigationStrategy {
  @Override
  public void navigate(String destination) {
    System.out.println("Navigating by bike lanes to " + destination);
  }
}
