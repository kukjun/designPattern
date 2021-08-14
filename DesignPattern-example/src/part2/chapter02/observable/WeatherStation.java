package part2.chapter02.observable;

import part2.chapter02.observable.display.CurrentConditionsDisplay;
import part2.chapter02.observable.display.ForecastDisplay;

public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
  }

}
