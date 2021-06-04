package com.publicissapeint.assessment.service;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.publicissapeint.assessment.dao.WeatherDao;

import com.publicissapeint.assessment.model.Temperature;
import com.publicissapeint.assessment.model.Weather;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class WeatherService {

  @Autowired
  private WeatherDao weatherDao;

  public Weather getWeatherSatus(String cityName) {
    ResponseEntity<String> data = weatherDao.getWeatherData(cityName);
    Weather weather = null;
    if(data != null) {
      weather = new Weather();
      JsonObject gsonData = new Gson().fromJson(data.getBody(), JsonObject.class);
      JsonArray days = gsonData.get("list").getAsJsonArray();
      List tempList = new ArrayList();
      for (JsonElement jsonElement : days) {
        Temperature temperature = new Temperature();
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        float maxTemp = jsonObject.getAsJsonObject("temp").getAsJsonPrimitive("max").getAsFloat();
        temperature.setHighTemp(maxTemp);
        temperature
            .setLowTemp(jsonObject.getAsJsonObject("temp").getAsJsonPrimitive("min").getAsFloat());
        if (jsonObject.getAsJsonPrimitive("rain") != null) {
          temperature.setStatus("Carry umbrella");
        } else if (maxTemp > 40) {
          temperature.setStatus("Use sunscreen lotion");
        }
        tempList.add(temperature);
        temperature.setDay(jsonObject.getAsJsonPrimitive("dt").getAsLong());
      }
      weather.setCityName(gsonData.get("city").getAsJsonObject().get("name").getAsString());
      weather.setTemperature(tempList);
    }
    return weather;
  }

}
