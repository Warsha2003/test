package Temperature;

public class TemperatureConverter {
	private double temperature;

	public TemperatureConverter() {
		
		this.temperature = temperature= 0;
	}

	public double getTemperature() {
		return temperature;
	}

	public double celsiusToFahrenheit(double celsius) {
		
		return (celsius * 9/5) +32;
		
	}
	
	
public double fahrenheitTocelsius(double fahrenheit) {
		
		return (fahrenheit -32) * 5/9;
	}
	
	
}
