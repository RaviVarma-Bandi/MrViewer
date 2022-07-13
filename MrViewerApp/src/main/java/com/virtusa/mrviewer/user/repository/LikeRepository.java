package com.virtusa.mrviewer.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.virtusa.mrviewer.user.model.Like;

@Repository
public interface LikeRepository extends JpaRepository<Like, Long> {

	void deleteByUserUserId(int userId);

}
