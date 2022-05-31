package com.example.cinema.entity;

import java.io.Serializable;

/**
 * (MovieFile)实体类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
public class MovieFile implements Serializable {
    private static final long serialVersionUID = -19856650437269462L;
    /**
     * 文件ID
     */
    private String fileId;
    /**
     * 文件名称
     */
    private String fileName;
    /**
     * 文件访问ID
     */
    private String fileSerialNumber;
    /**
     * 文件根路径
     */
    private String filePath;
    /**
     * 文件上传用户
     */
    private String fileUploadUserId;
    /**
     * 文件上传时间
     */
    private String fileUploadTime;
    /**
     * 文件说明
     */
    private String fileDescription;


    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileSerialNumber() {
        return fileSerialNumber;
    }

    public void setFileSerialNumber(String fileSerialNumber) {
        this.fileSerialNumber = fileSerialNumber;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getFileUploadUserId() {
        return fileUploadUserId;
    }

    public void setFileUploadUserId(String fileUploadUserId) {
        this.fileUploadUserId = fileUploadUserId;
    }

    public String getFileUploadTime() {
        return fileUploadTime;
    }

    public void setFileUploadTime(String fileUploadTime) {
        this.fileUploadTime = fileUploadTime;
    }

    public String getFileDescription() {
        return fileDescription;
    }

    public void setFileDescription(String fileDescription) {
        this.fileDescription = fileDescription;
    }

}

