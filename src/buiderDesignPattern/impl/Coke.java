package buiderDesignPattern.impl;

public class Coke extends ColdDrink{
	public Coke() {
		// TODO Auto-generated constructor stub
		System.out.println("Coke class's constructor.");
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "coke";
	}
	@Override
	public float price() {
		// TODO Auto-generated method stub
		return 6.6f;
	}
}
