package org.chopper.api.common;

public interface WithComicRating<User, Rating, Comic, Result> extends WithComic<Comic>, WithRating<User, Rating, Result> {
	public Result rateComic(final Comic comic, final User user, final Rating rating);
}
