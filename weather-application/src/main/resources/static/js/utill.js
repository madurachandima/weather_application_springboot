function mPsToKmphConverter(windSpeed) {
    return Math.round(windSpeed * 3.6);
}

function returnDateTimeMap() {

    let dateTimeMap = new Map();

    let months = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"];
    let days = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];
    let calenderDay;
    let day;
    let year;
    let month
    let hour;
    let minutes;


    let currentDate = new Date();

    calenderDay = days[currentDate.getDay()]
    day = currentDate.getDate();
    month = months[(currentDate.getMonth())];
    year = currentDate.getFullYear();
    hour = currentDate.getHours();
    minutes = currentDate.getMinutes();


    dateTimeMap.set("calenderDay", calenderDay);
    dateTimeMap.set("day", day);
    dateTimeMap.set("month", month);
    dateTimeMap.set("year", year.toString().substring(2, 4));
    dateTimeMap.set("time", hour + ":" + minutes);

    return dateTimeMap;
}

function returnWeatherStatusIcon(status) {

    let classAttribute = '';

    switch (status) {
        case 'Clouds':
            classAttribute = "fas fa-cloud mt-4";
            break;
        case'Clear':
            classAttribute = "fas fa-sun mt-4";
            break;
        case 'Fog':
            classAttribute = "fas fa-smog mt-4";
            break;
        case 'Snow ':
            classAttribute = "fas fa-snowflake mt-4";
            break;
        case 'Rain':
            classAttribute = "fas fa-cloud-rain mt-4";
            break;
        case 'Thunderstorm':
            classAttribute = "fas fa-bolt mt-4";
            break;
        default:
            classAttribute = "";
            break;
    }
    return classAttribute;
}