package com.pinming.travelapp.pojo;

import java.util.Date;

public class Appraise {
    private Integer id;

    private Integer ordernum;

    private String appraise;

    private String apmenimg;

    private String apmen;

    private Date aptime;

    private Integer sungrade;

    private Integer servegra;

    private Integer placegra;

    private Integer facilitygra;

    private Integer surrgadegra;

    private String respond;

    private String imapath;

    private String imapath2;

    private String imapath3;

    private String imapath4;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public String getAppraise() {
        return appraise;
    }

    public void setAppraise(String appraise) {
        this.appraise = appraise == null ? null : appraise.trim();
    }

    public String getApmenimg() {
        return apmenimg;
    }

    public void setApmenimg(String apmenimg) {
        this.apmenimg = apmenimg == null ? null : apmenimg.trim();
    }

    public String getApmen() {
        return apmen;
    }

    public void setApmen(String apmen) {
        this.apmen = apmen == null ? null : apmen.trim();
    }

    public Date getAptime() {
        return aptime;
    }

    public void setAptime(Date aptime) {
        this.aptime = aptime;
    }

    public Integer getSungrade() {
        return sungrade;
    }

    public void setSungrade(Integer sungrade) {
        this.sungrade = sungrade;
    }

    public Integer getServegra() {
        return servegra;
    }

    public void setServegra(Integer servegra) {
        this.servegra = servegra;
    }

    public Integer getPlacegra() {
        return placegra;
    }

    public void setPlacegra(Integer placegra) {
        this.placegra = placegra;
    }

    public Integer getFacilitygra() {
        return facilitygra;
    }

    public void setFacilitygra(Integer facilitygra) {
        this.facilitygra = facilitygra;
    }

    public Integer getSurrgadegra() {
        return surrgadegra;
    }

    public void setSurrgadegra(Integer surrgadegra) {
        this.surrgadegra = surrgadegra;
    }

    public String getRespond() {
        return respond;
    }

    public void setRespond(String respond) {
        this.respond = respond == null ? null : respond.trim();
    }

    public String getImapath() {
        return imapath;
    }

    public void setImapath(String imapath) {
        this.imapath = imapath == null ? null : imapath.trim();
    }

    public String getImapath2() {
        return imapath2;
    }

    public void setImapath2(String imapath2) {
        this.imapath2 = imapath2 == null ? null : imapath2.trim();
    }

    public String getImapath3() {
        return imapath3;
    }

    public void setImapath3(String imapath3) {
        this.imapath3 = imapath3 == null ? null : imapath3.trim();
    }

    public String getImapath4() {
        return imapath4;
    }

    public void setImapath4(String imapath4) {
        this.imapath4 = imapath4 == null ? null : imapath4.trim();
    }
}