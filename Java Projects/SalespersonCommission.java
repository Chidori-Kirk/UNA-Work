import java.util.Scanner;

public class SalespersonCommission {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter numbers sold of products #1, #2, #3, and #4, in sequence: ");
		int item1 = input.nextInt();
		int item2 = input.nextInt();
		int item3 = input.nextInt();
		int item4 = input.nextInt();
		
		final double ITEM1PRICE = 239.99;
		final double ITEM2PRICE = 129.75;
		final double ITEM3PRICE = 99.95;
		final double ITEM4PRICE = 350.89;
		
		double grossSales = ITEM1PRICE * item1 + ITEM2PRICE * item2 + ITEM3PRICE * item3 + ITEM4PRICE * item4;
		
		System.out.printf("Gross sales this week: %,.2f\n", grossSales);
		
		double Commision = grossSales * .09;
		
		System.out.printf("Commission earned this week: %,.2f\n", Commision);
		
		double totalEarnings = Commision + 200;
		
		System.out.printf("Total earnings this week: %,.2f\n", totalEarnings );
	}
}