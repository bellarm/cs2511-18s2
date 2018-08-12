package tut04.refactoring.solution6;

public class NewReleasePrice extends Price {

	@Override
	public double getCharge(int daysRented){
		return daysRented * 3;
	}
	
	public int getFrequentRenterPoints(int daysRented) {
		return (daysRented > 1) ? 2: 1;
	}

}
