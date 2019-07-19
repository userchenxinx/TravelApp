package com.pinming.travelapp.pojo;

public class Takeadds {
    private Integer id;

    private String name;

    private String phone;

    private String area;

    private String detailadds;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getDetailadds() {
        return detailadds;
    }

    public void setDetailadds(String detailadds) {
        this.detailadds = detailadds == null ? null : detailadds.trim();
    }
}