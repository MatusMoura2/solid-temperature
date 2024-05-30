package com.mscomputer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mscomputer.repository.TemperatureRepository;

@Controller
@RequestMapping("/temperature")
public class TemperatureController {
	
	@Autowired
	private TemperatureRepository repository;
	
}
