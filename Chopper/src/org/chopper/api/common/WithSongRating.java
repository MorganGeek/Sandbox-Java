package org.chopper.api.common;

public interface WithSongRating<User, Rating, Song, Result> extends WithSong<Song>, WithRating<User, Rating, Result> {
	public Result rateSong(final Song Song, final User user, final Rating rating);
}
