package part2.chapter02.list2;

import java.util.ArrayList;

public class WeatherData implements Administrator {

  private ArrayList<Display> displays;
  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
    displays = new ArrayList<Display>();
  }

  @Override
  public void registerDisplay(Display d) {
    displays.add(d);
  }

  @Override
  public void removeDisplay(Display d) {
    int i = displays.indexOf(d);
    if (i >= 0) {
      displays.remove(i);
    }
  }

  @Override
  public void notifyDisplays() {
    for (int i = 0; i < displays.size(); i++) {
      Display display = (Display) displays.get(i);
      display.update(temperature, humidity, pressure);
    }
  }

  //기상 관측값이 갱신될 때마다 알려주기 위한 메소드
  public void measurementsChanged() {
    notifyDisplays();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  // 기타 메소드
  public float getHumidity() {
    return humidity;
  }

  public float getTemperature() {
    return temperature;
  }

  public float getPressure() {
    return pressure;
  }

}
