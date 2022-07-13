package com.virtusa.mrviewer.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.mrviewer.user.model.Movie;
import com.virtusa.mrviewer.user.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movierepo;

	public Optional<Movie> findMovieById(Long Id) {
		return movierepo.findById(Id);
	}

	public Movie findMovieByName(String movieName) {
		return movierepo.findByMovieName(movieName);
	}

	public List<Movie> getAllMovie() {
		return movierepo.findAll();
	}
}
