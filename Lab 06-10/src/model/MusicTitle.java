package model;

public class MusicTitle {
	
	private String title = "sem nome";
	private String artist = "sem nome";
	
	public MusicTitle() {

	}
	
	public MusicTitle(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

}
