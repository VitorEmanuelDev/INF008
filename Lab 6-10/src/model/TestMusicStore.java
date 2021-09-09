package model;

public class TestMusicStore {
	
	public static void main(String args[]) {
		
		MusicStore ms = new MusicStore();
		MusicTitle mt = new MusicTitle();
		MusicTitle[] titles = new MusicTitle[4];
		
		mt.setTitle("Whateva");
		mt.setArtist("Method man & Redman");
		titles[0] = new MusicTitle(mt.getTitle(), mt.getArtist());
		
		mt.setTitle("Nas is like");
		mt.setArtist("Nas");
		titles[1] = new MusicTitle(mt.getTitle(), mt.getArtist());
		
		mt.setTitle("Mathematics");
		mt.setArtist("Mos Def");
		titles[2] = new MusicTitle(mt.getTitle(), mt.getArtist());
		
		mt.setTitle("Negro Drama");
		mt.setArtist("Racionais MC's");
		titles[3] = new MusicTitle(mt.getTitle(), mt.getArtist());
	
		ms.setTitles(titles);
		ms.recebeInput();
		ms.displayHoursOfOperation();
		ms.setOwner("Vitor, Proprietário");
		System.out.println(ms.getOwner() + "\n");
		ms.getOpenClosedMessage();		
		ms.displayMusicTitles();
			
	}

}
