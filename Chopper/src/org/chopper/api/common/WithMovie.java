package org.chopper.api.common;

import org.chopper.api.amazon.AmazonMovie;
import org.chopper.api.imdb.IMDBMovie;

public interface WithMovie<Movie> extends Api {

	public Movie findMovieById(final IMDBMovie movie);
	public Movie findMovieById(final AmazonMovie movie);

	public Movie findMovieByTitle(final String movieTitle);
	public Movie findMovieByReal(final String realName);
}
