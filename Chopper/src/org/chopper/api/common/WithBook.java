package org.chopper.api.common;

import org.chopper.api.amazon.AmazonBook;

public interface WithBook<Book> extends Api {

	public Book findBookById(final AmazonBook book);
	public Book findBookByTitle(final String title);
	public Book findBookByAuthor(final String author);
}
