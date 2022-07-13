package com.virtusa.mrviewer.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.mrviewer.user.model.MovieCast;

@Repository
public interface MovieCastRepository extends JpaRepository<MovieCast, Long>{

}
