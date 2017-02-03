package com.example.test.service;


import com.example.test.model.direction.Direction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@Service
public class DirectionService {
    @Autowired
    RestConsumerService restConsumerService;

    public Map<String, String> getDirection(String route) {
        HashMap<String, String> map = new HashMap<>();
        ArrayList<Direction> directions = restConsumerService.getDirection(route).getDirections();
        for (Direction direction : directions) {
            String key = direction.getDir();
            String value = null;
            if(key.toLowerCase().contains("north")) {
                value = "Northbound";
            }else if(key.toLowerCase().contains("south")) {
                value = "Southbound";
            }else if(key.toLowerCase().contains("west")) {
                value = "Westbound";
            }else if(key.toLowerCase().contains("east")) {
                value = "Eastbound";
            }else {
                value = key;
            }
            map.put(key, value);
        }
        return map;
    }
}
