package com.ralw.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ralw.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
