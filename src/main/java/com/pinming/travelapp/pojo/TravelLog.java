package com.pinming.travelapp.pojo;

import io.swagger.annotations.ApiModelProperty;

public class TravelLog {
    @ApiModelProperty(value ="旅行故事的id")
    private Integer id;

    private String address;

    private String comment;

    /*private String uid;*/

    private Integer likenum;

    private Integer collectnum;

    private String overview;

    private User user;

    private Like like;

    private Collect collect;


    public Collect getCollect() {
        return collect;
    }

    public void setCollect(Collect collect) {
        this.collect = collect;
    }

    public Like getLike() {
        return like;
    }

    public void setLike(Like like) {
        this.like = like;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getLikenum() {
        return likenum;
    }

    public void setLikenum(Integer likenum) {
        this.likenum = likenum;
    }

    public Integer getCollectnum() {
        return collectnum;
    }

    public void setCollectnum(Integer collectnum) {
        this.collectnum = collectnum;
    }

    /*public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }*/

    private String imgpath;

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
        this.address = address == null ? null : address.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath == null ? null : imgpath.trim();
    }
}