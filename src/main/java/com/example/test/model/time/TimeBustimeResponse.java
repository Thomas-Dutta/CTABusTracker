package com.example.test.model.time;

import com.example.test.model.BustimeResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by thomasdutta on 1/12/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeBustimeResponse extends BustimeResponse {
    String tm;

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }
}

