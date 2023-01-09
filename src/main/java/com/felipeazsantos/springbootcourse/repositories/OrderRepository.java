package com.felipeazsantos.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeazsantos.springbootcourse.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
