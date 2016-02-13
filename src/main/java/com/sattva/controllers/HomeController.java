package com.sattva.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sattva.hibernate.entity.Food;
import com.sattva.repository.FoodRepository;

@RestController
@RequestMapping("api")
public class HomeController {
	
	@Autowired
	private FoodRepository foodRepository;
	
	@RequestMapping(value="/food-list", method=RequestMethod.GET, produces="application/json; charset=utf-8")
	public @ResponseBody Collection<Food> getFoodList() {
		return foodRepository.findByActiveTrue();
	}
}
