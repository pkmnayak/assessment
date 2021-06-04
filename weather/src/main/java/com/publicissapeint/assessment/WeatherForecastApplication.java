package com.publicissapeint.assessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "*")
@SpringBootApplication
public class WeatherForecastApplication {

  public static void main(String[] args) {
    SpringApplication.run(WeatherForecastApplication.class, args);
  }
}
