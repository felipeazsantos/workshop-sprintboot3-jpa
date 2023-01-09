package com.felipeazsantos.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeazsantos.springbootcourse.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
