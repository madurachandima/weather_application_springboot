function getCoordinate() {

    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition)
        let geoLocation = new Map();

        function showPosition(position) {
            geoLocation.set('lat', position.coords.latitude);
            geoLocation.set('lon', position.coords.longitude);
            callApis(geoLocation, IS_NEED_LAT_LON.YES);
        }
    }
}

function searchByCity() {
    let countryName = $("#search_country").attr('datasrc');
    let cityName = $("#search_city").val();

    if (countryName !== "" && countryName !== null && typeof countryName !== "undefined" &&
        cityName !== "" && cityName !== null && typeof cityName !== "undefined") {
        let searchParams = new Map();

        searchParams.set("country", countryName);
        searchParams.set("city", cityName);

        callApis(searchParams, IS_NEED_LAT_LON.NO);
        clearSearchValues();

    } else {
        alert("Select country name and Enter city name");
        clearSearchValues();
    }

}

function clearSearchValues() {
    $("#search_city").val("");
    $("#search_country").val("");
    $("#search_country").attr('datasrc', "");

}