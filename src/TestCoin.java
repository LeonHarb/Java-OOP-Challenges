// Assignment #4: Temperature Analysis and O-O Basics
// Challenge #5 by Leon Harb

import java.util.Scanner; 

public class TestCoin {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of flips: ");
		int numOfFlips = input.nextInt();
		input.nextLine();
		
		System.out.println("Initial side facing up: heads");
		
		Coin silver = new Coin();
		silver.flipCoin(numOfFlips);
			
		input.close();
		
		

	}

}
