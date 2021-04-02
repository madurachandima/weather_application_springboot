package com.madura.weather.application.entities;

import java.util.List;

public class Place {
    private List<PlaceData> data;

    public List<PlaceData> getData() {
        return data;
    }

    public void setData(List<PlaceData> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Place{" +
                "data=" + data +
                '}';
    }
}
