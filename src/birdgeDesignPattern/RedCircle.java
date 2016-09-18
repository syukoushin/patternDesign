package birdgeDesignPattern;

public class RedCircle implements DrawAPI {

	public RedCircle() {
		System.out.println("RedCicle class's constructer.");
	}
	
	@Override
	public void drawShape(int radius, int x, int y) {
		// TODO Auto-generated method stub
		System.out.printf("This is a RedCirlce raidus = %s, x = %d y = %d.%n", radius, x, y);
	}

}
