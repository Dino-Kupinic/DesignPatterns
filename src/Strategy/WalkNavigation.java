package Strategy;

public class WalkNavigation implements NavigationStrategy {
  @Override
  public void navigate(String destination) {
    System.out.println("Navigating by foot to " + destination);
  }
}
