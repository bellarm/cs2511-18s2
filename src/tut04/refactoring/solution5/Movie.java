package tut04.refactoring.solution5;
/*
 * Moving the getCharge method to the class Movie,
 * Encapsulate Field on the type code to ensure that all uses of the type code go through getting
 * and setting methods. Because most of the code came from other classes, most methods already
 * use the getting method. However, the constructors do access the price code 
 */
public class Movie {
	public static final int CHILDRENS = 2;
	public static final int REGULAR = 0;
	public static final int NEW_RELEASE = 1;

	private String title;
	private int priceCode;
	
	public Movie(String title, int priceCode) {
		this.title = title;
		setPriceCode(priceCode);
	}
	
	public int getPriceCode() {
		return priceCode;
	}
	
	public void setPriceCode(int arg) {
		priceCode = arg;
	}
	public String getTitle (){
		return title;
	}

	// Refactor method - refactor getCharge() to class Movie
	double getCharge(int daysRented) {
		double thisAmount = 0;
		int priceCode = getPriceCode();
		switch (priceCode) {
			case Movie.REGULAR:
				thisAmount += 2;
				if (daysRented > 2)
					thisAmount += (daysRented - 2) * 1.5;
			break;
			case Movie.NEW_RELEASE:
				thisAmount += daysRented * 3;
			break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (daysRented > 3)
					thisAmount += (daysRented - 3) * 1.5;
			break;
		}
		return thisAmount;
	}
	
	int getFrequentRenterPoints(int daysRented) {
		
		if ((getPriceCode() == Movie.NEW_RELEASE) && (daysRented > 1)) 
			return 2;
		else 
			return 1;	
	}

	
}