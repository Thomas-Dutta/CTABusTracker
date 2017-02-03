package com.example.test.model.direction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by thomasdutta on 1/12/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Direction {
    String dir;

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
}
