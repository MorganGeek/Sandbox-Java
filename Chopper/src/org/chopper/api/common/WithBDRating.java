package org.chopper.api.common;

public interface WithBDRating<User, Rating, BD, Result> extends WithBD<BD>, WithRating<User, Rating, Result> {
	public Result rateBD(final BD BD, final User user, final Rating rating);
}
