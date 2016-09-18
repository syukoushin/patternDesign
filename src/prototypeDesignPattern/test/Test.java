package prototypeDesignPattern.test;

import prototypeDesignPattern.prototype.Shape;
import prototypeDesignPattern.prototype.ShapeClone;

public class Test {
	public static void main(String[] args) {
		ShapeClone clone = new ShapeClone();
		ShapeClone.loadShapeCash();
		Shape circle = clone.getShape("circle");
		System.out.println("circle'name is " + circle.getName()+", cirlce's type is " + circle.getType());
		
		Shape circle2 = clone.getShapeNoClone("circle");
		circle2.setType("update type");
		System.out.println(clone.getShapeNoClone("circle").getType());
		System.out.println(clone.getShape("circle").getType());
		Shape circle3 = clone.getShape("circle");
		circle3.setType("xxxxx");
		System.out.println(circle3.getType());
		System.out.println(clone.getShapeNoClone("circle").getType());
		
	}

}
