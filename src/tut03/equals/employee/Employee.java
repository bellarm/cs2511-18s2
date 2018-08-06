package tut03.equals.employee;

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
//		Employee e1 = new Employee("Bella", 1000);
//		Employee e2 = new Employee("aa", 1000);
//		Employee e3 = new Employee("aaa", 1000);
//		System.out.println(e1);
//		
		LocalDate hireDate = LocalDate.of(2015, 7, 30);
//		Manager manager = new Manager("Aarthi", 2000, hireDate);
//		
//		System.out.println(manager);
//		// This should not work.
//		// Manager manager2 = new Employee("empl", 1000);
		
		// This works because of polymorphism
//		Employee employee = new Manager("Name", 1000, hireDate);
		Employee e1 = new Employee("bella", 1000);
		Employee e2 = new Employee("bella", 1000);
		// Reflexive.
		System.out.println(e1.equals(e1));
		// Symmetry.
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e1));
		// Transitive
		Employee e3 = new Employee("a", 1000);
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e1.equals(e3));
		
		Manager m1 = new Manager("a", 1000, hireDate);
		Manager m2 = new Manager("a", 1000, hireDate);
		System.out.println("m1 equals m2: " + m1.equals(m2));
		
		System.out.println("m1 equals e3: " + m1.equals(e3));

		System.out.println("e3 equals m1: " + e3.equals(m1));		
		
		
		

	}
	
	public String toString() {
		// If want to return a string:
		//return "Employee name: " + name;
		return getClass().getName();
	}
	
	public boolean equals(Object obj) {
		if (!obj.getClass().equals(this.getClass())) {
			return false;
		}
		Employee e = (Manager) obj;
		if (this.name.equals(e.name) && 
				(Float.compare(this.salary, e.salary) == 0)) {
			return true;
		}
		return false;
	}
	
}
