package com.publicissapeint.assessment.dao.impl;

import com.publicissapeint.assessment.dao.WeatherDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class WeatherDaoImpl implements WeatherDao {

  @Value("${api.key}")
  private String key;

  private RestTemplate restTemplate = new RestTemplate();

  @Override
  public ResponseEntity<String> getWeatherData(String cityName) {
    String url = "http://api.openweathermap.org/data/2.5/forecast/daily?q=" +cityName + "&mode=json&appid="+key+"&units=metric&cnt=3";
    final HttpHeaders headers = new HttpHeaders();
    final HttpEntity<String> request = new HttpEntity<>(headers);
    ResponseEntity<String> response =null;
    try {
     response = restTemplate
          .exchange(url, HttpMethod.GET, request, String.class);
    }catch (Exception e){
     e.printStackTrace();
    }
    return response;
  }
}
