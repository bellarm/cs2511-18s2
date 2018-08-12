package tut04.refactoring.solution2;
/*
 * Refactoring Technique 2: Move Method
 * In this refactoring, as the calculateRental() method takes in a parameter of type Rental and does 
 * not use any data from the class Customer, it is clear that the method is on the wrong object
 * Hence, the calculateRental() method has been moved to the class Rental and is called as getCharge()
 * in the class Rental.
 */
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
	
	public String statement() {
		
		double totalAmount = 0;
		String result = "Rental Record for " + getName() + "\n";
		
		for (Rental r: rentals) {
			double thisAmount = 0;
			// Refactoring technique 2: Move Method
			// calculate rental amount method is moved to the Rental class
			thisAmount = r.calcRentalAmount();
			//show figures for this rental
			result += "\t" + r.getMovie().getTitle() + "\t" + 	String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
			
		}

		//add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) +	"\n";
		return result;
	}

	// Two options: Sometimes leave the old method to delegate to the old method.  This is useful if it is a public
	// method 
	private double getCharge(Rental r) {
		return r.calcRentalAmount();
	}
}
