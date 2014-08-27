package org.chopper.api.common;

public interface WithBookRating<User, Rating, Book, Result> extends WithBook<Book>, WithRating<User, Rating, Result> {
	public Result rateBook(final Book book, final User user, final Rating rating);
}
