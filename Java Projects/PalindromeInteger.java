import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		
		//System.out.print(reverse(number));
		System.out.printf("The number %d in reverse order is %d.", number, reverse(number));
		System.out.printf("\nThe number %d is not a palindrome.", number);
	}
	public static int reverse (int number) {
		int result = 0;
		
		while(number > 0) {
			result = result * 10 + number % 10;
			number = number / 10;
					
		}
		
		return result;
	}
}
