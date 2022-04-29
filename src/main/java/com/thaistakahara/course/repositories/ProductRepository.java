package com.thaistakahara.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thaistakahara.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
