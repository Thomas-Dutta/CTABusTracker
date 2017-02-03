package com.example.test.model.route;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by thomasdutta on 1/12/17.
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class RouteResponse {
    @JsonProperty("bustime-response")
    RouteBustimeResponse bustimeResponse;

    public RouteBustimeResponse getBustimeResponse() {
        return bustimeResponse;
    }

    public void setBustimeResponse(RouteBustimeResponse bustimeResponse) {
        this.bustimeResponse = bustimeResponse;
    }
}
