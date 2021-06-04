package com.publicissapeint.assessment.dao;


import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public interface WeatherDao {
  ResponseEntity<String> getWeatherData(String cityName);
}
