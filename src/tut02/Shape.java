package tut02;

public class Shape {
	public String color;
	
	/**
	 * Shape constructor with 1 argument.
	 *  
	 * @param color The color of the shape.
	 */
	public Shape(String color) {
		System.out.println("Inside Shape constructor");
		this.color = color;
	}
	
	/**
	 * An area to calculate method. Ideally would be overriden
	 * by classes that extend Shape. 
	 * 
	 * @return area
	 */
	public int computeArea() {
		return 0;
	}
}
