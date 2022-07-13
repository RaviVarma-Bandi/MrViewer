package com.virtusa.mrviewer.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.mrviewer.user.model.MovieCast;
import com.virtusa.mrviewer.user.repository.MovieCastRepository;

@Service
public class MovieCastService {
	@Autowired
	MovieCastRepository movieCastRepo;
	
	public List<MovieCast> getAllMovieCast() {
		return movieCastRepo.findAll();
	}
}
