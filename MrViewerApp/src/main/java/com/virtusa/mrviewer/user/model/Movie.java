package com.virtusa.mrviewer.user.model;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "movieId")
	private Long movieId;

	@NotBlank
	@NotNull
	@Column(name = "movieName")
	private String movieName;

	@NotBlank
	@NotNull
	@Column(name = "movieUrl")
	private String movieUrl;

	@NotBlank
	@NotNull
	@Column(name = "moviePostUrl")
	private String moviePosterUrl;

	@Column(name = "movieCast")
	private String movieCast;

	@NotBlank
	@NotNull
	@Size(min = 1, max = 1)
	@Column(name = "duration")
	private int duration;

	@NotNull
	private String movieDescription;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Like> likes;

	@OneToMany(cascade = CascadeType.ALL)
	private List<MovieCast> movieCasts;

	public Movie() {
		super();
	}

	public Movie(Long movieId, @NotBlank @NotNull String movieName, @NotBlank @NotNull String movieUrl,
			@NotBlank @NotNull String moviePosterUrl, String movieCast,
			@NotBlank @NotNull @Size(min = 1, max = 1) int duration, @NotNull String movieDescription, List<Like> likes,
			List<MovieCast> movieCasts) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieUrl = movieUrl;
		this.moviePosterUrl = moviePosterUrl;
		this.movieCast = movieCast;
		this.duration = duration;
		this.movieDescription = movieDescription;
		this.likes = likes;
		this.movieCasts = movieCasts;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieUrl() {
		return movieUrl;
	}

	public void setMovieUrl(String movieUrl) {
		this.movieUrl = movieUrl;
	}

	public String getMoviePosterUrl() {
		return moviePosterUrl;
	}

	public void setMoviePosterUrl(String moviePosterUrl) {
		this.moviePosterUrl = moviePosterUrl;
	}

	public String getMovieCast() {
		return movieCast;
	}

	public void setMovieCast(String movieCast) {
		this.movieCast = movieCast;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getMovieDescription() {
		return movieDescription;
	}

	public void setMovieDescription(String movieDescription) {
		this.movieDescription = movieDescription;
	}

	public List<Like> getLikes() {
		return likes;
	}

	public void setLikes(List<Like> likes) {
		this.likes = likes;
	}

	public List<MovieCast> getMovieCasts() {
		return movieCasts;
	}

	public void setMovieCasts(List<MovieCast> movieCasts) {
		this.movieCasts = movieCasts;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieUrl=" + movieUrl + ", moviePosterUrl="
				+ moviePosterUrl + ", movieCast=" + movieCast + ", duration=" + duration + ", movieDescription="
				+ movieDescription + ", likes=" + likes + ", movieCasts=" + movieCasts + "]";
	}

}
