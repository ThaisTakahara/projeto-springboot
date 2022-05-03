package com.thaistakahara.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thaistakahara.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
