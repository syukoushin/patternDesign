package prototypeDesignPattern.prototype;

public class Circle extends Shape{
	public Circle() {
		// TODO Auto-generated constructor stub
		System.out.println("Circle class's constructor.");
	}
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Circle class's draw method.");
	}
	public void showName(){
		System.out.println("circle name");
	}
}
