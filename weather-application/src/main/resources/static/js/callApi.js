function callApis(requestData, isCallWeatherAPI) {
    let requestParam = "";
    let apiUrl = "";

    switch (isCallWeatherAPI) {
        case IS_NEED_LAT_LON.YES:
            requestParam = {
                lat: requestData.get("lat"),
                lon: requestData.get("lon"),
            };
            apiUrl = POST_GEO_API;
            break;

        case IS_NEED_LAT_LON.NO:
            requestParam = {
                country: requestData.get("country"),
                city: requestData.get("city"),
            };
            apiUrl = POST_CITY_API;
            break;
    }
    try {
        $.ajax({
            type: HTTP_METHOD.POST,
            url: apiUrl,
            data: requestParam,
            crossDomain: true,
            dataType: "json",
            success: function (data, status, jqXHR) {
                getUiData(data);
            },
            error: function (jqXHR, status) {
            }
        });

    } catch (e) {
    }
}