package com.gustavomaciel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavomaciel.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
