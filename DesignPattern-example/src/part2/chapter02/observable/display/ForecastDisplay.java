package part2.chapter02.observable.display;

import part2.chapter02.observable.DisplayElement;
import part2.chapter02.observable.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
  private Observable observable;
  private float currentPressure = 29.92f;
  private float lastPressure;

  public ForecastDisplay(Observable observable) {
    this.observable = observable;
    observable.addObserver(this);
  }

  @Override
  public void update(Observable o, Object arg) {
    if(o instanceof WeatherData) {
      WeatherData weatherData = (WeatherData) o;
      lastPressure = currentPressure;
      currentPressure = weatherData.getPressure();
      display();
    }
  }

  @Override
  public void display() {
    System.out.println("lastPressure : " + lastPressure + " and CurrentPressure : " + currentPressure);
  }

}
