package buiderDesignPattern.impl;

public class ChickenBurger extends Burger{
	public ChickenBurger() {
		// TODO Auto-generated constructor stub
		System.out.println("ChickenBuger class's constructor.");
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "chickenburger";
	}
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 9.9f;
	}

}
