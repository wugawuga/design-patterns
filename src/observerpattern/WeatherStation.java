package observerpattern;

public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();

		CurrentConditionDisplay currentConditionDisplay =
			new CurrentConditionDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 80, 30.3f);
		weatherData.setMeasurements(10, 0, 10.3f);
		weatherData.setMeasurements(40, 80, 20.3f);
	}
}
