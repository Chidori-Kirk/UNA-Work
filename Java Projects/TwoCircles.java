import java.util.Scanner;
public class TwoCircles {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Circle 1’s center x-, y-coordinates, and radius:");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		double r1 = input.nextDouble();
		System.out.print("Enter Circle 2’s center x-, y-coordinates, and radius:");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		double r2 = input.nextDouble();
		double distance = Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5);
		if ((r1 >= r2) && (distance <= r2 -r1)) 
			System.out.println("Circle 1 is inside Circle 2.");
		
		else if ((r1>=r2) && (distance <= r1-r2)) 
			System.out.println("Circle 2 is inside Circle 1.");
		
		else if ((distance <= r1 + r2) && (r1!=r2)) 
			System.out.println("Circle 2 overlaps Circle 1.");
		
		else 
			System.out.println("Circle 2 does not overlap Circle 1.");
		
	}
}