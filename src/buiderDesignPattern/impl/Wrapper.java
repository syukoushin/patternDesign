package buiderDesignPattern.impl;

import static java.lang.System.out;

import buiderDesignPattern.interfaces.Packing;

public class Wrapper implements Packing{
	public Wrapper() {
		// TODO Auto-generated constructor stub
		out.println("Wrapper class's constructor method.");
	}
	@Override
	public String pack() {
		// TODO Auto-generated method stub
		out.println("Warpper's pack method.");
		return "Wrapper";
	}

}
