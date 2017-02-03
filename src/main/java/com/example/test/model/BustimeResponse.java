package com.example.test.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class BustimeResponse {
    ArrayList<Message> error;

    public ArrayList<Message> getError() {
        return error;
    }

    public void setError(ArrayList<Message> error) {
        this.error = error;
    }
}
