package org.chopper.api.common;

import org.chopper.api.amazon.AmazonBD;

public interface WithBD<BD> extends Api {

	public BD findBDById(final AmazonBD bd);
	public BD findBDByTitle(final String title);
	public BD findBDByAuthor(final String author);
}
