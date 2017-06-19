import java.util.Scanner;

public class EliminateDuplicates {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int [] myArray = new int [10];
		for(int i = 0; i < myArray.length; i++) {
			myArray[i] = input.nextInt();
		}
	
	
		int [] newArray =  eliminateDuplicates(myArray);
	
		System.out.print("The distinct numbers are: ");
		for(int i = 0; i < newArray.length; i++) {
			System.out.print(newArray[i] + " ");
		}
	}
	
	public static int [] eliminateDuplicates(int [] list) {
		int [] tempArray = new int[list.length];
		tempArray[0] = list[0];
		int size = 1;
		for(int i = 1; i < list.length; i++) {
			boolean isInArray = false;
			for(int j = 0; j < size; j++) {
				if(list[i] == tempArray[j]) {
					isInArray = true;
				}
			}
			
			if(!isInArray) {
				tempArray[size++] = list[i];	
			}
		}
			int [] resultArray = new int[size];
			for(int k = 0; k < resultArray.length; k++) {
				resultArray[k] = tempArray[k];
			}	
		
return resultArray;	}
}		