package org.chopper.api.common;

public interface WithDiscRating<User, Rating, Disc, Result> extends
	WithDisc<Disc>,
	WithRating<User, Rating, Result>
{
	public Result rateDisc(final Disc disc, final User user, final Rating rating);
}
