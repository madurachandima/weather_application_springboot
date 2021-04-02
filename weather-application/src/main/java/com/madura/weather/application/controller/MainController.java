package com.madura.weather.application.controller;

import com.madura.weather.application.entities.Place;
import com.madura.weather.application.service.ReturnGeoLocation;
import com.madura.weather.application.service.ReturnWeatherResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping(value = "/index")
    public String showWeather() {
        return "showWeather";
    }

    @RequestMapping(value = "/postcordinates", method = RequestMethod.POST)
    @ResponseBody
    public String postWeather(@RequestParam("lat") String latitude, @RequestParam("lon") String longitude) {
        String response = "";
        if (!longitude.isEmpty() && !latitude.isEmpty()) {
            try {
                response = new ReturnWeatherResponse().returnWeatherResponse(latitude, longitude);
            } catch (IndexOutOfBoundsException e) {
                return response = " {\"status\":500}";
            }
        }
        return response;
    }

    @RequestMapping(value = "/seacrhcityname", method = RequestMethod.POST)
    @ResponseBody
    public String searchWeather(@RequestParam("country") String countryName, @RequestParam("city") String city) {
        Place place;
        String latitude = "";
        String longitude = "";
        String response = "";

        if (!countryName.isEmpty() && !city.isEmpty()) {
            try {
                place = new ReturnGeoLocation().returnGeoLocation(countryName, city);
                latitude = place.getData().get(0).getLatitude();
                longitude = place.getData().get(0).getLongitude();

                if (!latitude.isEmpty() && !longitude.isEmpty()) {
                    response = new ReturnWeatherResponse().returnWeatherResponse(latitude, longitude);
                }
            } catch (IndexOutOfBoundsException e) {
                return response = " {\"status\":500}";
            }
        }
        return response;
    }


}
