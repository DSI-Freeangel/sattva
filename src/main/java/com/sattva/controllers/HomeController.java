package com.sattva.controllers;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sattva.hibernate.entity.Food;

@RestController
@RequestMapping("api")
public class HomeController {
	
	@RequestMapping(value="/food-list", method=RequestMethod.POST, produces="application/json")
	public @ResponseBody Collection<Food> getFoodList() {
		return new ArrayList<Food>();
	}
}
