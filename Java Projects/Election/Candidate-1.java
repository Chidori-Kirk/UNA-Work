public class Candidate {
	private String firstName;
	private String lastName;
	private char party;
	private boolean trustworthy;
	
	Candidate() {
		
	}
	
	Candidate(String firstName, String lastName, char party) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.party = party;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	public String getLastName() {
		return this.firstName;
	}
	
	public void setParty(char party) {
		this.party = party;
	}
	
	public char getParty() {
		return this.party;
	}
	
	public void setTrustWorthy(boolean trustWorthy) {
		this.trustworthy = trustworthy;
	}
	
	public boolean getTrustworthy() {
		return this.trustworthy;
	}
	
}