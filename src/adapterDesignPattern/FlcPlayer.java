package adapterDesignPattern;

public class FlcPlayer implements AdvancedMediaPlayer {

	public FlcPlayer() {
		System.out.println("This is FlcPlayer class's constructor.");
	}
	@Override
	public void playFlc(String filePath) {
		System.out.printf("Now is playing a flc file, filename is %s.%n",filePath);
	}

	@Override
	public void playMp4(String filePath) {

	}

}
