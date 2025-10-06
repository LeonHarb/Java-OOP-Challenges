// Assignment #4: Temperature Analysis and O-O Basics
// Challenge #2: Rectangle Class by Leon Harb

public class Rectangle {
	
	// The fields 
	private double length; 
	private double width; 
	
	
	// No Argument Constructor
	public Rectangle(){
		
	}
	
	// Constructor using the fields of width and length
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	// Getters and Setters (Accessors and Mutators)
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
	public double getArea(double length, double width) {
		double area = width * length;
		return area;
	}
	
	public double getPerimeter(double length, double width) {
		double perimeter = (2 * length) + (2 * width);
		return perimeter;
	}

	

}
