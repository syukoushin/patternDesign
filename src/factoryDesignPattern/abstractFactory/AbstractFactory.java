package factoryDesignPattern.abstractFactory;

import factoryDesignPattern.interfaces.Color;
import factoryDesignPattern.interfaces.Shape;

public abstract class AbstractFactory {

	public abstract Color getColor(String colorType);
	public abstract Shape getShape(String shapeType);
}
