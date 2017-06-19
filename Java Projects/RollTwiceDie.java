public class RollTwiceDie {
	public static void main(String [] args) {
		System.out.printf("%4s%20s%18s%21s%19s\n","Sum", "Expected Frequency", "Actual Frequency", "Expected Percentage", "Actual Percentage");
		int[] expectedFreq = {0, 0, 1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
		int[] actualFreq = new int[13];
		
		int face1 = 0, face2 = 0;
		
		for(int i = 0; i < 36000; i++) {
			face1 = (int)(1 + Math.random() * 6);
			face2 = (int)(1 + Math.random() * 6);
			actualFreq[face1 + face2]++;
		}
		
		for(int i = 2; i < actualFreq.length; i++) {
			System.out.printf("%4s%20s%18s%21.2f%%%19.2f%%\n", i, expectedFreq[i], actualFreq[i], (double)100 * expectedFreq[i] / 36.0, (double)100 * actualFreq[i] / 36000.0);
		}
	}
}
