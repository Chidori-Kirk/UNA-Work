import java.util.Scanner;

public class PalindromeInteger {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two or more digits: ");
		int number = input.nextInt();
		
		System.out.printf("%d is the number entered in reverse.", reverse(number));
		System.out.printf("\nThe number %d is not a palindrome.", isPalindrome(number));
	}
	
	public static int reverse (int number) {
		int result = 0;
			
		while(number > 0) {
			result = result * 10 + number % 10;
			number = number / 10;
						
		}
			
		return result;
	}
	
	public static boolean isPalindrome(int number){
		   boolean a = true;
		   if(number == reverse(number)){
		       a = false;
		   }
		   
		   return a;
	}
}