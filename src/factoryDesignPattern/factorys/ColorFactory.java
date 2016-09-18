package factoryDesignPattern.factorys;

import factoryDesignPattern.abstractFactory.AbstractFactory;
import factoryDesignPattern.imples.Blue;
import factoryDesignPattern.imples.Green;
import factoryDesignPattern.imples.Red;
import factoryDesignPattern.interfaces.Color;
import factoryDesignPattern.interfaces.Shape;

public class ColorFactory extends AbstractFactory{

	@Override
	public Color getColor(String colorType){
		if(colorType == null){
			return null;
		}
		if(colorType.equalsIgnoreCase("RED")){
			return new Red();
		}
		if(colorType.equalsIgnoreCase("GREEN")){
			return new Green();
		}
		if(colorType.equalsIgnoreCase("BLUE")){
			return new Blue();
		}
		return null;
	}

	@Override
	public Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}
}
