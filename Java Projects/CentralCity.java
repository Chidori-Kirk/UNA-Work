import java.util.Scanner;

public class CentralCity {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        int m = input.nextInt();
        double [][] cities = new double[m][2];
        System.out.print("Enter the coordinates of the cities: ");
        for(int i = 0; i < cities.length; i++) {
        	for(int j = 0; j < cities[i].length; j++) {
        		cities[i][j] = input.nextDouble();
        	}
        }
        
        double[] a = new double[cities.length];
        for(int i = 0; i<cities.length; i++){
        	a[i] = totalDistance(cities,i);
        }
        
        double b = a[0];
		int x = 0;
		for(int i = 1; i < a.length; i++) {
			if(b > a[i]) {
				b = a[i];
				x = i;
			}
		}
        
        System.out.printf("The central city is at(%.2f, %.2f).\n", cities[x][0], cities[x][1]);
        System.out.printf("The total distance to all other cities is %.2f", a[x]);
        
	}
        	

	public static double distance(double [] c1, double [] c2) {	
		return Math.sqrt((c2[0] - c1[0]) * (c2[0] - c1[0]) + (c2[1] - c1[1]) * (c2[1] - c1[1]));
	}
     
	public static double totalDistance(double [][] cities, int i) {
		double result = 0;
		for (int j = 0; j < cities.length; j++) {
			result += distance(cities[j], cities[i]);
		}

		return result;
	}
}