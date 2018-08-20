package tut05.shapes;

public class Square extends Shape {

	private int side; 
	
	public Square(String color) {
		super(color);
	}

	public void setSide(int aSide) {
		side = aSide;
	}
	
	@Override
	public double getArea() {
		return this.side * this.side;
	}

	@Override
	public String toString() {
		return super.toString() 
				+ " and my area is: " + this.getArea();
	}
	
}