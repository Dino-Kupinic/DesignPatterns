package Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
  private List<WeatherObserver> observers = new ArrayList<>();
  private String currentWeather;

  public void addObserver(WeatherObserver observer) {
    observers.add(observer);
  }

  public void removeObserver(WeatherObserver observer) {
    observers.remove(observer);
  }

  public void setWeather(String weather) {
    this.currentWeather = weather;
    notifyObservers();
  }

  private void notifyObservers() {
    for (WeatherObserver observer : observers) {
      observer.update(currentWeather);
    }
  }
}

