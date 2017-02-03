package com.example.test.model.stop;

import com.example.test.model.BustimeResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

/**
 * Created by thomasdutta on 1/12/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class StopBustimeResponse extends BustimeResponse {

    ArrayList<Stop> stops;

    public ArrayList<Stop> getStops() {
        return stops;
    }

    public void setStops(ArrayList<Stop> stops) {
        this.stops = stops;
    }
}