// Assignment #4: Temperature Analysis and O-O Basics
// Challenge #5: Coin Class by Leon Harb

import java.util.Random; 

public class Coin {
	
	private boolean headsOrTails; 
	
	public Coin(boolean headsOrTails) {
		this.headsOrTails = headsOrTails;
	}
	
	public Coin() {
		this.headsOrTails = true;
	}
	
	public void flipCoin(int numOfFlips) {
		
		Random rand = new Random();
		
		int randomFlip; 
		int countOfHeads = 0; 
		int countOfTails = 0; 
		
		for(int i = 0; i < numOfFlips; i++) {
			randomFlip = rand.nextInt(2);
			if(randomFlip == 1) {
				this.headsOrTails = true; 
				System.out.println("heads");
				countOfHeads++; 
			}
			else{
				this.headsOrTails = false;
				System.out.println("tails");
				countOfTails++;
			}
		}
		
		System.out.println("Heads flipped: " + countOfHeads);
		System.out.println("Tails flipped: " + countOfTails);
		
		
	}
}
