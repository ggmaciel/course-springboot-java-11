package com.gustavomaciel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavomaciel.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
