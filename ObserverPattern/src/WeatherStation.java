
public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 45);
		weatherData.setMeasurements(70, 60, 48);

	}

}
