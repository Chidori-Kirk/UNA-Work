import java.util.Scanner;

public class TheRockPaperScissorsGame {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int number0 = input.nextInt();
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
		
		int Rock = number0;
		
		if (Rock == 0) {
			System.out.println("The computer is Scissors. You are Rock. You win.");
		}
		
		int Paper = number1;
		
		if (Paper == 1) {
			System.out.println("The computer is Paper. You are Paper. It is a draw.");
		}
		
		int Scissors = number2;
		
		if (Scissors == 2) {
			System.out.println("The computer is Rock. You are Scissors. You lose.");
		}
		
		int InvalidInput = number3;
		
		if (InvalidInput == 3) {
			System.out.println("Invalid input. Play again.");
			
			input.close();
		}
	}
}
