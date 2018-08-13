package tut04.refactoring.demo;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
	private String name;
	private List<Rental> rentals;
	
	public Customer (String name) {
		this.name = name;
		this.rentals = new ArrayList<>();
	}
	
	public void addRental(Rental rental) {
		rentals.add(rental);
	}
	
	public String getName (){
		return name;
	}
	
	/* Discuss problems with this method */
	public String statement() {
		
		double totalAmount = 0;
		String result = "Rental Record for " + getName() + "\n";
		
		for (Rental r: rentals) {
			double thisAmount = r.calcRental();
			
			//show figures for this rental
			result += "\t" + r.getMovie().getTitle() + "\t" + 	String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
			
		}

		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) +	"\n";
		return result;
	}

	public static void main(String[] args) {
		Customer c1 = new Customer("Mary Jane Watson");
		Movie  m = new Movie("Gone with the wind",Movie.REGULAR);
		Rental r = new Rental(m, 3);
		c1.addRental(r);
		
		m = new Movie("Finding Nemo",Movie.CHILDRENS);
		r = new Rental(m, 7);
		c1.addRental(r);
		
		System.out.println(c1.statement());
		
	}
}
