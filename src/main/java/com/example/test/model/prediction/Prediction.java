package com.example.test.model.prediction;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by thomasdutta on 1/12/17.
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Prediction {
    String tmstmp;
    String typ;
    String stpnm;
    String stpid;
    String vid;
    String dstp;
    String rt;
    String rtdd;
    String rtdir;
    String des;
    String prdtm;
    String tablockid;
    String tatripid;
    String dly;
    String prdctdn;
    String zone;

    public String getTmstmp() {
        return tmstmp;
    }

    public void setTmstmp(String tmstmp) {
        this.tmstmp = tmstmp;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getStpnm() {
        return stpnm;
    }

    public void setStpnm(String stpnm) {
        this.stpnm = stpnm;
    }

    public String getStpid() {
        return stpid;
    }

    public void setStpid(String stpid) {
        this.stpid = stpid;
    }

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getDstp() {
        return dstp;
    }

    public void setDstp(String dstp) {
        this.dstp = dstp;
    }

    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    public String getRtdd() {
        return rtdd;
    }

    public void setRtdd(String rtdd) {
        this.rtdd = rtdd;
    }

    public String getRtdir() {
        return rtdir;
    }

    public void setRtdir(String rtdir) {
        this.rtdir = rtdir;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getPrdtm() {
        return prdtm;
    }

    public void setPrdtm(String prdtm) {
        this.prdtm = prdtm;
    }

    public String getTablockid() {
        return tablockid;
    }

    public void setTablockid(String tablockid) {
        this.tablockid = tablockid;
    }

    public String getTatripid() {
        return tatripid;
    }

    public void setTatripid(String tatripid) {
        this.tatripid = tatripid;
    }

    public String getDly() {
        return dly;
    }

    public void setDly(String dly) {
        this.dly = dly;
    }

    public String getPrdctdn() {
        return prdctdn;
    }

    public void setPrdctdn(String prdctdn) {
        this.prdctdn = prdctdn;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}

