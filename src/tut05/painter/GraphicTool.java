package tut05.painter;

import tut05.shapes.Circle;
import tut05.shapes.Rectangle;
import tut05.shapes.Shape;

public class GraphicTool implements Painter {

	public double printShapeInfo(Shape s) {
		if (s instanceof Rectangle) {
			Rectangle r = (Rectangle) s;
			r.setHeight(10);
			r.setWidth(2);
		}
		else if ( s instanceof Circle) {
			// Typecasting s to Circle.
			((Circle) s).setRadius(6);
		}
		return s.getArea();
	}

	@Override
	public void paint(Object o) {
		// Code for graphic tool to paint shapes
	}	

	@Override
	public String getPainterType() {
		return "GraphicTool";

	}

	public static void main(String[] args) {
		GraphicTool tool = new GraphicTool();	
		Shape s = new Rectangle("red");
		System.out.println(tool.printShapeInfo(s));
		tool.paint(s);
		System.out.println(tool.getPainterType());
		System.out.println(s);
	}

}