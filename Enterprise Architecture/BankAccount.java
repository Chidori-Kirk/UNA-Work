package com.acme.financial;

public class BankAccount {
	// if we use double we need to worry about round-off error
	// many people use BigDecimal for monetary values
	private int balance;
	
	public BankAccount(int startingBalance) {
		this.balance = startingBalance;
	}
	
	public void deposit(int amount) {
		this.balance += amount;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void withdraw(int amount) {
		this.balance -= amount;
	}
	
	public void transfer(int amount, BankAccount other) {
		this.balance = amount;
	}
}
