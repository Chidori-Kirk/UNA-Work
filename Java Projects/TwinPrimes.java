public class TwinPrimes {
	public static void main(String [] args) {
		for(int i = 2; 1 <= 1000; i++) {
			if(isPrime(i) && isPrime(i + 2)) {
				System.out.printf("(%d, %d)\n", i, i + 2);
			}
		}
	}

	public static boolean isPrime(int num) {
		if(num == 2) {
			return true;
		}
			for(int i = 2; i <= num / 2; i++) {
				if(num % i == 0) {
					return false;
				}
			}

		return true;
	}
}