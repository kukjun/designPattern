package part2.chapter02.list2;

import part2.chapter02.list2.display.CurrentConditionsDisplay;
import part2.chapter02.list2.display.HeatIndexDisplay;

public class WeatherStation {

  public static void main(String[] args) {
    WeatherData weatherData = new WeatherData();

    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

    weatherData.setMeasurements(80, 65, 30.4f);
    weatherData.setMeasurements(50, 32, 19.7f);
  }

}
