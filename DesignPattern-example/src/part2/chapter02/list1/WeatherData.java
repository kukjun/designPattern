package part2.chapter02.list1;

public class WeatherData {
  private float temperature;
  private float humidity;
  private float pressure;

  public float getHumidity() {
    return humidity;
  }

  public float getTemperature() {
    return temperature;
  }

  public float getPressure() {
    return pressure;
  }

  //기상 관측값이 갱신될 때마다 알려주기 위한 메소드
  public void measurementsChanged() {
    // 코드가 들어갈 자리
    CurrentConditionsDisplay CurrentConditionsDisplayDisplay = new CurrentConditionsDisplay();
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    ForecastDisplay forecastDisplay = new ForecastDisplay();
    float temp = getTemperature();
    float humidity = getHumidity();
    float pressure = getPressure();

    CurrentConditionsDisplayDisplay.update(temp, humidity, pressure);
    statisticsDisplay.update(temp, humidity, pressure);
    forecastDisplay.update(temp, humidity, pressure);
  }

  // 기타 메소드

}
