// Assignment #4: Temperature Analysis and O-O Basics
// Challenge #3: Account Class by Leon Harb

import java.text.DecimalFormat;
import java.util.Date; 

public class Account {
	
	// Fields
	private int id; 
	private double balance; 
	private double annualInterestRate; 
	private Date dateCreated;
	
	// No argument Constructor
	public Account() {
		this.id = 0;
		this.balance = 0;
		this.annualInterestRate = 0;
		this.dateCreated = new Date();
	}

	// Constructor that creates an account using four arguments
	public Account(int id, double balance, double annualInterestRate) {
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = new Date();
	}

	// Accessor for id field
	public int getId() {
		return id;
	}

	// Mutator for id field
	public void setId(int id) {
		this.id = id;
	}

	// Accessor for balance field
	public double getBalance() {
		return balance;
	}

	// Mutator for balance field
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Accessor for annualInterestRate field
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// Mutator for annualInterestRate field
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// Accessor for dateCreated
	public Date getDateCreated() {
		return dateCreated;
	} 
	
	// Method to calculate the monthlyInterestRate from the annualInterestRate
	public double getMonthlyInterestRate(double annualInterestRate) {
		double monthlyInterestRate = annualInterestRate / 12;
		return monthlyInterestRate; 
	}
	
	// Method to withdraw money from the account
	public void withdraw(double amount) {
		this.balance = this.balance - amount; 
	}
	
	// Method to deposit money into the account
	public void deposit(double amount) {
		this.balance = this.balance + amount;	
	}

	
}
