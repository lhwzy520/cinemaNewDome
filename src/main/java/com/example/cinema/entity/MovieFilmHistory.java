package com.example.cinema.entity;

import java.io.Serializable;

/**
 * (MovieFilmHistory)实体类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
public class MovieFilmHistory implements Serializable {
    private static final long serialVersionUID = 214498392902468017L;
    /**
     * 历史id
     */
    private String historyId;
    /**
     * 观看影片id
     */
    private String filmHistoryId;
    /**
     * 影片观看时间
     */
    private String filmTime;
    /**
     * 影片观看用户
     */
    private String filmUserId;


    public String getHistoryId() {
        return historyId;
    }

    public void setHistoryId(String historyId) {
        this.historyId = historyId;
    }

    public String getFilmHistoryId() {
        return filmHistoryId;
    }

    public void setFilmHistoryId(String filmHistoryId) {
        this.filmHistoryId = filmHistoryId;
    }

    public String getFilmTime() {
        return filmTime;
    }

    public void setFilmTime(String filmTime) {
        this.filmTime = filmTime;
    }

    public String getFilmUserId() {
        return filmUserId;
    }

    public void setFilmUserId(String filmUserId) {
        this.filmUserId = filmUserId;
    }

}

