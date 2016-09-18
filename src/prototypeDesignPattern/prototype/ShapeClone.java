package prototypeDesignPattern.prototype;

import java.util.HashMap;

public class ShapeClone {
	private static HashMap<String, Shape> map = new HashMap();
	
	public static void loadShapeCash(){
		Circle circle = new Circle();
		circle.setName("circle");
		circle.setType("circle type");
		map.put("circle", circle);
		Rectangle rectangle = new Rectangle();
		rectangle.setName("rectangle");
		rectangle.setType("rectangle type");
		map.put("rectangle", rectangle);
		Square square = new Square();
		square.setName("square");
		square.setType("square type");
		map.put("square", square);
	}

	public Shape getShapeNoClone(String shapeName){
		return map.get(shapeName);
	}
	public Shape getShape(String shapeName){
		Shape shapeClone = map.get(shapeName);
		return (Shape) shapeClone.clone();
	}
}
