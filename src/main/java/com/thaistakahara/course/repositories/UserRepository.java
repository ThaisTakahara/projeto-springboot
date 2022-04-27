package com.thaistakahara.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thaistakahara.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
