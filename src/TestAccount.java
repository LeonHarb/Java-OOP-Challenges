// Assignment #4: Temperature Analysis and O-O Basics
// TestAccount class by Leon Harb

import java.text.DecimalFormat; 
import java.util.Date; 


public class TestAccount {

	
	public static void main(String[] args) 
	{
		
		DecimalFormat df = new DecimalFormat("0.00");
		
		Account acc1 = new Account(123, 10000, 2.5);
		
		acc1.withdraw(1500);
		System.out.println("The balance after withdrawal is: " + acc1.getBalance());
		acc1.deposit(2500);
		System.out.println("The balance after deposit is: " + acc1.getBalance());
		
		
		System.out.println("Account ID: " + acc1.getId());
		System.out.println("Balance: " + acc1.getBalance());
		double monthlyInterestRate = acc1.getMonthlyInterestRate(acc1.getAnnualInterestRate());
		System.out.println("The monthly interest rate of the account is: " + df.format(monthlyInterestRate) + "%");
		System.out.println("Date Created: " + acc1.getDateCreated());
		
	}

}