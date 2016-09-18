package birdgeDesignPattern;

public class Circle extends Shape{

	private int radius, x ,y;
	private DrawAPI drawAPI;
	
	public Circle(int radius, int x,int y,DrawAPI drawAPI) {
		this.drawAPI = drawAPI;
		this.radius = radius;
		this.x = x;
		this.y = y;
		System.out.println("Circle class's constructor.");
	}
	
	@Override
	public void draw() {
		drawAPI.drawShape(radius, x, y);
	}
}
