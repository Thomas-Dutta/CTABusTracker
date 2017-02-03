package com.example.test.service;

import com.example.test.model.direction.DirectionBustimeResponse;
import com.example.test.model.direction.DirectionResponse;
import com.example.test.model.prediction.PredictionBustimeResponse;
import com.example.test.model.prediction.PredictionResponse;
import com.example.test.model.route.RouteBustimeResponse;
import com.example.test.model.route.RouteResponse;
import com.example.test.model.stop.StopBustimeResponse;
import com.example.test.model.stop.StopResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URL;

/**
 * Created by thomasdutta on 1/13/17.
 */

@Service
public class RestConsumerService {


    @Autowired
    RestTemplate restTemplate;

    @Value("${query.key}")
    String key;

    @Value("${query.format}")
    String format;

    public RouteBustimeResponse getRoute(){
        String url = UriComponentsBuilder
                .newInstance()
                .scheme("http")
                .host("ctabustracker.com")
                .path("/bustime/api/v2/getroutes")
                .queryParam("key", key)
                .queryParam("format", format)
                .build().toUriString();

        RouteResponse response = restTemplate.getForObject(url, RouteResponse.class);
        return response.getBustimeResponse();
    }

    public StopBustimeResponse getStop(String route, String direction){
        String url = UriComponentsBuilder
                .newInstance()
                .scheme("http")
                .host("ctabustracker.com")
                .path("/bustime/api/v2/getstops")
                .queryParam("key", key)
                .queryParam("rt", route)
                .queryParam("dir", direction)
                .queryParam("format", format)
                .build().toUriString();

        StopResponse response = restTemplate.getForObject(url, StopResponse.class);
        return response.getBustimeResponse();
    }

    public DirectionBustimeResponse getDirection(String route) {
        String url = UriComponentsBuilder
                .newInstance()
                .scheme("http")
                .host("ctabustracker.com")
                .path("/bustime/api/v2/getdirections")
                .queryParam("key", key)
                .queryParam("rt", route)
                .queryParam("format", format)
                .build().toUriString();
        DirectionResponse response = restTemplate.getForObject(url,DirectionResponse.class);
        return response.getBustimeResponse();
    }


    public PredictionBustimeResponse getPredictionByRouteAndStop(String route, String stop){
        String url = UriComponentsBuilder
                .newInstance()
                .scheme("http")
                .host("ctabustracker.com")
                .path("/bustime/api/v2/getpredictions")
                .queryParam("key", key)
                .queryParam("rt", route)
                .queryParam("stpid", stop)
                .queryParam("format", format)
                .build().toUriString();

        PredictionResponse response = restTemplate.getForObject(url, PredictionResponse.class);
        return response.getBustimeResponse();
    }

}
