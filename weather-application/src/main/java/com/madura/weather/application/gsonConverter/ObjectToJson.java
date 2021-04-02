package com.madura.weather.application.gsonConverter;

import com.google.gson.Gson;

public class ObjectToJson {
    Gson gson = new Gson();

    public Object JsonConverter(Object object) {
        Object obj = gson.toJson(object);
        return obj;
    }
}
