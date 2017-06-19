import java.util.Scanner;

public class PayrollConsole {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter employee's name: ");
		String name = input.nextLine();
		System.out.print("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		System.out.print("Enter hourly pay rate: ");
		double pay = input.nextDouble();
		System.out.print("Enter federal tax withholding rate: ");
		double federal = input.nextDouble();
		System.out.print("Enter state tax withholding rate: ");
		double state = input.nextDouble();
		
		System.out.println("Employee Name: " + name);
		
		System.out.printf("Hours Worked: %.2f\n", hours);
		
		System.out.printf("Pay Rate: $%.2f\n", pay);
		
		double gross = (hours * pay);
		System.out.printf("Gross Pay: $%.2f\n", gross);
		
		federal = (gross * federal);
		System.out.printf("Federal Withholding (20.00%%): $%.2f\n", federal);
		
		state = (gross * state);
		System.out.printf("State Withholding (9.00%%): $%.2f\n", state);
		
		double total = (federal + state);
		System.out.printf("Total Deduction: $%.2f\n", total);
		
		double net = (gross - total);
		System.out.printf("Net Pay: $%.2f\n", net);
			
		
	}
}
