import java.util.Scanner;

public class MbyNMatrix {
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the row dimension of the array: ");
	int row = input.nextInt();
	System.out.print("Enter the column dimension of the array: ");
	int column = input.nextInt();
	int[][] newarray = new int[row][column];
	System.out.println("Enter a 3-by-4 matix of integers row by row: ");
	for(int x = 0; x<row; x++){
		for(int i = 0; i<column; i++){
			newarray[x][i] = input.nextInt();
		}
	}
	System.out.printf("Sum of the matrix is %d.\n", sumMatrix(newarray));
	System.out.printf("Sum of the elements on the main diagonal is %d.\n", sumMainDiagonal(newarray,row,column));
	for(int j = 0; j<row; j++){
		System.out.printf("Sum of the element at row %d is %d.\n", j, sumRow(newarray, j));
	}
	for(int j = 0; j<column; j++){
		System.out.printf("Sum of the elements at column %d is %d.\n", j, sumColumn(newarray, j));
	}
	}
	
	public static int sumMatrix(int[][] m){
		int sum = 0;
		for(int x = 0; x<m.length; x++){
			for(int i = 0; i<m[x].length; i++){
				sum+= m[x][i];
			}
		}
		return sum;
	}
	
	public static int sumMainDiagonal(int[][] m, int p, int n){
		int sum = 0;
		for(int i = 0; i< p; i++){
			sum+= m[i][i];
		}
		return sum;
	}

	public static int sumRow(int[][] m, int r){
		int sum = 0;
		for(int i = 0; i<=m.length; i++){
			sum += m[r][i];
			}
		return sum;
	}
	
	public static int sumColumn(int[][] m, int c) {
		int sum = 0;
		for(int x = 0; x < m.length; x++){
			sum += m[x][c];
		}
		return sum;
	}
	
}