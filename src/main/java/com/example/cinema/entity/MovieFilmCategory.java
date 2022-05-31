package com.example.cinema.entity;

import java.io.Serializable;

/**
 * (MovieFilmCategory)实体类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
public class MovieFilmCategory implements Serializable {
    private static final long serialVersionUID = -32115339713297448L;
    /**
     * 影片类型id
     */
    private String filmCategoryId;
    /**
     * 影片类型名
     */
    private String filmCategoryName;


    public String getFilmCategoryId() {
        return filmCategoryId;
    }

    public void setFilmCategoryId(String filmCategoryId) {
        this.filmCategoryId = filmCategoryId;
    }

    public String getFilmCategoryName() {
        return filmCategoryName;
    }

    public void setFilmCategoryName(String filmCategoryName) {
        this.filmCategoryName = filmCategoryName;
    }

}

