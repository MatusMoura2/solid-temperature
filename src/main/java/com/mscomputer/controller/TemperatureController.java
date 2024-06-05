package com.mscomputer.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/tempgetranger")
	public ResponseEntity<List<TemperatureData>> getTemperatureDateInSetTime(
	        @RequestParam("initialDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime initialDate,
	        @RequestParam("finalDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime finalDate) {
	    List<TemperatureData> temperatureDatas = repository.findByTime(initialDate, finalDate);
	    return ResponseEntity.ok(temperatureDatas);
	}
	
}
