import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Main start = new Main();
		List<Item> items = start.buildDataSet();
		start.printItems(items);
	}
	
	private List<Item> buildDataSet() {
		List<Item> items = new ArrayList<Item>();
		Chapter chapter1 = new Chapter("Chapter 1", new Document("Document 1_1"));
		chapter1.addVideo(new Video("Video 1_1"));
		chapter1.addVideo(new Video("Video 1_2"));
		
		Chapter chapter2 = new Chapter("Chapter 2", new Document("Document 2_1"));
		chapter2.addVideo(new Video("Video 2_1"));
		chapter2.addVideo(new Video("Video 2_2"));
		chapter2.addAudio(new Audio("Audio 2_1"));
		
		Video video = new Video("Video 3_0");
		Document document = new Document("Document 4_0");
		
		items.add(chapter1);
		items.add(chapter2);
		items.add(video);
		items.add(document);
		
		return items;
	}
	
	private void printItems(List<Item> items) {
		for(Item currentItem : items) {
			System.out.println(currentItem.getName());
			if(currentItem instanceof Chapter) {
				Chapter chapter = (Chapter) currentItem;
				System.out.println("    * " + chapter.getDocument().getName());
				for(Audio audio : chapter.getAudioes()) {
					System.out.println("    * " + audio.getName());
				}
				for(Video video : chapter.getVideoes()) {
					System.out.println("    * " + video.getName());
				}
			}
		}
	}
}
