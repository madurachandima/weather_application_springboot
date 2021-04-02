package com.madura.weather.application.service;


import com.madura.weather.application.gsonConverter.JsonToObject;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class AccessApi {

    private Object result;
    private Map<String, String> params;
    private String baseUrl;
    private String apiUrl;
    private Object classObject;


    public AccessApi(Map<String, String> params, String baseUrl, String apiUrl, Object classObject) {
        this.params = params;
        this.baseUrl = baseUrl;
        this.apiUrl = apiUrl;
        this.classObject = classObject;
    }


    public Object callApis() {

        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();

            HttpGet httpGet = new HttpGet(baseUrl + apiUrl);

            URIBuilder uriBuilder = new URIBuilder(httpGet.getURI());

            for (Map.Entry<String, String> map : params.entrySet())
                uriBuilder.addParameter(map.getKey(), map.getValue());

            httpGet.setURI(uriBuilder.build());
            CloseableHttpResponse httpResponse = httpClient.execute(httpGet);

            String responseBody = EntityUtils.toString(httpResponse.getEntity());
            result = new JsonToObject().ObjectConverter(responseBody,classObject);


        } catch (URISyntaxException | IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
