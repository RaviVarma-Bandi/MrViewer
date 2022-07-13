package com.virtusa.mrviewer.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.virtusa.mrviewer.user.model.Movie;
import com.virtusa.mrviewer.user.service.MovieCastService;
import com.virtusa.mrviewer.user.service.MovieService;
import com.virtusa.mrviewer.user.service.UserService;

@Controller
@RequestMapping("/user")
public class MovieController {
	@Autowired
	private MovieService movieservice;
	
	@Autowired
	private MovieCastService moviecastservice;

	@GetMapping("/movie")
	public String home(Model model) {
		model.addAttribute("movies", movieservice.getAllMovie());
		return "movies.html";
	}

	@GetMapping("/moviedetails")
	public String movieById(@RequestParam String name, Model model) {
		Movie movie = movieservice.findMovieByName(name);
		model.addAttribute("moviename", movie.getMovieName());
		model.addAttribute("movieposter", movie.getMoviePosterUrl());
		model.addAttribute("movieurl", movie.getMovieUrl());
		model.addAttribute("movieduration", movie.getDuration());
		model.addAttribute("movielikes", movie.getLikes());
		model.addAttribute("moviecast", movie.getMovieCast());
		model.addAttribute("moviecast", moviecastservice.getAllMovieCast());
		return "preview.html";
	}
}
