package factoryDesignPattern.factorys;

import factoryDesignPattern.abstractFactory.AbstractFactory;
import factoryDesignPattern.imples.Circle;
import factoryDesignPattern.imples.Rectangle;
import factoryDesignPattern.imples.Square;
import factoryDesignPattern.interfaces.Color;
import factoryDesignPattern.interfaces.Shape;

public class ShapeFactory extends AbstractFactory{
	@Override
	public Color getColor(String colorType) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Shape getShape(String shapType){
		if(shapType == null){
			return null;
		} 
		if(shapType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		}
		if(shapType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		if(shapType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		}
		return null;
	}
}
