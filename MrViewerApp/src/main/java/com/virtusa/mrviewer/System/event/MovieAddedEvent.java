package com.virtusa.mrviewer.System.event;

public class MovieAddedEvent {
	private String movieName;

	public MovieAddedEvent(String movieName) {
		super();
		this.movieName = movieName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

}
