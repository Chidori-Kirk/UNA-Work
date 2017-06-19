import java.util.Scanner;
public class DisplayMatrix {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter n: ");
		String name = input.nextLine();
		printMatrix(7);
	}

	public static void printMatrix(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int number = (int)(Math.random() * n);
				System.out.printf((int)(Math.random() * n) + " ");
			}
			System.out.println();
		}
	} 
}