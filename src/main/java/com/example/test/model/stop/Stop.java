package com.example.test.model.stop;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by thomasdutta on 1/12/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Stop {
    String stpid;
    String stpnm;
    String lat;
    String lon;

    public String getStpid() {
        return stpid;
    }

    public void setStpid(String stpid) {
        this.stpid = stpid;
    }

    public String getStpnm() {
        return stpnm;
    }

    public void setStpnm(String stpnm) {
        this.stpnm = stpnm;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }
}
