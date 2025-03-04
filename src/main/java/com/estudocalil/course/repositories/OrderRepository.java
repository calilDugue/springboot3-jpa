package com.estudocalil.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudocalil.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
