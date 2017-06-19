import java.util.Scanner;

public class StudentMajorAndStatus{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Ener two characters: ");
		String twoChars = input.next();
		
		char major = twoChars.charAt(0);
		char status = twoChars.charAt(1);
		
		if(major != 'M' && major != 'C' && major !='I' || status != '1' && status != '2' && status != '3' && status != '4'){
			System.out.println("Invalid input");
			System.exit(0);
		}
		else {
			String first = "";
			String second = "";
			
			if(major == 'M')
				first = "Mathematics";
			else if(major == 'C')
				first = "Computer Science";
			else
				first = "Information Technology";
			
			if(status == '1')
				second = "Freshman";
			else if(status == '2')
				second = "Sophmore";
			else if(status == '3')
				second = "Junior";
			else
				second = "Senior";
			
			System.out.println(first + " " + second);
		}
	}
}