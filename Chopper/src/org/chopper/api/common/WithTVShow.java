package org.chopper.api.common;

import org.chopper.api.amazon.AmazonTVShow;
import org.chopper.api.imdb.IMDBTVShow;

public interface WithTVShow<TVShow> extends Api {

	public TVShow findTVShowById(final IMDBTVShow tvShow);
	public TVShow findTVShowById(final AmazonTVShow tvShow);
	public TVShow findTVShowByTitle(final String tvShowTitle);
	public TVShow findTVShowByReal(final String realName);
}
