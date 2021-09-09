package model;

import java.util.Calendar;
import java.util.Scanner;

public class MusicStore {

	private String owner = "sem dono";
	private int openTime = 9;
	private int closeTime = 21;
	//private int hourInt;
	private MusicTitle[] titles = null;

	public void recebeInput() {

		Scanner scan = new Scanner(System.in);
		System.out.print("Informe os horários de abertura e fechamento:");
		openTime = scan.nextInt();
		closeTime = scan.nextInt();
		scan.close();

	}
	
	public String toString() {
		
		String hours = "Período:\n" + "Diariamente das " + getOpenTime() + "h - " + getCloseTime() + "h\n";
		return hours;
	}

	public void displayHoursOfOperation() {

		System.out.println(toString());

	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getOpenTime() {
		return openTime;
	}

	public void setOpenTime(int openTime) {
		this.openTime = openTime;
	}

	public int getCloseTime() {
		return closeTime;
	}

	public void setCloseTime(int closeTime) {
		this.closeTime = closeTime;
	}
	
	public MusicTitle[] getTitles() {
		return titles;
	}

	public void setTitles(MusicTitle[] titles) {
		this.titles = titles;

	}

	public boolean isOpen() {
		if(getHourInt() < 21 && getHourInt() >= 9)
			return true;
		else
			return false;
	}
	public int getHourInt() {
		Calendar cal = Calendar.getInstance();
		return cal.get(Calendar.HOUR_OF_DAY);
	}

	public void getOpenClosedMessage() {
		if(isOpen())
			System.out.println("Estamos Abertos!\n");
		else 
			System.out.println("Estamos Fechados!\n");
	}
	
	public void displayMusicTitles() {
		System.out.println("\nTitulo e Artista\n");
		for(int i = 0; i <titles.length; i++) {
			System.out.println(titles[i].getTitle() + ",by " +  titles[i].getArtist());			
		}
		
	}


}
