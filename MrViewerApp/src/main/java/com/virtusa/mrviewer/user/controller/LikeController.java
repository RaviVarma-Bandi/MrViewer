package com.virtusa.mrviewer.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.virtusa.mrviewer.user.model.Like;
import com.virtusa.mrviewer.user.service.LikeService;
import com.virtusa.mrviewer.user.service.MovieService;
import com.virtusa.mrviewer.user.service.UserService;

@Controller
public class LikeController {

	@Autowired
	private UserService userservice;

	@Autowired
	private MovieService movieservice;

	@Autowired
	private LikeService likeservice;

	@RequestMapping(value = "/liked", method = { RequestMethod.POST, RequestMethod.GET })
	public String liked(@RequestParam String useremail, @RequestParam String moviename, @ModelAttribute Like like) {
		Like l = like;
		l.setMovie(movieservice.findMovieByName(moviename));
		l.setUser(userservice.findByEmail(useremail));
		likeservice.addLikebyId(l);
		return "index.html";
	}

	@RequestMapping(value = "/disliked", method = RequestMethod.POST)
	public String liked(@RequestParam int Id) {
		likeservice.deleteLikeById(Id);
		return "index.html";
	}
}
