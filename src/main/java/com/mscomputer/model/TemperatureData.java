package com.mscomputer.model;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TemperatureData {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private UUID id;
	private float temperature;
	private float humidity;
	private LocalDateTime time;
	
	
	
	public TemperatureData() {
		this.time = LocalDateTime.now();
	}



	public TemperatureData(UUID id, float temperature, float humidity) {
		this.id = id;
		this.temperature = temperature;
		this.humidity = humidity;
		this.time = LocalDateTime.now();
	}



	public UUID getId() {
		return id;
	}



	public void setId(UUID id) {
		this.id = id;
	}



	public float getTemperature() {
		return temperature;
	}



	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}



	public float getHumidity() {
		return humidity;
	}



	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}



	public LocalDateTime getTime() {
		return time;
	}



	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	
	
	
}
