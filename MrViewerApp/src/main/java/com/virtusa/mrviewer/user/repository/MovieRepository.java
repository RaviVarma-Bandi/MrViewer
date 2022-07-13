package com.virtusa.mrviewer.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.mrviewer.user.model.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

	Movie findByMovieName(String movieName);

}
