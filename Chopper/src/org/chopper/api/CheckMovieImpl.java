package org.chopper.api;

import org.chopper.api.amazon.AmazonMovie;
import org.chopper.api.chkmv.CKMovie;
import org.chopper.api.chkmv.CKRating;
import org.chopper.api.chkmv.CKResponse;
import org.chopper.api.chkmv.CKUser;
import org.chopper.api.chkmv.CheckMovie;
import org.chopper.api.imdb.IMDBMovie;

public class CheckMovieImpl implements CheckMovie {

	@Override
	public CKResponse rateMovie(CKMovie movie, CKUser user, CKRating rating) {
		return null;
	}

	@Override
	public CKMovie findMovieById(IMDBMovie movie) {
		return null;
	}

	@Override
	public CKMovie findMovieById(AmazonMovie movie) {
		return null;
	}

	@Override
	public CKMovie findMovieByTitle(String movieTitle) {
		// http://www.icheckmovies.com/search/movies/?query=demolition%20man
		return null;
	}

	@Override
	public CKMovie findMovieByReal(String realName) {
		return null;
	}

	@Override
	public boolean isReady() {
		return false;
	}

	@Override
	public boolean isMovieChecked(CKUser user, CKMovie movie) {
		return false;
	}

	@Override
	public CKResponse checkMovie(CKMovie movie, CKUser user, CKRating rating) {
		return null;
	}
}