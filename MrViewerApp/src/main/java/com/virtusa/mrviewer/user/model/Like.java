package com.virtusa.mrviewer.user.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "likes")
public class Like {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long likeId;
	@ManyToOne(cascade = CascadeType.ALL)
	private Movie movie;
	@OneToOne
	private User user;

	public Like() {
		super();
	}

	public Like(long likeId, Movie movie, User user) {
		super();
		this.likeId = likeId;
		this.movie = movie;
		this.user = user;
	}

	public long getLikeId() {
		return likeId;
	}

	public void setLikeId(long likeId) {
		this.likeId = likeId;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
