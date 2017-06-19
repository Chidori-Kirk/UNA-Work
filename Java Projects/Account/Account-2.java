
public class Account {
	private int id = 0;
	private double balance = 0.0;
	private static double annualInterestRate = 0.0;
	private java.util.Date dateCreated;
	
	public Account() {
		dateCreated = new java.util.Date();
	}
	
	public Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		dateCreated = new java.util.Date();
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate/100;
	}
	
	public double getAnnualInterestRate() {
		return this.annualInterestRate;
	}
	
	public java.util.Date getDateCreated() {
	    return this.dateCreated;
	}
	
	double monthlyInterestRate() {
		return annualInterestRate / 12;
	}
	
	double withdraw(double amount) {
	    return balance -= amount;
	}   
	
	double deposit(double amount) {
	    return balance += amount;   
	}
}
