package com.example.test.service;

import com.example.test.model.route.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by thomasdutta on 1/13/17.
 */

@Service
public class RouteService {

    @Autowired
    RestConsumerService restConsumerService;

    public Map<String, String> getRoute() {
        HashMap<String, String> map = new HashMap<>();
        ArrayList<Route> routes = restConsumerService.getRoute().getRoutes();
        for (Route route : routes) {
            map.put(route.getRt(), route.getRtnm());
        }
        return map;
    }
}
