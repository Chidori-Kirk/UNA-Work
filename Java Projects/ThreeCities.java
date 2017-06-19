import java.util.Scanner;

public class ThreeCities {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.print("Enter the second city: ");
		String city2 = input.nextLine();
		System.out.print("Enter the third city: ");
		String city3 = input.nextLine();
		
		if (city1.compareTo(city2)<=0 && city2.compareTo(city3)<=0){
			System.out.printf("The three cities in alphabetical order are %s, %s, and %s\n", city1, city2, city3);
		}
		else if (city1.compareTo(city3)<=0 && city3.compareTo(city2)<=0){
			System.out.printf("The three cities in alphabetical order are %s, %s, and %s\n", city1, city3, city2);
		}
		else if (city2.compareTo(city1)<=0 && city1.compareTo(city3)<=0){
			System.out.printf("The three cities in alphabetical order are %s, %s, and %s\n", city2, city1, city3);
		}
		else if (city2.compareTo(city3)<=0 && city3.compareTo(city1)<=0){
			System.out.printf("The three cities in alphabetical order are %s, %s, and %s\n", city2, city3, city1);
		}
		else if (city3.compareTo(city1)<=0 && city1.compareTo(city2)<=0){
			System.out.printf("The three cities in alphabetical order are %s, %s, and %s\n", city3, city1, city2);
		}
		else if (city3.compareTo(city2)<=0 && city2.compareTo(city1)<=0){
			System.out.printf("The three cities in alphabetical order are %s, %s, and %s\n", city3, city2, city1);
		}
	}	
}
