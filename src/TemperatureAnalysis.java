// Assignment #4: Temperature Analysis and O-O Basics
// Challenge #1: Temperature Analysis by Leon Harb

import java.util.Scanner; 
import java.text.DecimalFormat;

public class TemperatureAnalysis {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.println("This program takes one temperature in Fahrenheit and converts it to Celsius and vice versa");
		
		// Takes input from user in fahrenheit
		System.out.println("Enter your temperature in Fahrenheit: ");
		double fahrenheitInput = input.nextDouble();
		
		// Converts it to celsius
		double celsius = fahrenheitToCelsius(fahrenheitInput);
		System.out.println(fahrenheitInput + "°F is equal to " + df.format(celsius) + "°C");
		
		// Checks if temperature is considered freezing
		boolean freeze1 = isFreezing(celsius);
		if(freeze1 == true) {
			System.out.println("It is freezing.");
		}
		else {
			System.out.println("It is not freezing.");
		}
		
		System.out.println("Weather Advice: ");
		getWeatherAdvice(celsius);
		
		
		// Takes input from user in celsius	
		boolean freeze2;
		System.out.println("Enter your temperature in degrees: ");
		double degrees = input.nextDouble();
		input.nextLine();
		System.out.println("Enter the scale of your temperature: (F or C): ");
		String scale = input.nextLine();
		if(scale.equalsIgnoreCase("C") || scale.equalsIgnoreCase("F")) {
			freeze2 = isFreezing(degrees, scale);
		}
		else {
			System.out.println("The value you entered for the scale is not valid");
			System.out.println("Enter the scale of your temperature: (F or C): ");
			scale = input.nextLine();
			while(!(scale.equalsIgnoreCase("C") || scale.equalsIgnoreCase("F"))) {
				System.out.println("The value you entered for the scale is not valid");
				System.out.println("Enter the scale of your temperature: (F or C): ");
				scale = input.nextLine();
			}
			freeze2 = isFreezing(degrees, scale);
		}
		
		// Checks if temperature is considered freezing
		freeze2 = isFreezing(celsius);
		if(freeze2 == true) {
			System.out.println("It is freezing.");
		}
		else {
			System.out.println("It is not freezing.");
		}
		
		System.out.println("Weather Advice: ");
		getWeatherAdvice(degrees, scale);
		
		
		input.close();
		
	}
	
	// Method that converts the Celsius temperature to Fahrenheit
	public static double celsiusToFahrenheit(double celsius) {
	    double fahrenheit = (celsius * 9/5) + 32;
	    return fahrenheit;
	}
	
	//Method that converts the Fahrenheit temperature to Celsius
	public static double fahrenheitToCelsius(double fahrenheit) {
	    double celsius = (fahrenheit - 32) * 5/9;
	    return celsius;
	}
	
	// Version 1: isFreezing method takes temperature in celsius
	// Method that returns true (it is freezing) if temperature is 0°C or below
	public static boolean isFreezing(double celsius) {
	    boolean freeze; 
		if(celsius <= 0) {
	    	freeze = true;
	    }
	    else {
	    	freeze = false;
	    }
		return freeze;
	}
	
	// Method Overloading
	// Version 2: isFreezing method takes temperature and scale
	// Method that returns true (it is freezing) if temperature is 32° or below
	public static boolean isFreezing(double degrees, String scale){
		boolean freeze = false;
		
		if(scale.equalsIgnoreCase("f")) {
			if(degrees <= 32) {
				freeze = true;
			}
			else {
				freeze = false;
			}
		}
		else if(scale.equalsIgnoreCase("C")) {
			freeze = isFreezing(degrees);
		}
		
		return freeze;
	}
	
	public static void getWeatherAdvice(double degrees, String scale) {
		if(scale.equalsIgnoreCase("f")) {
			if(degrees >= 80) {
				System.out.println("It is hot outside. You should not worry about wearing a jacket. You will sweat if you do wear one.");
			}
			else if(degrees >= 68) {
				System.out.println("It is moderate outside. You can enjoy this middle ground weather without a jacket, \nbut wear one if you get easily cold");
			}
			else {
				System.out.println("It is cold outside. A jacket is recommended.");
			}
		}
		else if(scale.equalsIgnoreCase("c")) {
			if(degrees >= 26.6) {
				System.out.println("It is hot outside. You should not worry about wearing a jacket. You will sweat if you do wear one.");
			}
			else if(degrees >= 20) {
				System.out.println("It is moderate outside. You can enjoy this middle ground weather without a jacket, \nbut wear one if you get easily cold");
			}
			else {
				System.out.println("It is cold outside. A jacket is recommended.");
			}
		}
	}
	
	public static void getWeatherAdvice(double celsius) {
		if(celsius >= 26.6) {
			System.out.println("It is hot outside. You should not worry about wearing a jacket. You will sweat if you do wear one.");
		}
		else if(celsius >= 20) {
			System.out.println("It is moderate outside. You can enjoy this middle ground weather without a jacket, \nbut wear one if you get easily cold");
		}
		else {
			System.out.println("It is cold outside. A jacket is recommended.");
		}
	}
	
}

