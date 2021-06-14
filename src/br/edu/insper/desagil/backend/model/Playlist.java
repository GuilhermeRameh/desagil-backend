package br.edu.insper.desagil.backend.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Playlist {

	private Integer id;
	private List<Track> tracks;
	private Map<String, Integer> ratings;
	
	public Playlist(Integer id) {
		this.id = id;
		this.tracks = new ArrayList<>();
		this.ratings = new HashMap<>();
	}

	public Integer getId() {
		return id;
	}

	public List<Track> getTracks() {
		return tracks;
	}

	public Map<String, Integer> getRatings() {
		return ratings;
	}
	
	public void addTrack(Track faixa) {
		this.tracks.add(faixa);
	}
	
	public void putRating(String user, int rating) {
		this.ratings.put(user, rating);
	}
	
	public double averageRatings() {
		int l = this.ratings.size();
		int total = 0;
		for (int i:this.ratings.values()) {
			total += i;
		}
		double average = (double)total/l;
		int i = (int) average;
		double d = average - i;
		
		if (d < 0.26) {
			d = 0.0;
		}
		else if (d >= 0.26 && d <= 0.74){
			d = 0.5;
		}
		else d = 1.0;
		
		return i + d;
	}
	
}
