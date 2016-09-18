package buiderDesignPattern.impl;

import buiderDesignPattern.interfaces.Packing;

public class Bottle implements Packing{
	public Bottle() {
		// TODO Auto-generated constructor stub
		System.out.println("Bottle's constructor.");
	}
	@Override
	public String pack() {
		// TODO Auto-generated method stub
		
		return "Bottle";
	}

}
