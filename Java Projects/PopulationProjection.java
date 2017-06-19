public class PopulationProjection {
	public static void main (String [] args) {
		
		double currentPopulation = 312032486;
		double calculation = (60 * 60 * 24 * 365);
		
		double fiveYearBirth =  calculation / 7;
		double fiveYearDeath = calculation / 13;
		double fiveYearImmigrant = calculation / 45;
		
		for (int i = 1; i<6; i++) {
			currentPopulation += (fiveYearBirth + fiveYearImmigrant - fiveYearDeath) * i;
			System.out.printf("In year "+ i +" the population is %,.2f\n",currentPopulation);
		}
	}	
}
