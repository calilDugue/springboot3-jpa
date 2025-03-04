package com.estudocalil.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudocalil.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
