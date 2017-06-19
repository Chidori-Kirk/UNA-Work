public class Election {
	private Candidate[] candidates;
	//private java.util.Date electionDate;
	
	public Election() {
		candidates = new Candidate[0];
	}
	
	public void addCandidates(Candidate c) {
		Candidate[] temp = new Candidate[candidates.length + 1];
		System.arraycopy(candidates, 0, temp, 0, candidates.length);
		candidates = temp;
		candidates[candidates.length - 1] = c;
	}
	
	public void displayCandidates() {
		for(int i = 0; i< candidates.length; i++){
			System.out.printf("%s %s %c\n", candidates[i].getFirstName(),candidates[i].getLastName(),candidates[i].getParty());
		}
	}
}
