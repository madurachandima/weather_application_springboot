package com.madura.weather.application.controller.entities;

import java.util.List;

public class CurrentWeather {
    private String temp;
    private String humidity;
    private String wind_speed;
    private String clouds;
    private List<Weather> weather;

    public String getTemp() {
        return temp;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getWind_speed() {
        return wind_speed;
    }

    public String getClouds() {
        return clouds;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setWind_speed(String wind_speed) {
        this.wind_speed = wind_speed;
    }

    public void setClouds(String clouds) {
        this.clouds = clouds;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Current{" +
                "temp='" + temp + '\'' +
                ", humidity='" + humidity + '\'' +
                ", wind_speed='" + wind_speed + '\'' +
                ", weather=" + weather +
                '}';
    }
}

