package com.pinming.travelapp.pojo;

import io.swagger.annotations.ApiModelProperty;

/**
 * @author: djs
 * @create: 2019-07-20 10:16
 **/
public class Like {

    @ApiModelProperty(value ="点赞表的id")
    private Integer id;
    @ApiModelProperty(value ="用户的id")
    private Integer uid;
    @ApiModelProperty(value ="旅行故事的id")
    private Integer tid;
    /*@ApiModelProperty(value ="点赞状态id")
    private Integer status;*/

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
