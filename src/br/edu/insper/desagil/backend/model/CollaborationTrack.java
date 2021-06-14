package br.edu.insper.desagil.backend.model;

import java.util.List;

public class CollaborationTrack extends Track {

	private List<Artist> collaborators;	
	
	public CollaborationTrack(Artist artist, List<Artist> collaborators, String name, Integer duration) {
		super(artist, name, duration);
		this.collaborators = collaborators;
	}
	
	@Override
	public String getFullArtistName() {
		String complete = this.getArtist().getName() +" (feat. ";
		for (int i=0; i < this.collaborators.size(); i++) {
			if (i == this.collaborators.size()-1) {
				complete += this.collaborators.get(i).getName();
			}
			else {
				complete += this.collaborators.get(i).getName() + ", ";
			}
		}
		complete += ")";
		return complete;
	}

}
