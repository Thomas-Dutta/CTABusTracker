package com.example.test.model.route;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by thomasdutta on 1/12/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Route {
    String rt;
    String rtnm;
    String rtclr;
    String rtdd;

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getRtnm() {
        return rtnm;
    }

    public void setRtnm(String rtnm) {
        this.rtnm = rtnm;
    }

    public String getRtclr() {
        return rtclr;
    }

    public void setRtclr(String rtclr) {
        this.rtclr = rtclr;
    }

    public String getRtdd() {
        return rtdd;
    }

    public void setRtdd(String rtdd) {
        this.rtdd = rtdd;
    }
}
