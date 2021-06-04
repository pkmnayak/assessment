package com.publicissapeint.assessment.model;

import java.util.Date;

public class Temperature {
  private float highTemp;
  private float lowTemp;
  private String status;
  private long day;

  public float getHighTemp() {
    return highTemp;
  }

  public void setHighTemp(float highTemp) {
    this.highTemp = highTemp;
  }

  public float getLowTemp() {
    return lowTemp;
  }

  public void setLowTemp(float lowTemp) {
    this.lowTemp = lowTemp;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public long getDay() {
    return day;
  }

  public void setDay(long day) {
    this.day = day;
  }
}
