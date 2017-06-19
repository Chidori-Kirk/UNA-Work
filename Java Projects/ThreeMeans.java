import java.util.Scanner;

public class ThreeMeans {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two positive floating-point numbers: ");
		double number1  = input.nextDouble();
		double number2 = input.nextDouble();
		
		double arithmeticMean = (number1 + number2) / 2.0;
		double geometricMean = Math.sqrt(number1 * number2);
		double harmonicMean = (2.0 * number1 * number2) / (number1 + number2);
		
		System.out.printf("The arithmetic mean is %.2f.\n", arithmeticMean);
		System.out.printf("The geometric mean is %.2f.\n", geometricMean);
		System.out.printf("The harmonic mean is %.2f.", harmonicMean);
	}
}