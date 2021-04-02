let JsonObj;
let temperature;
let humidity;
let wind_speed;
let main;
let description;
let clouds;
let city;
let responseStatus = "";


function getUiData(data) {
    JsonObj = data
    try {
        temperature = JsonObj["temp"];
        humidity = JsonObj["humidity"];
        wind_speed = JsonObj["wind_speed"];
        main = JsonObj["main"];
        description = JsonObj ["description"];
        clouds = JsonObj["clouds"];
        city = JsonObj["region"];
        responseStatus = JsonObj["status"]
        if (typeof responseStatus !== "undefined") {
            alert("something went to wrong : " + responseStatus);
            getCoordinate();
        }

    } catch (e) {

    }

    setToUiData();
}

function setToUiData() {

    let dateTimeMap = returnDateTimeMap();

    let dateTimeString = dateTimeMap.get("time") + " - " + dateTimeMap.get("calenderDay") +
        ", " + dateTimeMap.get("day") + " " + dateTimeMap.get("month") + " '" + dateTimeMap.get("year");

    $("#temp").text(temperature + "°");
    $("#humidity").text(humidity + "%");
    $("#wind_speed").text(mPsToKmphConverter(wind_speed) + "km/h")
    $("#clouds").text(clouds + "%");
    $("#date_time").text(dateTimeString);
    $("#status").text(main)
    $("#city").text(city);

    document.getElementById("weatherIcon").className = returnWeatherStatusIcon(main);

}