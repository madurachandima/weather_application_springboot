package com.madura.weather.application.controller.entities;

import java.util.List;

public class Place {
    private List<PlaceData> data;

    public List<PlaceData> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Place{" +
                "data=" + data +
                '}';
    }
}

