// Assignment #4
// Challenge #2 Test Rectangle Class by Leon Harb

import java.util.Scanner;

public class TestRectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Rectangle rectangle1 = new Rectangle();
		
		System.out.println("The program will calculate the perimeter and area of a rectangle");
		
		// Ask user for length and set it to the rectangle1 object
		System.out.println("Enter the length of the rectangle");
		double len = input.nextDouble();
		rectangle1.setLength(len);
		
		// Ask user for width and set it to the rectangle1 object
		System.out.println("Enter the width of the rectangle");
		double wid = input.nextDouble();
		rectangle1.setWidth(wid);
		
		// Another way of setting this object instead of initializing it with no values
		// Rectangle rectangle1 = new Rectangle(len, wid);
		
		System.out.println("The area of the rectangle is " + rectangle1.getArea(rectangle1.getLength(), rectangle1.getWidth()));
		System.out.println("The perimeter of the rectangle is " + rectangle1.getPerimeter(rectangle1.getLength(), rectangle1.getWidth()));
		
		input.close();
		
	}
	

	
}
