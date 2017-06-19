import java.util.Scanner;

public class ARectangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the length and the width of a rectangle: ");
		double length = input.nextDouble();
		double width = input.nextDouble();
		
		double area = length * width;
		double perimeter = 2 * (length + width);
		
		System.out.printf("The area of the rectangle is %.2f.\n",  area);
		System.out.printf("The perimeter of the rectangle is %.2f.",  perimeter);
	}
}