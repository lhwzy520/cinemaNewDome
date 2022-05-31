package com.example.cinema.entity;

import java.io.Serializable;

/**
 * (MovieFilmCollect)实体类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
public class MovieFilmCollect implements Serializable {
    private static final long serialVersionUID = 401512967276943412L;
    /**
     * 收藏id
     */
    private String collectId;
    /**
     * 收藏的影片id
     */
    private String filmCollectId;
    /**
     * 收藏的用户id
     */
    private String filmCollectUserId;


    public String getCollectId() {
        return collectId;
    }

    public void setCollectId(String collectId) {
        this.collectId = collectId;
    }

    public String getFilmCollectId() {
        return filmCollectId;
    }

    public void setFilmCollectId(String filmCollectId) {
        this.filmCollectId = filmCollectId;
    }

    public String getFilmCollectUserId() {
        return filmCollectUserId;
    }

    public void setFilmCollectUserId(String filmCollectUserId) {
        this.filmCollectUserId = filmCollectUserId;
    }

}

