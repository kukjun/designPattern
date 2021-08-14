package part2.chapter02.list2.display;

import part2.chapter02.list2.Administrator;
import part2.chapter02.list2.Display;
import part2.chapter02.list2.DisplayElement;

public class CurrentConditionsDisplay implements Display, DisplayElement {

  private float temperature;
  private float humidity;
  private Administrator weatherData;

  public CurrentConditionsDisplay(Administrator weatherData) {
    this.weatherData = weatherData;
    weatherData.registerDisplay(this);
  }

  public void update(float temp, float humidity, float pressure) {
    this.temperature = temp;
    this.humidity = humidity;
    display();
  }

  @Override
  public void display() {
    System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
  }

}
