package com.felipeazsantos.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeazsantos.springbootcourse.entities.OrderItem;
import com.felipeazsantos.springbootcourse.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
