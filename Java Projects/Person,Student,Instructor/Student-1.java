public class Student extends Person{
  private String major;

  public Student(String n, String byear, String m){
     super(n, byear);
     major = m;
  }

  public String toString(){
    return "\n" + super.toString() + "\nStudent Major: " + major;
  }
}