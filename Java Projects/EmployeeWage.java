import java.util.Scanner;

public class EmployeeWage {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int i = 1;
		while(i <= 3) {
			System.out.print("Enter hourly rate: ");
			double hourly = input.nextDouble();
			System.out.print("Enter hours worked: ");
			double hours = input.nextDouble();
			
			if (hours <= 40){
				double gross = hourly * hours;
				System.out.printf("Pay for Employee %d is $%.2f.\n", i, gross);}
			
			else{ 	
				double gross = 40 * hourly + (hours - 40) * hourly * 1.5;
			
			
			System.out.printf("Pay for Employee %d is $%.2f.\n", i, gross);}
			i++;		
		}
	}	
}
