package org.chopper.net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Page {

	public final static String source(final String url) throws IOException {
		return source(new URL(url));
	}

	public final static String source(final URL url) throws IOException {
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod(HttpMethod.GET);
		BufferedReader in = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		String wholeInput = "";
		String inputLine = null;
		while ((inputLine = in.readLine()) != null) {
			wholeInput += inputLine;
		}
		in.close();
		return wholeInput;
	}
}
