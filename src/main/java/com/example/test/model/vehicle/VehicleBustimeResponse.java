package com.example.test.model.vehicle;

import com.example.test.model.BustimeResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;

/**
 * Created by thomasdutta on 1/12/17.
 */


@JsonIgnoreProperties(ignoreUnknown = true)
public class VehicleBustimeResponse extends BustimeResponse {
    ArrayList<Vehicle> vehicle;

    public ArrayList<Vehicle> getVehicle() {
        return vehicle;
    }

    public void setVehicle(ArrayList<Vehicle> vehicle) {
        this.vehicle = vehicle;
    }
}
