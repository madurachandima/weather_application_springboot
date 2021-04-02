package com.madura.weather.application.service;


import com.madura.weather.application.constant.ApiConstant;
import com.madura.weather.application.entities.Place;

import java.util.HashMap;
import java.util.Map;

public class ReturnGeoLocation {

   private Place place;

    public Place returnGeoLocation(String country, String city) throws IndexOutOfBoundsException {
        Map locationParam = new HashMap();
        locationParam.put(ApiConstant.GEO_ACCESS_KEY, ApiConstant.GEO_API_KEY);
        locationParam.put(ApiConstant.GEO_COUNTRY, country);
        locationParam.put(ApiConstant.GEO_QUERY, city);

        place = (Place) new AccessApi(locationParam, ApiConstant.GEO_BASE_API, ApiConstant.GEO_FORWARD_API, Place.class).callApis();

        return place;

    }
}
