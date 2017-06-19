import java.util.Scanner;

public class Payroll {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double payRate = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federal = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double state = input.nextDouble();
		
		double gross = hours * payRate;
		double federalWith = federal * gross;
		double stateWith = state * gross;
		double totalWith = federalWith + stateWith;
		
		System.out.print("\nEmployee Name: " + name);
		System.out.printf("\nHours worked: %,.2f\n", hours);
		System.out.printf("Pay Rate: $%,.2f\n", payRate);
		System.out.printf("Gross Pay: $%,.2f\n", gross);
		System.out.println("Deductions: ");
		System.out.printf("  " + "Federal Witholding " + "(" + federal * 100 + "%%): " + "$%,.2f\n", federalWith);
		System.out.printf("  " + "State Witholding " + "(" + state * 100 + "%%): " + "$%,.2f\n", stateWith);
		System.out.printf("Total Deduction: $%,.2f\n", federalWith + stateWith);
		System.out.printf("Net Pay: $%.2f", gross - totalWith);
	}
}
