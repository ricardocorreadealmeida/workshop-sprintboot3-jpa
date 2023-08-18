package com.ralw.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ralw.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
