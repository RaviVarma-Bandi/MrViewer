package com.virtusa.mrviewer.user.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MovieCast {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long personId;
	private String personName;
	private String personImg;
	private int personAge;
	private String personCharacterName;
	@ManyToOne(cascade = CascadeType.ALL)
	private Movie movie;

	public MovieCast() {
		super();
	}

	public MovieCast(Long personId, String personName, String personImg, int personAge, String personCharacterName,
			Movie movie) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personImg = personImg;
		this.personAge = personAge;
		this.personCharacterName = personCharacterName;
		this.movie = movie;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public String getPersonImg() {
		return personImg;
	}

	public void setPersonImg(String personImg) {
		this.personImg = personImg;
	}

	public int getPersonAge() {
		return personAge;
	}

	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}

	public String getPersonCharacterName() {
		return personCharacterName;
	}

	public void setPersonCharacterName(String personCharacterName) {
		this.personCharacterName = personCharacterName;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "MovieCast [personId=" + personId + ", personName=" + personName + ", personImg=" + personImg
				+ ", personAge=" + personAge + ", personCharacterName=" + personCharacterName + ", movie=" + movie
				+ "]";
	}
}
