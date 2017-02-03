package com.example.test.model.time;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeResponse {
    @JsonProperty("bustime-response")
    TimeBustimeResponse bustimeResponse;

    public TimeBustimeResponse getBustimeResponse() {
        return bustimeResponse;
    }

    public void setBustimeResponse(TimeBustimeResponse bustimeResponse) {
        this.bustimeResponse = bustimeResponse;
    }
}
