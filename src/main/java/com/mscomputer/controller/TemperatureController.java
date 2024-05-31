package com.mscomputer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mscomputer.model.TemperatureData;
import com.mscomputer.repository.TemperatureRepository;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {
	
	@Autowired
	private TemperatureRepository repository;
	
	@PostMapping("/")
	public ResponseEntity<String> receiveInformationGround(@RequestBody TemperatureData temperatureData){
		repository.save(temperatureData);
		return ResponseEntity.ok("Info received");
	}
	
}
