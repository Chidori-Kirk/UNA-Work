public class RollOneDie {
	public static void main(String [] args) {
		System.out.printf("%4s%12s%13s\n", "Face", "Frequency", "Percentage");
		int [] frequency = new int[7];

		int face = 0;
		for(int i = 1; i <= 36000; i++) {
			face = (int) (1 + Math.random() * 6);
			frequency[face]++;
		}

		for(int i = 1; i < frequency.length; i++) {
			System.out.printf("%4s%12s%12.2f%%\n", i, frequency[i], (double)100 * frequency[i]/ 36000);
		}
	}
}