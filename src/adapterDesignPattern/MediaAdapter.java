package adapterDesignPattern;

public class MediaAdapter implements MediaPlayer{
	AdvancedMediaPlayer advancedMediaPlayer;
	public MediaAdapter(String audioType) {
		
		System.out.printf("%s%n", "This is MediaAdapter class's constructor.");
		switch (audioType) {
		case "mp4":
			advancedMediaPlayer = new Mp4Player();
			break;

		default:
			advancedMediaPlayer = new FlcPlayer();
			break;
		}
		
	}
	@Override
	public void play(String audioType, String filePath) {
		if(audioType.equalsIgnoreCase("mp4")){
			advancedMediaPlayer.playMp4(filePath);
		} else if (audioType.equalsIgnoreCase("flc")) {
			advancedMediaPlayer.playFlc(filePath);
		}
	}
}
