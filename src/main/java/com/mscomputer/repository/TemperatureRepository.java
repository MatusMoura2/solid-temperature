package com.mscomputer.repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mscomputer.model.TemperatureData;

@Repository
public interface TemperatureRepository extends JpaRepository<TemperatureData, UUID>{
	
    @Query("SELECT t FROM TemperatureData t WHERE t.time BETWEEN :initialDate AND :finalDate")
	List<TemperatureData> findByTime(@Param("initialDate") LocalDateTime initialDate,@Param("finalDate") LocalDateTime finalDate);
}
