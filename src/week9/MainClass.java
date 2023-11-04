package week9;

import java.util.Scanner;

public class MainClass {
	
	public static Scanner scn = new Scanner(System.in);
	
	public void Course(String subject, int studentNumber) {
		System.out.printf("Name of Subject is %s and has %d number of students", subject, studentNumber);
	}
	
	
//	public void Employee(String name, double salary) {
//		System.out.printf("Employee name %s and earning %.2f per hour", name, salary);
//	}
//	
	
	public static void main(String[] args) {
		
		MainClass course = new MainClass();
//		course.Employee("John Doe", 15.99);
		
		System.out.println();
		
		MainClass employee = new MainClass();
		employee.Course("Object Oriented Programming", 50);
		
		System.out.println("\n");
		
		Students s1 = new Students("John", "Doe");
		System.out.println(s1.studentName());
		
		
		Students s2, s3, s4;
		s2 = new Students(513487, "OOP", "NCT");
		s3 = new Students(458794, "ENG", "NCT");
		s4 = new Students(988898, "MATH", "NCT");
		
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		generateEmployee();
	}
	
	public static void generateEmployee() {
		int i = 0;
		Employee em = new Employee();
		while(i<=2) {
			System.out.print("Enter employee name: ");
			String name = scn.next();
			em.setName(name);
			
			System.out.print("Enter location: ");
			String location = scn.next();
			em.setLocation(location);
			
			System.out.print("Enter Salary: ");
			int salary = scn.nextInt();
			em.setSalary(salary);
			
			
			Employee emp = new Employee(em.getName());
			
			Employee emp1 = new Employee(em.getLocation(), em.getSalary());
			
			System.out.println("Employee Information");
			emp.empName();
			emp1.empDetails();
			
			System.out.println("====================================");
			i++;
		}
	}

}
