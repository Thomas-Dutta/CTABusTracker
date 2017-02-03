package com.example.test.service;

/**
 * Created by thomasdutta on 1/13/17.
 */

import com.example.test.model.stop.Stop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class StopService {

    @Autowired
    RestConsumerService restConsumerService;

    public Map<String, String> getStop(String route, String direction) {
        HashMap<String, String> map = new HashMap<>();
        ArrayList<Stop> stops = restConsumerService.getStop(route, direction).getStops();
        for (Stop stop : stops) {
            map.put(stop.getStpid(), stop.getStpnm());
        }
        return map;
    }
}
