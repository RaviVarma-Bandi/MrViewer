package com.virtusa.mrviewer.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.virtusa.mrviewer.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
