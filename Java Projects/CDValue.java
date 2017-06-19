import java.util.Scanner;
public class CDValue {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the initial deposit amount: ");
		double DA = input.nextDouble();
		System.out.print("Enter the annual percentage yield: ");
		double PY = input.nextDouble();
		System.out.print("Enter the maturity period (number of months): ");
		double MP = input.nextDouble();
	    
		System.out.println("Month CD Value");
		for(int i = 1; i <= MP; i++) {
	         DA = DA + DA * (PY / 100 / 12);
	        System.out.printf("%5d $%,.2f\n", i, DA);
		}
	}
}