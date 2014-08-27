package org.chopper.api;

import org.chopper.api.amazon.AmazonMovie;
import org.chopper.api.amazon.AmazonTVShow;
import org.chopper.api.imdb.IMDB;
import org.chopper.api.imdb.IMDBMovie;
import org.chopper.api.imdb.IMDBTVShow;

public class IMDBImpl implements IMDB {

	@Override
	public IMDBMovie findMovieById(IMDBMovie movie) {
		// http://www.omdbapi.com/?i=tt0106697
		// http://www.imdb.com/title/tt0106697/ ?
		return null;
	}

	@Override
	public IMDBMovie findMovieById(AmazonMovie movie) {
		return null;
	}

	@Override
	public IMDBMovie findMovieByTitle(String movieTitle) {
		// 1 strict result http://www.omdbapi.com/?t=Demolition%20Man
		// N results http://www.omdbapi.com/?s=Demolition%20Man
		return null;
	}

	@Override
	public IMDBMovie findMovieByReal(String realName) {
		return null;
	}

	@Override
	public boolean isReady() {
		return false;
	}

	@Override
	public IMDBTVShow findTVShowById(IMDBTVShow tvShow) {
		return null;
	}

	@Override
	public IMDBTVShow findTVShowById(AmazonTVShow tvShow) {
		return null;
	}

	@Override
	public IMDBTVShow findTVShowByTitle(String tvShowTitle) {
		return null;
	}

	@Override
	public IMDBTVShow findTVShowByReal(String realName) {
		return null;
	}
}
