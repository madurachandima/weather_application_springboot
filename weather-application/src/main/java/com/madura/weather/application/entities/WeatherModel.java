package com.madura.weather.application.entities;

public class WeatherModel {
    private double lat;
    private double lon;
    private CurrentWeather current;


    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public CurrentWeather getCurrent() {
        return current;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setCurrent(CurrentWeather current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "WeatherModel{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", current=" + current +
                '}';
    }
}
