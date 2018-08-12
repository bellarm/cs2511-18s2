package tut04.refactoring.solution6;
/*
 * Using the Replace Type Code with Strategy/State Pattern
 * Using the Replace conditional logic with Polymorphism
 * Here, as the price of the movie depends upon the classification and is subject to change, we apply the principle
 * "encapsulate what varies" and "composition".  Move the price changing behaviour to a separate class, and then
 * apply strategy/state pattern to achieve polymorphism when calculating charge.
 */

public class Movie {	
	private String title;
	private Price price;
	
	public Movie(String title, Price priceCode) {
		this.title = title;
		this.price = priceCode;
	}
	
	public Price getPriceCode() {
		return price;
	}
	
	public void setPriceCode(Price priceCode) {
		price = priceCode;
	}
	public String getTitle (){
		return title;
	}

	// Refactor method - refactor getCharge() to class Movie
	double getCharge(int daysRented) {
		return price.getCharge(daysRented);
	}
	
	
}