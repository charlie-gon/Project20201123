package com.yedam;


public class CalendarSet {
	
	private int date;

	public CalendarSet(int date) {
		
		this.date = date;
	}
	
	public CalendarSet() {
		
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public void showCal() {
		System.out.printf("%4d",this.date);
	}
}
