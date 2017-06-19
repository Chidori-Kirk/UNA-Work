public class PerfectNumbers {
	public static void main(String[] args){

		System.out.println("The perfect numbers between 1 and 10000 are as follows: ");


		for(int i = 2; i <= 10000; i++){
			if(isPerfect(i)){
				System.out.printf("%4d: %s\n", i, displayFactors(i));
			}
		}



	}

	public static boolean isPerfect(int number){
		boolean result = false;
		int sum = 0;

		for(int i = 1; i <= number / 2; i++){
			if(number % i == 0){
				sum = sum + i;
			}
		}

		if(sum == number){
			result = true;
		}

		return result;


	}

	public static String displayFactors(int perfectNumber){
		String result = "";

		for(int i = 1; i <= perfectNumber / 2; i++){
			if(perfectNumber % i == 0){
				result = result + " " + i;
			}
		}
		return result;
	}
}