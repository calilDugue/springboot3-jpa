package com.estudocalil.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.estudocalil.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
