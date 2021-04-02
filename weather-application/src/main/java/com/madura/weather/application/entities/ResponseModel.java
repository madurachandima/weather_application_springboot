package com.madura.weather.application.entities;

public class ResponseModel {
    private String temp;
    private String humidity;
    private String wind_speed;
    private String clouds;
    private String main;
    private String description;
    private String region;
    private String country;


    public ResponseModel(String temp,
                         String humidity, String wind_speed, String clouds,
                         String main, String description,
                         String region, String country) {
        this.temp = temp;
        this.humidity = humidity;
        this.wind_speed = wind_speed;
        this.clouds = clouds;
        this.main = main;
        this.description = description;
        this.region = region;
        this.country = country;
    }
}
