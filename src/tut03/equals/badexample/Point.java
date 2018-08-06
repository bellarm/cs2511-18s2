package tut03.equals.badexample;
/*
 * A point class defined with two coordinates x,y
 * This class demonstrates an incorrect definition of equals()
 */
public class Point {

	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/*
	 *  This is an in-correct implementation of equals() method
	 *  This method does not override the equals() method in Object
	 *  The equals() method in the Object class takes in a paramter of type Object
	 *  This is a very common mistake made in the implementation of equals()
	 */
	public boolean equals(Object obj) {
		if (!obj.getClass().equals(this.getClass())) {
			return false;
		}
		Point point = (Point) obj;
		if ((this.x == point.x) && (this.y == point.y)) {
			return true;
		}
		return false;
	}
	
	public static void main (String[] args) {
		
		Point p1 = new Point(1,2);
		Point p2 = new Point(1,2);
		
		System.out.println(p1.equals(p2));

		// Why is p3 not equal to p1 ?
		Object p3 = p2;
		System.out.println(p3.equals(p1));
		
	}
	
}
