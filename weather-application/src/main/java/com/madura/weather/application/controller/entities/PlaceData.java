package com.madura.weather.application.controller.entities;

public class PlaceData {
    private String latitude;
    private String longitude;
    private String region;
    private String country;

    public String getRegion() {
        return region;
    }

    public String getCountry() {
        return country;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "PlaceData{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", region='" + region + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
