abstract class FarmAnimalBase implements FarmAnimal {
	private final String name;
	
	public FarmAnimalBase(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
