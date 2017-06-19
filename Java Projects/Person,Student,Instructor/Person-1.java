public class Person{
	private String name;
	private String yearOfBirth;

	public Person(String n, String birthYear){
	  name = n;
	  yearOfBirth = birthYear;
	}

	public String toString(){
	  return "Person name: " + name + "\nPerson Birth Year: " + yearOfBirth ;
	}
}