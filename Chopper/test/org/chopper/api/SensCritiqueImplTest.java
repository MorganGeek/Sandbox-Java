package org.chopper.api;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.chopper.api.senscritique.SCMovie;
import org.chopper.api.senscritique.SensCritique;
import org.junit.Test;

public class SensCritiqueImplTest {

	@Test
	public void testRateMovie() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindMovieByIdIMDBMovie() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindMovieByIdAmazonMovie() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindMovieById() {
		SensCritique api = new SensCritiqueImpl();
		SCMovie movie = api.findMovieById("Demolition_Man/478222");
		assertThat(movie, not(nullValue()));
		assertThat(movie.getTitle(), equalTo("Demolition Man"));
		assertThat(movie.getId(), equalTo("Demolition_Man/478222"));
		assertThat(movie.getReleaseYear(), equalTo("1994"));
		assertThat(movie.getDuration(), equalTo("1 h 55 min"));
	}

	@Test
	public void testFindMovieByTitle() {
		SensCritique api = new SensCritiqueImpl();
		SCMovie movie = api.findMovieByTitle("Demolition man");
		assertThat(movie, not(nullValue()));
		assertThat(movie.getTitle(), equalTo("Demolition Man"));
		assertThat(movie.getId(), equalTo("Demolition_Man/478222"));
		assertThat(movie.getDuration(), equalTo("1 h 55 min"));
	}

	@Test
	public void testFindMovieByReal() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testIsReady() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testRateDisc() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindDiscByIdMusicBrainzDisc() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindDiscByIdAmazonDisc() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindDiscByTitle() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindDiscByArtist() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testRateSong() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindSongByIdMusicBrainzSong() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindSongByIdAmazonSong() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindSongByTitle() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindSongByArtist() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testRateBD() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindBDById() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindBDByTitle() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindBDByAuthor() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testRateComic() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindComicById() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindComicByTitle() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindComicByArtist() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testRateBook() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindBookById() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindBookByTitle() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindBookByAuthor() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testRateTVShow() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindTVShowByIdIMDBTVShow() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindTVShowByIdAmazonTVShow() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindTVShowByTitle() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testFindTVShowByReal() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testIsMovieChecked() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public void testCheckMovie() {
		fail("Not yet implemented"); // TODO
	}

}
