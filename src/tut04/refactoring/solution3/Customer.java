package tut04.refactoring.solution3;
/*
 * Refactoring Technique 3: Replace Temp With Query
 * This technique gets rid of unnecessary local variables  
 * For example, the variable thisAmount is not needed, hence wherever a reference is made to the variable thisAmount
 * it has been replaced by a inline method call getCharge(). Now, the temporary variable can be removed.
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
			//show figures for this rental
			// Refactoring technique 3: Replace temp with Query (getting rid of temporary variables)
			// Pay a little performance price but let's optimize calculateRental() in rental class later
			result += "\t" + r.getMovie().getTitle() + "\t" + 	
						String.valueOf(this.getCharge(r)) + "\n";
			totalAmount += this.getCharge(r);
			
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
