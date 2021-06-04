package com.publicissapeint.assessment.model;

import java.util.List;

public class Weather {
  private  String cityName;
  private List<Temperature> temperature;

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public List<Temperature> getTemperature() {
    return temperature;
  }

  public void setTemperature(List<Temperature> temperature) {
    this.temperature = temperature;
  }
}
