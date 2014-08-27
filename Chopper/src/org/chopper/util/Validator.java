package org.chopper.util;

public class Validator {

	public final static boolean url(String url) {
		return new URLValidator().isValid(url);
	}
}
