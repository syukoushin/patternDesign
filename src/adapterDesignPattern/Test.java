package adapterDesignPattern;

public class Test {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "c:\\a.mp3");
		audioPlayer.play("mp4", "c:\\b.mp4");
		audioPlayer.play("flc", "c:\\c.flc");
	}

}
