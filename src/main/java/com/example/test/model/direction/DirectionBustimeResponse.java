package com.example.test.model.direction;

import com.example.test.model.BustimeResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

/**
 * Created by thomasdutta on 1/12/17.
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class DirectionBustimeResponse extends BustimeResponse {
    ArrayList<Direction> directions;

    public ArrayList<Direction> getDirections() {
        return directions;
    }

    public void setDirections(ArrayList<Direction> directions) {
        this.directions = directions;
    }
}

