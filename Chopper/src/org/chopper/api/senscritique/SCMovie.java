package org.chopper.api.senscritique;

public class SCMovie {

	private String title;
	private String id;
	private String year;
	private String duration;

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getReleaseYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getDuration() {
		return this.duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
}
