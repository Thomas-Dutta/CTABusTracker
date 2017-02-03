package com.example.test.model.prediction;

import com.example.test.model.BustimeResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

/**
 * Created by thomasdutta on 1/12/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PredictionBustimeResponse extends BustimeResponse {

    ArrayList<Prediction> prd;

    public ArrayList<Prediction> getPrd() {
        return prd;
    }

    public void setPrd(ArrayList<Prediction> prd) {
        this.prd = prd;
    }
}
