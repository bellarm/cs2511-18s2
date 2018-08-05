package tut02;

public class Rectangle extends Shape {
	public int height;
	public int width;
	
	/**
	 * Constructor with 1 argument.
	 * 
	 * @param color	The color of the shape.
	 */
	public Rectangle(String color) {
		super(color);
		System.out.println("Inside Rectangle constructor with one argument");
	}
	
	/**
	 * Constructor with 3 arguments.
	 * 
	 * @param color
	 * @param width
	 * @param height
	 */
	public Rectangle(String color, int width, int height) {
		this(color);
		this.width = width;
		this.height = height;
		System.out.println("Inside Rectangle constructor with three arguments");
	}
	
	/**
	 * Compute the area of rectangle by multiplying
	 * width and height.
	 */
	public int computeArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle("red", 10, 20);
	}
}
