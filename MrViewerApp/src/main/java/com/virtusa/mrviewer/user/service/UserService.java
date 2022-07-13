package com.virtusa.mrviewer.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtusa.mrviewer.user.model.User;
import com.virtusa.mrviewer.user.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userrepo;

	public User findByEmail(String email) {
		return userrepo.findByEmail(email);
	}

	public List<User> getAllUser() {
		return userrepo.findAll();
	}

}
