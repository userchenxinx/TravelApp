package com.pinming.travelapp.pojo;

public class Setport {
    private Integer id;

    private String settype;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSettype() {
        return settype;
    }

    public void setSettype(String settype) {
        this.settype = settype == null ? null : settype.trim();
    }
}