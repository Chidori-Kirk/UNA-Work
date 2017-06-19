public class ElectionTest {
	public static void main(String [] args) {
		Election e = createElection();
		
		e.displayCandidates();
	}
	
	private static Election createElection() {
		Election e = new Election();
		
		e.addCandidates(new Candidate("Jeb","Bush",'R'));
		e.addCandidates(new Candidate("Rand","Paul",'R'));
		e.addCandidates(new Candidate("Donald","Trump",'R'));
		
		e.addCandidates(new Candidate("Bernie","Sanders",'D'));
		e.addCandidates(new Candidate("Hillary","Clinton",'D'));
		e.addCandidates(new Candidate("Martin","O'Malley",'D'));
		
		return e;
	}
}
