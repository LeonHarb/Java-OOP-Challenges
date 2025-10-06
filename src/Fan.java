// Assignment #4: Temperature Analysis and O-O Basics
// Challenge #4: Fan Class by Leon Harb


public class Fan {
	
	private int speed;
	private String fanStatus = "off";
	private double radius = 5;
	private String color = "blue";
	
	
	public Fan() {
		this.speed = 0;
		this.fanStatus = "off";
		this.radius = 5;
		this.color = "blue";
		
	}

	public Fan(int speed, String fanStatus, double radius, String color) {
		this.speed = speed;
		this.fanStatus = fanStatus;
		this.radius = radius;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fan speed: " + speed + "\nThe fan is " + fanStatus + "\nThe fan radius is " + radius + "\nThe color of the fan is: " + color;
	}
	


	
}
