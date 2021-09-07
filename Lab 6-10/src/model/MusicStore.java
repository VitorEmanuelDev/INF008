package model;

import java.util.Calendar;

public class MusicStore {

	public String owner = "sem dono";
	public int openTime = 9;
	public int closeTime = 21;
	public int hourInt;

	public void displayHoursOfOperation() {

		System.out.println("Período:\n" + 
				"Diariamente das " + getOpenTime() + "h - " + getCloseTime() + "h");

	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
		System.out.println(owner);
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
			System.out.println("Estamos Abertos!");
		else 
			System.out.println("Estamos Fechados!");
	}
	

}
