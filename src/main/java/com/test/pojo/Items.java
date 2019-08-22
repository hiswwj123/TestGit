package com.test.pojo;

import java.util.Date;

/**
 * @Author:wangjun
 * @Data:Createa in 2019/7/31 0031 17:04
 */
//商品类
public class Items {
    private int id;
    private String name;
    private float privce;
    private String detail;
    private String pic;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrivce() {
        return privce;
    }

    public void setPrivce(float privce) {
        this.privce = privce;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Items(int id, String name, float privce, String detail, String pic, Date createTime) {
        this.id = id;
        this.name = name;
        this.privce = privce;
        this.detail = detail;
        this.pic = pic;
        this.createTime = createTime;
    }

    public Items() {
    }

    @Override
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", privce=" + privce +
                ", detail='" + detail + '\'' +
                ", pic='" + pic + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
