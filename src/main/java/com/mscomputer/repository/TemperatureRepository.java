package com.mscomputer.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mscomputer.model.TemperatureData;

public interface TemperatureRepository extends JpaRepository<TemperatureData, UUID>{

}
