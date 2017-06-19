import java.util.Scanner;

public class DayOfTheWeek {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = input.nextInt();
		System.out.print("Enter the month: 1-12: ");
		int m = input.nextInt();
		System.out.print("Enter the day of the month: 1-31: ");
		int q = input.nextInt();
		if (m==1) {
		m=13;
		year = (year - 1);
		}
		else if (m==2) {
		m=14;
		year = (year - 1);
		}
		int j = (year / 100);
		int k = (year % 100);
		int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
		String daystring="";
		switch (h) {
		case 0: daystring = "Saturday";
		break;
		case 1: daystring = "Sunday";
		break;
		case 2: daystring = "Monday";
		break;
		case 3: daystring = "Tuesday";
		break;
		case 4: daystring = "Wednesday";
		break;
		case 5: daystring = "Thursday";
		break;
		case 6: daystring = "Friday";
		break;
		}
		System.out.println("Day of the week is " + daystring + ".");
		
	}
}