package adapterDesignPattern;

public class AudioPlayer implements MediaPlayer{
	MediaAdapter mediaAdapter;
	
	public AudioPlayer() {
		// TODO Auto-generated constructor stub
		System.out.println("AudioPlayer's class constructor");
	}
	@Override
	public void play(String audioType, String filePath) {
		// TODO Auto-generated method stub
		System.out.printf("Audio Type is %s, filepath is '%s'.%n",audioType,filePath);
		if(audioType.equalsIgnoreCase("mp3")){
			System.out.printf("Now is playing a mp3 file, filename is %s.%n",filePath);
			
		} else if (audioType.equalsIgnoreCase("mp4") || audioType.equalsIgnoreCase("flc")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, filePath);
			
		} else {
			System.out.printf("Invalid media. %s format not supproted.",audioType);
		}
	}
}
