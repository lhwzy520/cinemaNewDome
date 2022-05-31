package com.example.cinema.entity;

import java.io.Serializable;

/**
 * (MovieFilm)实体类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
public class MovieFilm implements Serializable {
    private static final long serialVersionUID = -67540227063420703L;
    /**
     * 影片id
     */
    private String filmId;
    /**
     * 影片名
     */
    private String filmName;
    /**
     * 影片导演名
     */
    private String filmDirector;
    /**
     * 影片演员名
     */
    private String filmActor;
    /**
     * 影片类型id
     */
    private String filmTypeId;
    /**
     * 影片简介
     */
    private String filmBrief;
    /**
     * 影片视频链接
     */
    private String filmVideoUrl;
    /**
     * 影片封面链接
     */
    private String filmSurfaceUrl;
    /**
     * 影片年代
     */
    private String filmYears;
    /**
     * 影片创建时间
     */
    private String filmCreateTime;
    /**
     * 影片修改时间
     */
    private String filmUpdateTime;
    /**
     * 影片上传用户
     */
    private String filmUserId;
    /**
     * 影片观看次数
     */
    private Integer filmWatchCount;
    /**
     * 影片一句话概述
     */
    private String filmBriefSimple;
    /**
     * 影片评分id
     */
    private String filmScoreId;
    /**
     * 影片点赞数量
     */
    private Integer filmGood;
    /**
     * 影片分类 （电影，电视剧，动漫等）
     */
    private String filmClassifyId;


    public String getFilmId() {
        return filmId;
    }

    public void setFilmId(String filmId) {
        this.filmId = filmId;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String getFilmDirector() {
        return filmDirector;
    }

    public void setFilmDirector(String filmDirector) {
        this.filmDirector = filmDirector;
    }

    public String getFilmActor() {
        return filmActor;
    }

    public void setFilmActor(String filmActor) {
        this.filmActor = filmActor;
    }

    public String getFilmTypeId() {
        return filmTypeId;
    }

    public void setFilmTypeId(String filmTypeId) {
        this.filmTypeId = filmTypeId;
    }

    public String getFilmBrief() {
        return filmBrief;
    }

    public void setFilmBrief(String filmBrief) {
        this.filmBrief = filmBrief;
    }

    public String getFilmVideoUrl() {
        return filmVideoUrl;
    }

    public void setFilmVideoUrl(String filmVideoUrl) {
        this.filmVideoUrl = filmVideoUrl;
    }

    public String getFilmSurfaceUrl() {
        return filmSurfaceUrl;
    }

    public void setFilmSurfaceUrl(String filmSurfaceUrl) {
        this.filmSurfaceUrl = filmSurfaceUrl;
    }

    public String getFilmYears() {
        return filmYears;
    }

    public void setFilmYears(String filmYears) {
        this.filmYears = filmYears;
    }

    public String getFilmCreateTime() {
        return filmCreateTime;
    }

    public void setFilmCreateTime(String filmCreateTime) {
        this.filmCreateTime = filmCreateTime;
    }

    public String getFilmUpdateTime() {
        return filmUpdateTime;
    }

    public void setFilmUpdateTime(String filmUpdateTime) {
        this.filmUpdateTime = filmUpdateTime;
    }

    public String getFilmUserId() {
        return filmUserId;
    }

    public void setFilmUserId(String filmUserId) {
        this.filmUserId = filmUserId;
    }

    public Integer getFilmWatchCount() {
        return filmWatchCount;
    }

    public void setFilmWatchCount(Integer filmWatchCount) {
        this.filmWatchCount = filmWatchCount;
    }

    public String getFilmBriefSimple() {
        return filmBriefSimple;
    }

    public void setFilmBriefSimple(String filmBriefSimple) {
        this.filmBriefSimple = filmBriefSimple;
    }

    public String getFilmScoreId() {
        return filmScoreId;
    }

    public void setFilmScoreId(String filmScoreId) {
        this.filmScoreId = filmScoreId;
    }

    public Integer getFilmGood() {
        return filmGood;
    }

    public void setFilmGood(Integer filmGood) {
        this.filmGood = filmGood;
    }

    public String getFilmClassifyId() {
        return filmClassifyId;
    }

    public void setFilmClassifyId(String filmClassifyId) {
        this.filmClassifyId = filmClassifyId;
    }

}

