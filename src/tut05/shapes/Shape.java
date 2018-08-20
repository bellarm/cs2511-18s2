package tut05.shapes;

/* Base class Shape that stores color and area
 *   
 */
public abstract class Shape {

	private String color;

	public Shape(String color) {
		this.color = color;
	}

	/**
	 * @return the area
	 */
	public abstract double getArea() ;

	@Override
	public String toString() {
		return "I am a " + this.getClass().getSimpleName() 
				+ " and my color is: " + this.color;
	}	 	
}