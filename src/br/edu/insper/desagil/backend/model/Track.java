package br.edu.insper.desagil.backend.model;

public class Track {
	
	private Artist artist;
	private String name;
	private Integer duration;
	
	public Track(Artist artist, String name, Integer duration) {
		super();
		this.artist = artist;
		this.name = name;
		this.duration = duration;
	}

	public Artist getArtist() {
		return artist;
	}

	public String getName() {
		return name;
	}

	public Integer getDuration() {
		return duration;
	}
	
	public String getDurationString() {
		int durationSeconds = this.duration;
		int minutes = 0;
		while (durationSeconds >= 0) {
			if (durationSeconds < 10) {
				return (minutes+ ":" +"0"+durationSeconds);
			}
			durationSeconds -= 60;
			if (durationSeconds < 0) {
				durationSeconds += 60;
				return (minutes+ ":" +durationSeconds);
			}
			minutes += 1;
		}
		return null;
	}
	
	public String getFullArtistName() {
		return this.artist.getName();
	}

}
