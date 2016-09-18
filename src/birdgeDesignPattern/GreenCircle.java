package birdgeDesignPattern;

public class GreenCircle implements DrawAPI{
	public GreenCircle() {

		System.out.println("GreenCirlce class's constructor.");
	}
	
	@Override
	public void drawShape(int radius, int x, int y) {
		System.out.printf("This is a GreenCircle raidus = %s, x = %d y = %d.%n", radius, x, y);
	}

}
