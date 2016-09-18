package adapterDesignPattern;

public class Mp4Player implements AdvancedMediaPlayer {
	public Mp4Player() {
		// TODO Auto-generated constructor stub
		System.out.println("This is Mp4Player class's constructor.");
	}
	@Override
	public void playFlc(String filePath) {
	}
	@Override
	public void playMp4(String filePath) {
		System.out.printf("Now is playing a mp4 file, file's name is %s.%n",filePath);
	}

}
