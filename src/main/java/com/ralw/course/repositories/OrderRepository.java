package com.ralw.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ralw.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
