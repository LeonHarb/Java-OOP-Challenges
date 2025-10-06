// Assignment #4: Temperature Analysis and O-O Basics
// Challenge #4: TestFan Class by Leon Harb

import java.util.Scanner;
import java.text.DecimalFormat;

public class TestFan {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		// Get the speed of the fan from the user
		System.out.print("Enter the fan speed: ");
		int speed = input.nextInt();
		input.nextLine();
		
		// Get the status of the fan (on/off) from the user
		System.out.print("Enter the fan status (on/off): ");
		String fanStatus = input.nextLine();
		while(!((fanStatus.equalsIgnoreCase("on")) || fanStatus.equalsIgnoreCase("off"))){
			System.out.print("Invalid input. Please enter either on or off: ");
			fanStatus = input.nextLine();
		}
		
		// Make the string fanStatus all LowerCase
		fanStatus = fanStatus.toLowerCase();
		
		// Get the radius of the fan from the user
		System.out.print("Enter the fan radius: ");
		double radius = input.nextDouble();
		input.nextLine();
		
		// Get the color of the fan from the user
		System.out.print("Enter the fan's color: ");
		String color = input.nextLine();
		
		Fan myFan = new Fan(speed, fanStatus, radius, color);
		System.out.println(myFan.toString());
		
		input.close();

	}

}
