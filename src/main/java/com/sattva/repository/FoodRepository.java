package com.sattva.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sattva.hibernate.entity.Food;

@Repository
@Transactional
public interface FoodRepository extends JpaRepository<Food, Long> {
	public Collection<Food> findByActiveTrue();
}
