package com.example.test.model.vehicle;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by thomasdutta on 1/12/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class VehicleResponse {
    @JsonProperty("bustime-response")
    VehicleBustimeResponse bustimeResponse;

    public VehicleBustimeResponse getBustimeResponse() {
        return bustimeResponse;
    }

    public void setBustimeResponse(VehicleBustimeResponse bustimeResponse) {
        this.bustimeResponse = bustimeResponse;
    }
}
