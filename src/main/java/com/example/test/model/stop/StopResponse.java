package com.example.test.model.stop;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by thomasdutta on 1/12/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class StopResponse {
    @JsonProperty("bustime-response")
    StopBustimeResponse bustimeResponse;

    public StopBustimeResponse getBustimeResponse() {
        return bustimeResponse;
    }

    public void setBustimeResponse(StopBustimeResponse bustimeResponse) {
        this.bustimeResponse = bustimeResponse;
    }
}
