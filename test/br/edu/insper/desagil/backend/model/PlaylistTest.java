package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlaylistTest {
	private static double DELTA = 0.000001;

	@BeforeEach
	void setUp() {
	}

	@Test
	void testRoundDownToZero() {		
		Playlist playlist = new Playlist(0);
		playlist.putRating("gui", 1);
		playlist.putRating("gui2", 2);
		playlist.putRating("gui3", 3);
		playlist.putRating("gui4", 3);
		double media = playlist.averageRatings();
		assertEquals(media, 2.0);
	}

	@Test
	void testRoundUpToHalf() {
		Playlist playlist = new Playlist(0);
		playlist.putRating("gui", 1);
		playlist.putRating("gui2", 2);
		playlist.putRating("gui3", 1);
		double media = playlist.averageRatings();
		assertEquals(media, 1.5);
	}

	@Test
	void testRoundDownToHalf() {
		Playlist playlist = new Playlist(0);
		playlist.putRating("gui", 1);
		playlist.putRating("gui2", 2);
		playlist.putRating("gui3", 2);
		double media = playlist.averageRatings();
		assertEquals(media, 1.5);
	}

	@Test
	void testRoundUpToOne() {
		Playlist playlist = new Playlist(0);
		playlist.putRating("gui", 1);
		playlist.putRating("gui2", 1);
		playlist.putRating("gui3", 2);
		playlist.putRating("gui4", 3);
		double media = playlist.averageRatings();
		assertEquals(media, 2.0);
	}
}
