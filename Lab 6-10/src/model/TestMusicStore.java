package model;

public class TestMusicStore {
	
	public static void main(String args[]) {
		MusicStore ms = new MusicStore();
		ms.displayHoursOfOperation();
		ms.setOwner("Manoel, Proprietário");
		ms.getOpenClosedMessage();
	}

}
