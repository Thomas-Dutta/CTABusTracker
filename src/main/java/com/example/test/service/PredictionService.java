package com.example.test.service;

import com.example.test.model.prediction.Prediction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by thomasdutta on 1/13/17.
 */

@Service
public class PredictionService {

    @Autowired
    RestConsumerService restConsumerService;

    public ArrayList<Prediction> getPredictionByRouteAndStop(String route, String stop) {
        ArrayList<Prediction> predictions = restConsumerService
                .getPredictionByRouteAndStop(route, stop).getPrd();
        return predictions;

    }
}
