public class PersonTest{
  public static void main(String[] args){
    Person p = new Person("John Doe", "1960");
    Student s = new Student("Emily Zhang", "2007", "Finance");
    Instructor i = new Instructor("Paul Zhang", "1970", 50000);
    System.out.println(p);
    System.out.println(s);
    System.out.println(i);
  }
}