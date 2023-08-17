package com.ralw.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ralw.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
