package com.muyang.recyclerviewdemo;

import android.widget.Button;
import android.widget.ImageView;

import java.io.Serializable;

/**
 * Created by muyang on 2016/5/12.
 * 数据实体类
 */
public class Model implements Serializable {

    private static final long serialVersionUID = -1131744553748448647L;
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
