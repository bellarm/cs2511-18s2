package tut04.house;

public class House {
	private WeatherStation station;
	
	public float getTempReading() {
		return station.getThermometer().getTemperature();
	}
}
