import java.util.Scanner;

public class TwoIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two positive integers:");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		int sum = number1 + number2;
		int difference = number1 - number2;
		int product = number1 * number2;
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		
		/*The sum is 8.
		The product is 15.
		The difference is 2.
		The quotient is 1.
		The remainder is 2.*/
		System.out.println("The sum is " + sum +".");
		System.out.println("The product is " + product +".");
		System.out.println("The difference is " + difference + ".");
		System.out.println("The quotient is " + quotient +".");
		System.out.println("The remainder is " + remainder + ".");
	}
}