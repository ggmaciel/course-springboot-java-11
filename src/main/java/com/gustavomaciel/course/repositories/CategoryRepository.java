package com.gustavomaciel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavomaciel.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
