package com.pinming.travelapp.pojo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author: djs
 * @create: 2019-07-22 20:13
 **/
public class Collect {
    //@ApiModelProperty(value ="点赞表的id")
    private Integer id;
    @ApiModelProperty(value ="用户的id")
    private Integer uid;
    @ApiModelProperty(value ="旅行故事的id")
    private Integer tid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}
