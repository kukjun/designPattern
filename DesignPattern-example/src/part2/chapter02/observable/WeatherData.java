package part2.chapter02.observable;

import java.util.Observable;

public class WeatherData extends Observable {

  private float temperature;
  private float humidity;
  private float pressure;

  public WeatherData() {
  }

  public void measurementsChanged() {
    setChanged();
    // notifyObservers()를 호출할 떄, 데이터 객체를 보내지 않는다. -> pull 모델
    notifyObservers();
  }

  public void setMeasurements(float temperature, float humidity, float pressure) {
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }

  public float getTemperature() {
    return temperature;
  }

  public float getHumidity() {
    return humidity;
  }

  public float getPressure() {
    return pressure;
  }


}
