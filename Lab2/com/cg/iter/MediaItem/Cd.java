package com.cg.iter.MediaItem;

public class Cd extends MediaItem{
	
	private String artist;
	private String genre;
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public Cd(int id, String title, int numberofcopies, int runTime, String artist, String genre) {
		super(id, title, numberofcopies, runTime);
		this.artist = artist;
		this.genre = genre;
	}
	
	public Cd() {
		super();

	}
	
	public Cd(int id, String title, int numberofcopies, int runTime) {
		super(id, title, numberofcopies, runTime);
	}
	
	public void print(){
		System.out.println("Information about the CD: ");
		System.out.println("Genre : "+ genre);
		System.out.println("Artist : "+ artist);
		super.print();
	}
	
	public int getId(){
		return super.getId();
	}
	
	public String title(){
		return super.getTitle();
	}
	
	public int getNumberofcopies(){
		return super.getNumberofcopies();
	}
	
	public int getRunTime() {
		return super.getRunTime();
	}
	
	public void checkIn(){
		  super.checkIn();
	}
	
	public void checkOut(){
		  super.checkOut();
	}
	
	public void addItem(){
		super.addItem();
	}
	
}
