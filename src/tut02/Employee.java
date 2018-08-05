package tut02;

import java.time.LocalDate;

public class Employee {
	private String name;
	private float salary;
	
	/**
	 * Constructor with 2 arguments.
	 * 
	 * @param name		name of employee.
	 * @param salary	salary in float.
	 */
	public Employee(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 
	 * @return salary
	 */
	public float getSalary() {
		return salary;
	}
	
	/**
	 * 
	 * @param salary
	 */
	public void setSalary(float salary) {
		if (salary < 0) {
			return;
		}
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Bella", 1000);
		Employee e2 = new Employee("aa", 1000);
		Employee e3 = new Employee("aaa", 1000);
		System.out.println(e1);
		
		LocalDate hireDate = LocalDate.of(2015, 7, 30);
		Manager manager = new Manager("Aarthi", 2000, hireDate);
		
		System.out.println(manager);
		// This should not work.
		// Manager manager2 = new Employee("empl", 1000);
		
		// This works because of polymorphism
		Employee employee = new Manager("Name", 1000, hireDate);
	}
	
	public String toString() {
		// If want to return a string:
		//return "Employee name: " + name;
		return getClass().getName();
	}

}
