package com.thaistakahara.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thaistakahara.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
