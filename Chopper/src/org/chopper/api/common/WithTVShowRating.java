package org.chopper.api.common;

public interface WithTVShowRating<User, Rating, TVShow, Result> extends WithTVShow<TVShow>, WithRating<User, Rating, Result> {
	public Result rateTVShow(final TVShow tvShow, final User user, final Rating rating);
}
