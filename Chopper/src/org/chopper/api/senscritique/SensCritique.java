package org.chopper.api.senscritique;

import org.chopper.api.common.WithBDRating;
import org.chopper.api.common.WithBookRating;
import org.chopper.api.common.WithComicRating;
import org.chopper.api.common.WithDiscRating;
import org.chopper.api.common.WithMovieRating;
import org.chopper.api.common.WithSongRating;
import org.chopper.api.common.WithTVShowRating;

public interface SensCritique extends
	WithMovieRating<SCUser, SCRating, SCMovie, SCResponse>,
	WithDiscRating<SCUser, SCRating, SCDisc, SCResponse>,
	WithSongRating<SCUser, SCRating, SCSong, SCResponse>,
	WithBDRating<SCUser, SCRating, SCBD, SCResponse>,
	WithComicRating<SCUser, SCRating, SCComic, SCResponse>,
	WithBookRating<SCUser, SCRating, SCBook, SCResponse>,
	WithTVShowRating<SCUser, SCRating, SCTVShow, SCResponse>
{
	public boolean isMovieChecked(final SCUser user, final SCMovie movie);
	public SCResponse checkMovie(final SCMovie movie, final SCUser user, final SCRating rating);
	public SCMovie findMovieById(final String movieId);
}
