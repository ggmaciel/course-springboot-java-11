package com.gustavomaciel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavomaciel.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
