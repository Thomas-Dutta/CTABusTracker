package com.example.test.model.prediction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by thomasdutta on 1/12/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class PredictionResponse {
    @JsonProperty("bustime-response")
    PredictionBustimeResponse bustimeResponse;

    public PredictionBustimeResponse getBustimeResponse() {
        return bustimeResponse;
    }

    public void setBustimeResponse(PredictionBustimeResponse bustimeResponse) {
        this.bustimeResponse = bustimeResponse;
    }
}
