package com.example.test.model.direction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by thomasdutta on 1/12/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class DirectionResponse {
    @JsonProperty("bustime-response")
    DirectionBustimeResponse bustimeResponse;

    public DirectionBustimeResponse getBustimeResponse() {
        return bustimeResponse;
    }

    public void setBustimeResponse(DirectionBustimeResponse bustimeResponse) {
        this.bustimeResponse = bustimeResponse;
    }
}
