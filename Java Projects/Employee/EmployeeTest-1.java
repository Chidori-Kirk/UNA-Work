
public class EmployeeTest {
	public static void main (String [] args) {
		Employee myEmployee = new Employee("John", "Doe", 3000);
		Employee myEmployee1 = new Employee("Jane", "Doe", 4000);
		
		System.out.println("Before the 10% salary increase:\n");
		System.out.printf("%s %s's monthly salary is $%,.0f and his yearly salary is $%,.0f.\n", myEmployee.getFirstName(), myEmployee.getLastName(), myEmployee.getMonthlySalary(), myEmployee.getMonthlySalary()*12);
		System.out.printf("%s %s's monthly salary is $%,.0f and his yearly salary is $%,.0f.\n", myEmployee1.getFirstName(), myEmployee1.getLastName(), myEmployee1.getMonthlySalary(), myEmployee1.getMonthlySalary()*12);
		System.out.println("\nAfter the 10% salary increase:\n");
		System.out.printf("%s %s's monthly salary is $%,.0f and his yearly salary is $%,.0f.\n", myEmployee.getFirstName(), myEmployee.getLastName(), myEmployee.getMonthlySalary()*1.1, myEmployee.getMonthlySalary()*12*1.1);
		System.out.printf("%s %s's monthly salary is $%,.0f and his yearly salary is $%,.0f.", myEmployee1.getFirstName(), myEmployee1.getLastName(), myEmployee1.getMonthlySalary()*1.1, myEmployee1.getMonthlySalary()*12*1.1);
		
	}
}
