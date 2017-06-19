public class Instructor extends Person{
	private double salary;

	public Instructor(String n, String byear, double s){
      super(n, byear);
      salary = s;
      String.format("%,.2f",s);
    }

    public String toString(){
      return "\n" + super.toString() + "\nInstructor Salary: $" + salary + "0";

    }
}