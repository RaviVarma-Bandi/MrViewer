package com.virtusa.mrviewer.Admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

package com.virtusa.mrviewer.Admin.model.MovieModel;

@Repository
public interface MovieRepository extends JpaRepository<MovieModel, Integer> {

}
