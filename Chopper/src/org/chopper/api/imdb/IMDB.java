package org.chopper.api.imdb;

import org.chopper.api.common.WithMovie;
import org.chopper.api.common.WithTVShow;

public interface IMDB extends
	WithMovie<IMDBMovie>,
	WithTVShow<IMDBTVShow>
{

}
