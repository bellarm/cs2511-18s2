package tut03.equals.employee;

import java.time.LocalDate;

public class Manager extends Employee {
	private LocalDate hireDate;
	
	/**
	 * Constructor with 3 arguments.
	 * 
	 * @param name		name of the employee.
	 * @param salary	salary in float.
	 * @param hireDate	the date manager started working.
	 */
	public Manager(String name, float salary, LocalDate hireDate) {
		super(name, salary);
		this.hireDate = hireDate;
	}
	
	/**
	 * @return hireDate
	 */
	public LocalDate getHireDate() {
		return hireDate;
	}
	
	/**
	 * @param hireDate	a LocalData object of the starting date.
	 */
	public void setHireDate(LocalDate hireDate) {
		// Creating a LocalDate object:
		// LocalDate date = LocalDate.of(year, month, day);
		this.hireDate = hireDate;
	}
	
	public String toString() {
		return "Manager name: " + getName();
	}
	

	public boolean equals(Object obj) {
		if (!obj.getClass().equals(this.getClass())) {
			return false;
		}

		Manager manager = (Manager) obj;
		if (super.equals(obj)
				&& this.hireDate.equals(manager.hireDate)) {
			return true;
		}
		return false;
	}

}
