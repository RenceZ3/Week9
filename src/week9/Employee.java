package week9;

public class Employee {
	private String name;
	private String location;
	private int salary;
	Employee() {
		
	}
	
	Employee(String name) {
		this.name = name;
	}
	
	Employee(String location, int salary) {
		this.location = location;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void empName() {
		System.out.println("Employee Name: "+name);
	}
	
	public void empDetails() {
		System.out.println("Employee Location: " + location);
		System.out.println("Employee Salary: " + salary);
	}
	
	@Override
	public String toString() {
		return "\nEmployee Information \n"
				+ "Employee Name: " + name + "\n"
						+ "Employee Location: " + location + "\n"
								+ "Employee Salary: " + salary + "\n"
										+ "=====================================\n";
	}
	

}
