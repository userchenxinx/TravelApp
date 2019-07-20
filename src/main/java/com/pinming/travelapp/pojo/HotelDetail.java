package com.pinming.travelapp.pojo;

import java.util.Date;

public class HotelDetail {
    private Integer id;

    private String address;

    private String hotelname;

    private Integer hotelid;

    private Integer hotelprice;

    private Integer count;

    private String imgpath;


    private Date starttime;

    private Date stoptime;


    //酒店和酒店详情  一对一关系
    private HotelDetailD hotelDetailD;

    public HotelDetailD getHotelDetailD() {
        return hotelDetailD;
    }

    public void setHotelDetailD(HotelDetailD hotelDetailD) {
        this.hotelDetailD = hotelDetailD;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname;
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public Integer getHotelprice() {
        return hotelprice;
    }

    public void setHotelprice(Integer hotelprice) {
        this.hotelprice = hotelprice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }



    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getStoptime() {
        return stoptime;
    }

    public void setStoptime(Date stoptime) {
        this.stoptime = stoptime;
    }
}
