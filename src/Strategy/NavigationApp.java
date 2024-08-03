package Strategy;

public class NavigationApp {
  private NavigationStrategy strategy;

  public void setStrategy(NavigationStrategy strategy) {
    this.strategy = strategy;
  }

  public void navigateTo(String destination) {
    if (strategy == null) {
      System.out.println("Please select a navigation method.");
      return;
    }
    strategy.navigate(destination);
  }
}

