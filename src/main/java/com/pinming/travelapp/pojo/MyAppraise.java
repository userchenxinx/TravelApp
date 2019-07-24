package com.pinming.travelapp.pojo;

public class MyAppraise {
    private Integer id;
    private Integer ordernum;
    private String imapath;

    private String myappraise;

    // 1表示已评价0表示未评价
    private Integer status;

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

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

    public String getImapath() {
        return imapath;
    }

    public void setImapath(String imapath) {
        this.imapath = imapath;
    }

    public String getMyappraise() {
        return myappraise;
    }

    public void setMyappraise(String myappraise) {
        this.myappraise = myappraise;
    }
}
