package factoryDesignPattern.fatoryProducer;

import factoryDesignPattern.abstractFactory.AbstractFactory;
import factoryDesignPattern.factorys.ColorFactory;
import factoryDesignPattern.factorys.ShapeFactory;

public class FactoryProducer {
	
	public static AbstractFactory getAbstractFacotry(String factoryType){
		if(factoryType.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		}
		if(factoryType.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}
		return null;
	}

}
