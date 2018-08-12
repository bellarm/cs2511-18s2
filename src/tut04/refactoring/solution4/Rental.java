package tut04.refactoring.solution4;

public class Rental {
	private Movie movie;
	private int daysRented;
	
	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return daysRented;
	}
	
	public Movie getMovie() {
		return movie;
	}

	double getCharge() {
		double thisAmount = 0;
		int priceCode = getMovie().getPriceCode();
		switch (priceCode) {
			// Class rental is tightly coupled with class Movie - switch statement based on the data of another object
			// is a bad idea
			// getCharge() must be moved to class Movie
			case Movie.REGULAR:
				thisAmount += 2;
				if (getDaysRented() > 2)
					thisAmount += (getDaysRented() - 2) * 1.5;
			break;
			case Movie.NEW_RELEASE:
				thisAmount += getDaysRented() * 3;
			break;
			case Movie.CHILDRENS:
				thisAmount += 1.5;
				if (getDaysRented() > 3)
					thisAmount += (getDaysRented() - 3) * 1.5;
			break;
		}
		return thisAmount;
	}

	int getFrequentRenterPoints() {
		if (movie.getPriceCode() == Movie.NEW_RELEASE && (daysRented > 1)) 
			return 2;
		else 
			return 1;	
	}


}
