package tut04.house;

public class WeatherStation {
	private Thermometer thermometer;
	
	public WeatherStation(Thermometer thermometer) {
		this.thermometer = thermometer;
	}
	
	public Thermometer getThermometer() {
		return this.thermometer;
	}
}
