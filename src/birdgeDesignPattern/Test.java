package birdgeDesignPattern;

public class Test {
	
	public static void main(String[] args) {
		Circle redCircle = new Circle(10, 4, 6, new RedCircle());
		Circle greenCircle = new Circle(100, 40, 60, new GreenCircle());
		redCircle.draw();
		greenCircle.draw();
	}

}
