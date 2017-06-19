import java.util.Scanner;

public class CostofDriving {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter the distance to drive in miles:");
		double distance = input.nextDouble();
		System.out.print("Enter the miles per gallon:");
		double miles = input.nextDouble();
		System.out.print("Enter the price per gallon:");
		double price = input.nextDouble();
		
		double cost = (distance / miles) * price;
		System.out.printf("The cost of driving is %,.2f.", cost);
	}	
}
