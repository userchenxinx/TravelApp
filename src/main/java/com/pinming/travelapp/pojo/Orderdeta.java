package com.pinming.travelapp.pojo;

public class Orderdeta {
    private Integer id;

    private String hotelname;

    private Integer roomnum;

    private String roomtype;

    private String time;

    private Integer totalprice;

    private String hotelimg;
     // 订单状态 1表示订单待支付 0表示支付成功 2表示订单超时
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

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname == null ? null : hotelname.trim();
    }

    public Integer getRoomnum() {
        return roomnum;
    }

    public void setRoomnum(Integer roomnum) {
        this.roomnum = roomnum;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomtype(String roomtype) {
        this.roomtype = roomtype == null ? null : roomtype.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public String getHotelimg() {
        return hotelimg;
    }

    public void setHotelimg(String hotelimg) {
        this.hotelimg = hotelimg == null ? null : hotelimg.trim();
    }
}