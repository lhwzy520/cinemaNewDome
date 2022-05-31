package com.example.cinema.entity;

import java.io.Serializable;

/**
 * (MovieScore)实体类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
public class MovieScore implements Serializable {
    private static final long serialVersionUID = 735125590506242624L;
    /**
     * 评分id
     */
    private String scoreId;
    /**
     * 评分的电影id
     */
    private String filmScoreId;
    /**
     * 评分成绩
     */
    private Integer scoreGrade;


    public String getScoreId() {
        return scoreId;
    }

    public void setScoreId(String scoreId) {
        this.scoreId = scoreId;
    }

    public String getFilmScoreId() {
        return filmScoreId;
    }

    public void setFilmScoreId(String filmScoreId) {
        this.filmScoreId = filmScoreId;
    }

    public Integer getScoreGrade() {
        return scoreGrade;
    }

    public void setScoreGrade(Integer scoreGrade) {
        this.scoreGrade = scoreGrade;
    }

}

