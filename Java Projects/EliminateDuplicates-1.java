import java.util.Scanner;
public class EliminateDuplicates {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter ten numbers: ");
		int[] array = new int [10];
		for(int i = 0; i<array.length; i++) {
			array[i] = input.nextInt();
		}
		
		int [] arrayTwo = eliminateDuplicates(array);
		System.out.print("The distinct numbers are: ");
		for(int i = 0; i <arrayTwo.length; i++) {
			System.out.print(arrayTwo[i] + " ");
			
		}
	}
	
	public static int [] eliminateDuplicates(int [] list) {
		int [] anotherArray = new int [list.length];
		int other = 1;
		anotherArray[0] = list[0];
		for(int j = 1; j<list.length; j++) {
			boolean bool = false;
			for(int k = 0; k<=other; k++) {
				if(list[j] == anotherArray[k]) {
					bool = true;
				}
				
			}
			
			if(!bool) {
				anotherArray[other++] = list[j];	
			}
			
		}
		
		int [] result = new int[other];
		for(int m = 0; m < result.length; m++) {
			result[m] = anotherArray[m];
		}
		
		return result;
	}
}