package com.example.test.model.route;

import com.example.test.model.BustimeResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

/**
 * Created by thomasdutta on 1/12/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class RouteBustimeResponse extends BustimeResponse {
    ArrayList<Route> routes;

    public ArrayList<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(ArrayList<Route> routes) {
        this.routes = routes;
    }
}
