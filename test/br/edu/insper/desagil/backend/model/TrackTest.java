package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrackTest {
	@BeforeEach
	void setUp() {
	}

	@Test
	void testZeroSeconds() {
		Artist artist = new Artist("Anitta");
		Track track = new Track(artist, "Megalovania", 0);
		String duration = track.getDurationString();
		assertEquals(duration, "0:00");
	}

	@Test
	void testFiveSeconds() {
		Artist artist = new Artist("Anitta");
		Track track = new Track(artist, "Megalovania", 5);
		String duration = track.getDurationString();
		assertEquals(duration, "0:05");
	}

	@Test
	void testTwentyFiveSeconds() {
		Artist artist = new Artist("Anitta");
		Track track = new Track(artist, "Megalovania", 25);
		String duration = track.getDurationString();
		assertEquals(duration, "0:25");
	}

	@Test
	void testOneMinuteZeroSeconds() {
		Artist artist = new Artist("Anitta");
		Track track = new Track(artist, "Megalovania", 60);
		String duration = track.getDurationString();
		assertEquals(duration, "1:00");
	}

	@Test
	void testOneMinuteFiveSeconds() {
		Artist artist = new Artist("Anitta");
		Track track = new Track(artist, "Megalovania", 65);
		String duration = track.getDurationString();
		assertEquals(duration, "1:05");
	}

	@Test
	void testOneMinuteTwentyFiveSeconds() {
		Artist artist = new Artist("Anitta");
		Track track = new Track(artist, "Megalovania", 85);
		String duration = track.getDurationString();
		assertEquals(duration, "1:25");
	}

	@Test
	void testTwoMinutesZeroSeconds() {
		Artist artist = new Artist("Anitta");
		Track track = new Track(artist, "Megalovania", 120);
		String duration = track.getDurationString();
		assertEquals(duration, "2:00");
	}

	@Test
	void testTwoMinutesFiveSeconds() {
		Artist artist = new Artist("Anitta");
		Track track = new Track(artist, "Megalovania", 125);
		String duration = track.getDurationString();
		assertEquals(duration, "2:05");
	}

	@Test
	void testTwoMinutesTwentyFiveSeconds() {
		Artist artist = new Artist("Anitta");
		Track track = new Track(artist, "Megalovania", 145);
		String duration = track.getDurationString();
		assertEquals(duration, "2:25");
	}

	@Test
	void testOneCollaborator() {
		Artist artist1 = new Artist("Anitta");
		Artist artist2 = new Artist("Becky G");
		
		List<Artist> collaborators = new ArrayList<>();
		collaborators.add(artist2);
		
		CollaborationTrack track = new CollaborationTrack(artist1,  collaborators, "Megalovania", 0);
		String fullName = track.getFullArtistName();
		assertEquals(fullName, "Anitta (feat. Becky G)");
	}

	@Test
	void testTwoCollaborators() {
		Artist artist1 = new Artist("Anitta");
		Artist artist2 = new Artist("Ludmilla");
		Artist artist3 = new Artist("Snoop Dog");
		
		List<Artist> collaborators = new ArrayList<>();
		collaborators.add(artist2);
		collaborators.add(artist3);
		
		CollaborationTrack track = new CollaborationTrack(artist1,  collaborators, "Megalovania", 0);
		String fullName = track.getFullArtistName();
		assertEquals(fullName, "Anitta (feat. Ludmilla, Snoop Dog)");
	}
}
