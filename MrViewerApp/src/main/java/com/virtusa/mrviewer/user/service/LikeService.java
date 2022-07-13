package com.virtusa.mrviewer.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.mrviewer.user.model.Like;
import com.virtusa.mrviewer.user.repository.LikeRepository;

@Service
public class LikeService {
	@Autowired
	private LikeRepository likerepository;

	public Like addLikebyId(Like like) {
		return likerepository.save(like);
	}

	public void deleteLikeById(int userId) {
		likerepository.deleteByUserUserId(userId);
	}
}
