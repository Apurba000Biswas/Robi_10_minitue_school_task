import java.util.ArrayList;
import java.util.List;

public class Chapter extends Item{
	private Document document;
	private List<Audio> audioList;
	private List<Video> videoList;
	
	
	public Chapter(String chName, Document document) {
		super(chName);
		this.document = document;
		audioList = new ArrayList<Audio>();
		videoList = new ArrayList<Video>();
	}
	
	public Document getDocument() {
		return this.document;
	}
	
	public List<Audio> getAudioes(){
		return this.audioList;
	}
	
	public List<Video> getVideoes(){
		return this.videoList;
	}
	
	public void addVideo(Video video) {
		videoList.add(video);
	}
	
	public void addAudio(Audio audio) {
		audioList.add(audio);
	}
	
}
