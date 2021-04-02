package com.madura.weather.application.gsonConverter;

import com.google.gson.Gson;

import java.lang.reflect.Type;

public class JsonToObject {
    Gson gson = new Gson();

    public Object ObjectConverter(String response, Object classObject) {
        Object obj = "";
        try {
            obj = gson.fromJson(response, (Type) classObject);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
}
