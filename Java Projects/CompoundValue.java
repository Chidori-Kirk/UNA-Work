import java.util.Scanner;

public class CompoundValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the monthly saving amount: ");
		double amount = input.nextDouble();
		System.out.print("Enter the annual interest rate: ");
		double rate = input.nextDouble();
		
		double balance = amount * (1 +rate / 12);
		System.out.printf("After the first month, the account value is $%,.3f.\n", balance);
		balance = (balance + amount) * (1 + rate / 12);
		System.out.printf("After the second month, the account value is $%,.3f.\n", balance);
		balance = (balance + amount) * (1 + rate / 12);
		System.out.printf("After the third month, the account value is $%,.3f.\n", balance);
		balance = (balance + amount) * (1 + rate / 12);
		System.out.printf("After the fourth month, the account value is $%,.3f.\n", balance);
		balance = (balance + amount) * (1 + rate / 12);
		System.out.printf("After the fifth month, the account value is $%,.3f.\n", balance);
		balance = (balance + amount) * (1 + rate / 12);
		System.out.printf("After the sixth month, the account value is $%,.3f.\n", balance);
	}
}