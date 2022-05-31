package com.example.cinema.entity;

import java.io.Serializable;

/**
 * (MovieClassify)实体类
 *
 * @author makejava
 * @since 2022-05-30 11:48:00
 */
public class MovieClassify implements Serializable {
    private static final long serialVersionUID = -98907655645522627L;
    /**
     * 影片分类id
     */
    private String filmClassifyId;
    /**
     * 影片分类名
     */
    private String filmClassifyName;


    public String getFilmClassifyId() {
        return filmClassifyId;
    }

    public void setFilmClassifyId(String filmClassifyId) {
        this.filmClassifyId = filmClassifyId;
    }

    public String getFilmClassifyName() {
        return filmClassifyName;
    }

    public void setFilmClassifyName(String filmClassifyName) {
        this.filmClassifyName = filmClassifyName;
    }

}

