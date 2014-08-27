package org.chopper.api.common;

public interface WithMovieRating<User, Rating, Movie, Result> extends WithMovie<Movie>, WithRating<User, Rating, Result> {
	public Result rateMovie(final Movie movie, final User user, final Rating rating);
}
