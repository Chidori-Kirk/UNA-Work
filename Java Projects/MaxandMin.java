import java.util.Scanner;

public class MaxandMin {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.print("Enter three different integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		int max = number1;
		
		if(max < number2) {
			max = number2;	
		}
		
		if(max < number3) {	
			max = number3;
		}
	
		System.out.printf("The largest number is %d.\n", max);
		
		int min = number2;
		
		if(min > number3) {
			min = number3;	
		}
		
		if(min > number1) {	
			min = number1;
		}
	
		System.out.printf("The smallest number is %d.\n", min);
	}
}