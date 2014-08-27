package org.chopper.api.common;

import org.chopper.api.amazon.AmazonComic;

public interface WithComic<Comic> extends Api {

	public Comic findComicById(final AmazonComic comic);
	public Comic findComicByTitle(final String title);
	public Comic findComicByArtist(final String artist);
}
