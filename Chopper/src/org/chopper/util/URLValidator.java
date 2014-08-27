package org.chopper.util;

public class URLValidator {

	public boolean isValid(String url) {
		return url != null && url.startsWith("http") && url.contains("://") && !url.endsWith("://");
	}

}
