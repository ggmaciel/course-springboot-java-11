package com.gustavomaciel.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gustavomaciel.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
