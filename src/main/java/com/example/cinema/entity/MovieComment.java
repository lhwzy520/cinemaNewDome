package com.example.cinema.entity;

import java.io.Serializable;

/**
 * (MovieComment)实体类
 *
 * @author makejava
 * @since 2022-05-30 11:48:00
 */
public class MovieComment implements Serializable {
    private static final long serialVersionUID = -44546170303139858L;
    /**
     * 评论id
     */
    private String commentId;
    /**
     * 评论头像
     */
    private String commentAvatar;
    /**
     * 评论内容
     */
    private String commentContent;
    /**
     * 评论时间
     */
    private String commentCreateTime;
    /**
     * 评论昵称
     */
    private String commentNickName;
    /**
     * 评论的影片id
     */
    private String commentFlimId;
    /**
     * 回复评论的id
     */
    private String commentParentId;


    public String getCommentId() {
        return commentId;
    }

    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    public String getCommentAvatar() {
        return commentAvatar;
    }

    public void setCommentAvatar(String commentAvatar) {
        this.commentAvatar = commentAvatar;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public String getCommentCreateTime() {
        return commentCreateTime;
    }

    public void setCommentCreateTime(String commentCreateTime) {
        this.commentCreateTime = commentCreateTime;
    }

    public String getCommentNickName() {
        return commentNickName;
    }

    public void setCommentNickName(String commentNickName) {
        this.commentNickName = commentNickName;
    }

    public String getCommentFlimId() {
        return commentFlimId;
    }

    public void setCommentFlimId(String commentFlimId) {
        this.commentFlimId = commentFlimId;
    }

    public String getCommentParentId() {
        return commentParentId;
    }

    public void setCommentParentId(String commentParentId) {
        this.commentParentId = commentParentId;
    }

}

