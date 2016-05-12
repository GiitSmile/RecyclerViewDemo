package com.muyang.recyclerviewdemo;

import android.widget.ImageView;

/**
 * Created by muyang on 2016/5/12.
 * 数据实体类
 */
public class Model {

    private String title;
    private String desc;
    private int imgId;

    public Model(String title, String desc, int imgId) {
        this.title = title;
        this.desc = desc;
        this.imgId = imgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(ImageView img) {
        this.imgId = imgId;
    }

    @Override
    public String toString() {
        return "Model{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                ", img=" + imgId +
                '}';
    }
}
