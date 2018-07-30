package tut02;

import java.time.LocalDate;

public class Manager extends Employee {
	private LocalDate hireDate;
	
	public Manager(String name, float salary, LocalDate hireDate) {
		super(name, salary);
		this.hireDate = hireDate;
	}
	
	public LocalDate getHireDate() {
		return hireDate;
	}
	
	public void setHireDate(LocalDate hireDate) {
		// Creating a LocalDate object:
		// LocalDate date = LocalDate.of(year, month, day);
		this.hireDate = hireDate;
	}
	
	public String toString() {
		return "Manager name: " + getName();
	}

}
