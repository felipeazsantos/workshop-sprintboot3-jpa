package com.felipeazsantos.springbootcourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.felipeazsantos.springbootcourse.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
