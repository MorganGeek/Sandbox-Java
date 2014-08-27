package org.chopper.api.common;

import org.chopper.api.amazon.AmazonDisc;
import org.chopper.api.musicbrainz.MusicBrainzDisc;

public interface WithDisc<Disc> extends Api {

	public Disc findDiscById(final MusicBrainzDisc disc);
	public Disc findDiscById(final AmazonDisc disc);

	public Disc findDiscByTitle(final String title);
	public Disc findDiscByArtist(final String artist);
}
