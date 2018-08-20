package tut05.shapes;

public class Circle extends Shape {
	private int radius;

	public Circle(String color) {
		super(color);
	}

	public void setRadius(int r) {
		this.radius = r;
	}

	@Override
	public double getArea() {	
		return Math.PI * radius * radius;
	}

	@Override
	public String toString() {
		return super.toString() 
				+ " and my area is: " + this.getArea();
	}	

}
