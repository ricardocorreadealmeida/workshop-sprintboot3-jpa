package com.ralw.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ralw.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
