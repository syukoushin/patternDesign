package factoryDesignPattern.test;

import factoryDesignPattern.abstractFactory.AbstractFactory;
import factoryDesignPattern.fatoryProducer.FactoryProducer;
import factoryDesignPattern.interfaces.Color;
import factoryDesignPattern.interfaces.Shape;

public class FactoryTest {
	
	public static void main(String[] args) {
		
		//get shape factory
		AbstractFactory shapeAbstractFacotry = FactoryProducer.getAbstractFacotry("shape");
		
		//get circle
		Shape circleShape = shapeAbstractFacotry.getShape("circle");
		circleShape.draw();
		
		//get square 
		Shape squareShape = shapeAbstractFacotry.getShape("square");
		squareShape.draw();
		
		//get rectangle
		Shape rectangleShape = shapeAbstractFacotry.getShape("rectangle");
		rectangleShape.draw();
		
		//get color factory
		AbstractFactory colorAbstractFacotry = FactoryProducer.getAbstractFacotry("color");
		
		//get red
		Color redColor = colorAbstractFacotry.getColor("red");
		redColor.fill();
		
		//get blue
		Color blueColor = colorAbstractFacotry.getColor("blue");
		blueColor.fill();
		
		//get green
		Color greenColor = colorAbstractFacotry.getColor("green");
		greenColor.fill();
		
	}

}
