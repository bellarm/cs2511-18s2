package tut02;

public class Rectangle extends Shape {
	public int height;
	public int width;
	
	public Rectangle(String color) {
		super(color);
		System.out.println("Inside Rectangle constructor with one argument");
	}
	
	public Rectangle(String color, int width, int height) {
		this(color);
		this.width = width;
		this.height = height;
		System.out.println("Inside Rectangle constructor with three arguments");
	}
	
	public int computeArea() {
		return width*height;
	}
	
	public static void main(String[] args) {
		Rectangle r = new Rectangle("red",10,20);
	}
}
