package buiderDesignPattern.impl;

import buiderDesignPattern.interfaces.Item;
import buiderDesignPattern.interfaces.Packing;

public abstract class Burger implements Item {
	public Burger() {
		// TODO Auto-generated constructor stub
		System.out.println("Burger class's constructor.");
	}
	@Override
	public Packing packing() {
		// TODO Auto-generated method stub
		return new Wrapper();
	}
	@Override
	public abstract float price();
	

}
