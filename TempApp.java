package Temperature;

import java.util.Scanner;

public class TempApp {

	public static void main(String[] args) {
		
		TemperatureConverter T1 = new TemperatureConverter();
		TemperatureConverter T2 = new TemperatureConverter();
		
		Scanner myScanner = new Scanner(System.in);
		
		System.out.println("enter the temperature in celsius : ");
		double celsius = myScanner.nextDouble();

		System.out.println("enter the temperature in fahrenheit : ");
		double fahrenheit = myScanner.nextDouble();
		
		double celtofah = T1.celsiusToFahrenheit(celsius);
		double fahtocel = T2.fahrenheitTocelsius(fahrenheit);
		
		System.out.println(celsius+"celsius is equal to "+celtofah+"fahrenheit");
		System.out.println(fahrenheit+ "fahrenheit is equal to "+fahtocel+"celsius");
		
		myScanner.close();
		

	}

}
