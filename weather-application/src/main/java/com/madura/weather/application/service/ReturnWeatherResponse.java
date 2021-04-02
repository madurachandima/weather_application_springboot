package com.madura.weather.application.service;


import com.madura.weather.application.constant.ApiConstant;
import com.madura.weather.application.entities.Place;
import com.madura.weather.application.entities.ResponseModel;
import com.madura.weather.application.entities.WeatherModel;
import com.madura.weather.application.gsonConverter.ObjectToJson;

import java.util.HashMap;
import java.util.Map;

public class ReturnWeatherResponse {

    private WeatherModel weatherModel;
    private Place place;
    private ResponseModel responseModel;


    public String returnWeatherResponse(String latitude, String longitude) throws IndexOutOfBoundsException {

        Map<String, String> weatherParamMap = new HashMap<>();
        weatherParamMap.put(ApiConstant.WEATHER_LATITUDE, latitude);
        weatherParamMap.put(ApiConstant.WEATHER_LONGITUDE, longitude);
        weatherParamMap.put(ApiConstant.WEATHER_APP_ID, ApiConstant.WEATHER_API_KEY);
        weatherParamMap.put(ApiConstant.WEATHER_UNIT_TYPE, ApiConstant.WEATHER_UNIT);

        weatherModel = (WeatherModel) new AccessApi(weatherParamMap, ApiConstant.WEATHER_BASE_URL, ApiConstant.WEATHER_API_URL, WeatherModel.class).callApis();

        Map<String, String> placeParamMap = new HashMap<>();
        placeParamMap.put(ApiConstant.GEO_ACCESS_KEY, ApiConstant.GEO_API_KEY);
        placeParamMap.put(ApiConstant.GEO_QUERY, latitude + "," + longitude);

        place = (Place) new AccessApi(placeParamMap, ApiConstant.GEO_BASE_API, ApiConstant.GEO_REVERSE_API, Place.class).callApis();

        responseModel = new ResponseModel(weatherModel.getCurrent().getTemp(),
                weatherModel.getCurrent().getHumidity(), weatherModel.getCurrent().getWind_speed(),
                weatherModel.getCurrent().getClouds(), weatherModel.getCurrent().getWeather().get(0).getMain(),
                weatherModel.getCurrent().getWeather().get(0).getDescription(), place.getData().get(0).getRegion(),
                place.getData().get(0).getCountry()
        );


        return new ObjectToJson().JsonConverter(responseModel).toString();
    }
}
