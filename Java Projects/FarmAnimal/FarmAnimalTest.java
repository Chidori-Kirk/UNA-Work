import java.util.ArrayList;

public class FarmAnimalTest {
	public static void main (String [] args) {
		FarmAnimal animal;
		ArrayList<FarmAnimal>farmAnimals = new ArrayList<>();
		
		farmAnimals.add(animal = new Cat("Missy"));
		farmAnimals.add(animal = new Dog("Lassy"));
		farmAnimals.add(animal = new Cow("Nossy"));
		
		for(int i = 0; i<farmAnimals.size(); i++) {
			System.out.println(farmAnimals.get(i).getName() + ": " + farmAnimals.get(i).talk());
		}
	}
}
