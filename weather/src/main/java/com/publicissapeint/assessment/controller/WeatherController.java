package com.publicissapeint.assessment.controller;

import com.publicissapeint.assessment.model.Weather;
import com.publicissapeint.assessment.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
public class WeatherController {

  @Autowired
  private WeatherService weatherService;


  @GetMapping(value = "/city/{cityName}", produces = MediaType.APPLICATION_JSON_VALUE)
  public ResponseEntity<String> getWeather(@PathVariable("cityName") String cityName){
    Weather weather = weatherService.getWeatherSatus(cityName);
    if( weather != null)
      return new ResponseEntity(weather, HttpStatus.OK);

    return new ResponseEntity("city not found", HttpStatus.NOT_FOUND);
  }

}
