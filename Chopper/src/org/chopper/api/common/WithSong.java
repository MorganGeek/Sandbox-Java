package org.chopper.api.common;

import org.chopper.api.amazon.AmazonSong;
import org.chopper.api.musicbrainz.MusicBrainzSong;

public interface WithSong<Song> extends Api {

	public Song findSongById(final MusicBrainzSong song);
	public Song findSongById(final AmazonSong song);

	public Song findSongByTitle(final String title);
	public Song findSongByArtist(final String artist);
}
