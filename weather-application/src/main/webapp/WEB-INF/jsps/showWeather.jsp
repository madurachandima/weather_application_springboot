<%--
  Created by IntelliJ IDEA.
  User: Madura
  Date: 3/15/2021
  Time: 6:22 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>weather</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>
    <link rel="stylesheet" href="css/showWeather.css">
    <link href="https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css" rel="stylesheet">

    <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.bundle.min.js"></script>
    <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
    <script src="https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>

    <script src="js/constValue.js"></script>
    <script src="js/main.js"></script>
    <script src="js/callApi.js"></script>
    <script src="js/setUIData.js"></script>
    <script src="js/utill.js"></script>
    <script src="js/countryAutoComplete.js"></script>

<body onload="getCoordinate();">
<div class="container-fluid px-1 px-sm-3 py-5 mx-auto">
    <div class="row d-flex justify-content-center">
        <div class="row card0">
            <div class="card1 col-lg-8 col-md-7"><small>the.weather</small>
                <div class="text-center"><img class="image mt-5" src="https://i.imgur.com/M8VyA2h.png"></div>
                <div class="row px-3 mt-3 mb-3">
                    <h1 class="large-font mr-3" id="temp"></h1>
                    <div class="d-flex flex-column mr-3">
                        <h2 class="mt-3 mb-0" id="city"></h2> <small id="date_time"></small>
                    </div>
                    <div class="d-flex flex-column text-center">
                        <h3 class="mt-4" id="weatherIcon"></h3> <small id="status"></small>
                    </div>
                </div>
            </div>
            <div class="card2 col-lg-4 col-md-5">
                <div class="row px-3">
                    <input type="text" placeholder="Search Country Name" class="mb-5"
                           id="search_country" datasrc="">
                    </input>
                </div>
                <div class="row px-3">
                    <input type="text" name="location" placeholder="Search City Name" class="mb-5"
                           id="search_city">
                    </input>
                </div>
                <div class="row">
                    <button type="button" class="search-button  btn btn-primary btn-lg btn-block text-center"
                            id="search_location_btn" onclick="searchByCity()" value="Search Location">
                        Search Location
                    </button>
                </div>
                <div class="mr-5">
                    <%--                    <p class="light-text suggestion">Birmingham</p>--%>
                    <%--                    <p class="light-text suggestion">Manchester</p>--%>
                    <%--                    <p class="light-text suggestion">New York</p>--%>
                    <%--                    <p class="light-text suggestion">California</p>--%>
                    <div class="line my-5"></div>
                    <p>Weather Details</p>
                    <div class="row px-3">
                        <p class="light-text">Cloudy</p>
                        <p class="ml-auto" id="clouds"></p>
                    </div>
                    <div class="row px-3">
                        <p class="light-text">Humidity</p>
                        <p class="ml-auto" id="humidity"></p>
                    </div>
                    <div class="row px-3">
                        <p class="light-text">Wind</p>
                        <p class="ml-auto" id="wind_speed"></p>
                    </div>
                    <%--                    <div class="row px-3">--%>
                    <%--                        <p class="light-text">Rain</p>--%>
                    <%--                        <p class="ml-auto">0mm</p>--%>
                    <%--                    </div>--%>
                    <div class="line mt-3"></div>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
</body>
</html>



