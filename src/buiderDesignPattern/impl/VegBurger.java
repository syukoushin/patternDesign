package buiderDesignPattern.impl;

public class VegBurger extends Burger{
	public VegBurger() {
		// TODO Auto-generated constructor stub
		System.out.println("VegBurger class's constructor.");
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "vegburger";
	}
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 8.8f;
	}

}
