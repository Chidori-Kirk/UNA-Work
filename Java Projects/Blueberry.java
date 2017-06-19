public class Blueberry {
	public static void main(String [] args){
			int blueCount = 0;
			int berryCount = 0;
			int blueberryCount = 0;
			int a = 1;
			int b = 3;
			int c = 5;
			System.out.println("The following is from a while loop: ");
			while (a<=100){
				if (a%15 == 0) {
					System.out.printf("%3d %s\n", a, "Blueberry");
					blueberryCount++;
				}
				else if (a%b == 0) {
					System.out.printf("%3d %s\n", a, "Blue");
					blueCount++;
				}
				else if (a%c == 0) {
					System.out.printf("%3d %s\n", a, "Berry");
					berryCount++;
				}
				else {
					System.out.printf("%3d\n", a);
				}
				a++;
			}

			System.out.printf("There are %d Blues.\n", blueCount);
			System.out.printf("There are %d Berries.\n", berryCount);
			System.out.printf("There are %d Blueberries.\n", blueberryCount);

			System.out.printf("\nThe following is from a for loop: \n");
			
			blueCount = 0;
			berryCount = 0;
			blueberryCount = 0;
			
			for (a = 1; a<= 100; a++) {
				if(a%15 == 0) {
					System.out.printf("%3d %s\n", a, "Blueberry");
					blueberryCount++;
				}
				else if (a%b == 0) {
					System.out.printf("%3d %s\n", a, "Blue");
					blueCount++;
				}
				else if (a%c == 0) {
					System.out.printf("%3d %s\n", a, "Berry");
					berryCount++;
				}
				else {
					System.out.printf("%3d\n", a);
				}
			}
			
			System.out.printf("There are %d Blues.\n", blueCount);
			System.out.printf("There are %d Berries.\n", berryCount);
			System.out.printf("There are %d Blueberries.\n", blueberryCount);
			
			System.out.println("\nThe following is from a do...while loop: ");
			a = 1;
			b = 3;
			c = 5;
			blueCount = 0;
			berryCount = 0;
			blueberryCount = 0;
			
			do {
				if(a%15 == 0) {
					System.out.printf("%3d %s\n", a, "Blueberry");
					blueberryCount++;
				}
				else if (a%b == 0) {
					System.out.printf("%3d %s\n", a, "Blue");
					blueCount++;
				}
				else if (a%c == 0) {
					System.out.printf("%3d %s\n", a, "Berry");
					berryCount++;
				}
				else {
					System.out.printf("%3d\n", a);
				}
				a++;
			}while(a<=100);
			
			System.out.printf("There are %d Blues.\n", blueCount);
			System.out.printf("There are %d Berries.\n", berryCount);
			System.out.printf("There are %d Blueberries.\n", blueberryCount);
	}
}