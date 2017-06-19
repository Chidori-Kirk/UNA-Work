import java.util.Scanner;

public class NumberPyramid {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int lines = input.nextInt();
		
		if(lines < 1 ||lines > 15) {
			System.out.println("You must enter a number from 1 to 15.");
			System.exit(0);
		}
		else {
			for(int i = 1; i <= lines; i++) {
				for(int j = 1; j <= lines - i; j++) {
					System.out.print("   ");
				}
				
				for(int k = i; k >= 1; k--) {
					System.out.print(k >= 10 ? " " + k : "  " + k);
				}
				
				for(int l = 2; l <= i; l++) {
					System.out.print(l >= 10 ? " " + l : "  " + l);
				}
				
				System.out.println();
			}
		}
	}
}
