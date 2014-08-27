package org.chopper.api;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.Charsets;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.chopper.api.amazon.AmazonBD;
import org.chopper.api.amazon.AmazonBook;
import org.chopper.api.amazon.AmazonComic;
import org.chopper.api.amazon.AmazonDisc;
import org.chopper.api.amazon.AmazonMovie;
import org.chopper.api.amazon.AmazonSong;
import org.chopper.api.amazon.AmazonTVShow;
import org.chopper.api.imdb.IMDBMovie;
import org.chopper.api.imdb.IMDBTVShow;
import org.chopper.api.musicbrainz.MusicBrainzDisc;
import org.chopper.api.musicbrainz.MusicBrainzSong;
import org.chopper.api.senscritique.SCBD;
import org.chopper.api.senscritique.SCBook;
import org.chopper.api.senscritique.SCComic;
import org.chopper.api.senscritique.SCDisc;
import org.chopper.api.senscritique.SCMovie;
import org.chopper.api.senscritique.SCRating;
import org.chopper.api.senscritique.SCResponse;
import org.chopper.api.senscritique.SCSong;
import org.chopper.api.senscritique.SCTVShow;
import org.chopper.api.senscritique.SCUser;
import org.chopper.api.senscritique.SensCritique;
import org.chopper.net.Page;

public class SensCritiqueImpl implements SensCritique {

	@Override
	public SCResponse rateMovie(SCMovie movie, SCUser user, SCRating rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCMovie findMovieById(IMDBMovie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCMovie findMovieById(AmazonMovie movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCMovie findMovieById(String movieId) {
		if (StringUtils.isBlank(movieId))
			throw new IllegalArgumentException("Invalid movie id received");
		try {
			String sourceUrl = "http://www.senscritique.com/film/" + movieId;
			String source;
			if (!isReady())
			source = FileUtils.readFileToString(new File("C:/Devs/Workspaces/Sandbox/Chopper/resources/test/senscritique/Demolition Man - Marco Brambilla - SensCritique.htm"), Charsets.UTF_8);
			else source = Page.source(sourceUrl);
			Pattern pattern = Pattern.compile("<h1 class=\"pvi-product-title\" itemprop=\"name\">([a-zA-Z0-9-.' ]+)</h1>\\s+<small class=\"pvi-product-year\">\\(([0-9]+)\\)</small>", Pattern.DOTALL | Pattern.MULTILINE);
			Matcher m = pattern.matcher(source);
			if (m.find()) {
				SCMovie movie = new SCMovie();
				movie.setId(movieId);
				movie.setTitle(m.group(1));
				movie.setYear(m.group(2));
				Pattern patternDuration = Pattern.compile("<meta itemprop=\"duration\" content=\"[a-zA-Z0-9]{1,10}\" />\\s+(1 h 55 min)\\s+</li>", Pattern.DOTALL);
				m = patternDuration.matcher(source);
				if (m.find()) {
					movie.setDuration(m.group(1));
				}
				return movie;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SCMovie findMovieByTitle(String movieTitle) {
		if (StringUtils.isBlank(movieTitle))
			throw new IllegalArgumentException("Invalid movie title received");
		try {
			String source;
			if (!isReady()) source = FileUtils.readFileToString(new File("C:/Devs/Workspaces/Sandbox/Chopper/resources/test/senscritique/Recherche " + movieTitle + " - SensCritique.htm"), Charsets.UTF_8);
			else source = Page.source("http://www.senscritique.com/recherche?query="+movieTitle+"&filter=movies");
			Pattern pattern = Pattern.compile("\\/film\\/([a-zA-Z_^/]{1,100}\\/[0-9]+)\" class=\\"
					+ "\"\">(.{1,50})</a>", Pattern.DOTALL);
			Matcher m = pattern.matcher(source);
			String movieId = "";
			SCMovie movie = new SCMovie();
			if (m.find()) {
				movieId = m.group(1);
				movie.setId(movieId);
				movie.setTitle(m.group(2));
				return findMovieById(movieId);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SCMovie findMovieByReal(String realName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isReady() {
		return false;
	}

	@Override
	public SCResponse rateDisc(SCDisc disc, SCUser user, SCRating rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCDisc findDiscById(MusicBrainzDisc disc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCDisc findDiscById(AmazonDisc disc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCDisc findDiscByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCDisc findDiscByArtist(String artist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCResponse rateSong(SCSong Song, SCUser user, SCRating rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCSong findSongById(MusicBrainzSong song) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCSong findSongById(AmazonSong song) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCSong findSongByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCSong findSongByArtist(String artist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCResponse rateBD(SCBD BD, SCUser user, SCRating rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCBD findBDById(AmazonBD bd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCBD findBDByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCBD findBDByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCResponse rateComic(SCComic comic, SCUser user, SCRating rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCComic findComicById(AmazonComic comic) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCComic findComicByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCComic findComicByArtist(String artist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCResponse rateBook(SCBook book, SCUser user, SCRating rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCBook findBookById(AmazonBook book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCBook findBookByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCBook findBookByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCResponse rateTVShow(SCTVShow tvShow, SCUser user, SCRating rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCTVShow findTVShowById(IMDBTVShow tvShow) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCTVShow findTVShowById(AmazonTVShow tvShow) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCTVShow findTVShowByTitle(String tvShowTitle) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SCTVShow findTVShowByReal(String realName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isMovieChecked(SCUser user, SCMovie movie) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SCResponse checkMovie(SCMovie movie, SCUser user, SCRating rating) {
		// TODO Auto-generated method stub
		return null;
	}

}
