package org.chopper.api.chkmv;

import org.chopper.api.common.WithMovieRating;

public interface CheckMovie extends WithMovieRating<CKUser, CKRating, CKMovie, CKResponse> {
	public boolean isMovieChecked(final CKUser user, final CKMovie movie);
	public CKResponse checkMovie(final CKMovie movie, final CKUser user, final CKRating rating);
}
