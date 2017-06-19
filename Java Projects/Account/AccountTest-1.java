public class AccountTest {
	public static void main(String [] args) {
		Account accountOne = new Account(112233, 20000.00);
		
		accountOne.setAnnualInterestRate(4.5);
		accountOne.withdraw(2500);
		accountOne.deposit(3000);
		System.out.printf("The account balance is $%,.2f\n", accountOne.getBalance());
		System.out.printf("The monthly interest is $%,.2f\n", accountOne.monthlyInterestRate()*accountOne.getBalance());
		System.out.printf("This account was created at " + accountOne.getDateCreated());
	}
}
