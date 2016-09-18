package buiderDesignPattern.impl;

import buiderDesignPattern.interfaces.Item;
import buiderDesignPattern.interfaces.Packing;

public abstract class ColdDrink implements Item{

	public ColdDrink() {
		// TODO Auto-generated constructor stub
		System.out.println("ColdDrink class's constructor.");
	}
	@Override
	public abstract float price();
	
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Bottle();
	}
	
	
}
