package com.mscomputer.controller;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/tempget")
	public ResponseEntity<List<TemperatureData>> getAllProducts() {
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAll());
	}
	
}
