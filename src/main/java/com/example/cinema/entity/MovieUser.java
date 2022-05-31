package com.example.cinema.entity;

import java.io.Serializable;

/**
 * (MovieUser)实体类
 *
 * @author makejava
 * @since 2022-05-30 11:48:01
 */
public class MovieUser implements Serializable {
    private static final long serialVersionUID = 799518270202951063L;
    /**
     * ID
     */
    private String userId;
    /**
     * 序号
     */
    private Integer userSerialNumber;
    /**
     * 用户账号
     */
    private String userAccount;
    /**
     * 用户名字
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户昵称
     */
    private String userNickname;
    /**
     * 用户头像
     */
    private String userAvatar;
    /**
     * 用户说明
     */
    private String userDescription;
    /**
     * 用户个性签名
     */
    private String userPersonalSignature;
    /**
     * 用户邮箱
     */
    private String userMailbox;
    /**
     * 用户性别
     */
    private Integer userGender;
    /**
     * 用户职业
     */
    private String userOccupation;
    /**
     * 用户手机号
     */
    private String userTelephone;
    /**
     * 用户公司
     */
    private String userCompany;
    /**
     * 用户学校
     */
    private String userSchool;
    /**
     * 用户照片
     */
    private String userPhotos;
    /**
     * 用户地址
     */
    private String userAddress;
    /**
     * 用户生日
     */
    private String userBirthday;
    /**
     * 用户所在地
     */
    private String userLocation;
    /**
     * 用户属性
     */
    private Integer userAttribute;
    /**
     * 用户类型
     */
    private Integer userType;
    /**
     * 用户状态
     */
    private Integer userStatus;
    /**
     * 用户赞
     */
    private Integer userLikes;
    /**
     * 用户等级
     */
    private Integer userLevel;
    /**
     * 用户经验
     */
    private Integer userExperience;
    /**
     * 用户注册时间
     */
    private String userRegistrationTime;
    /**
     * 用户更新时间
     */
    private String userUpdateTime;
    /**
     * 用户签到
     */
    private Integer userSignIn;
    /**
     * 用户登录计数
     */
    private String userLoginCount;
    /**
     * 用户登录时间
     */
    private String userLoginTime;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getUserSerialNumber() {
        return userSerialNumber;
    }

    public void setUserSerialNumber(Integer userSerialNumber) {
        this.userSerialNumber = userSerialNumber;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserNickname() {
        return userNickname;
    }

    public void setUserNickname(String userNickname) {
        this.userNickname = userNickname;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }

    public String getUserDescription() {
        return userDescription;
    }

    public void setUserDescription(String userDescription) {
        this.userDescription = userDescription;
    }

    public String getUserPersonalSignature() {
        return userPersonalSignature;
    }

    public void setUserPersonalSignature(String userPersonalSignature) {
        this.userPersonalSignature = userPersonalSignature;
    }

    public String getUserMailbox() {
        return userMailbox;
    }

    public void setUserMailbox(String userMailbox) {
        this.userMailbox = userMailbox;
    }

    public Integer getUserGender() {
        return userGender;
    }

    public void setUserGender(Integer userGender) {
        this.userGender = userGender;
    }

    public String getUserOccupation() {
        return userOccupation;
    }

    public void setUserOccupation(String userOccupation) {
        this.userOccupation = userOccupation;
    }

    public String getUserTelephone() {
        return userTelephone;
    }

    public void setUserTelephone(String userTelephone) {
        this.userTelephone = userTelephone;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool;
    }

    public String getUserPhotos() {
        return userPhotos;
    }

    public void setUserPhotos(String userPhotos) {
        this.userPhotos = userPhotos;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(String userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getUserLocation() {
        return userLocation;
    }

    public void setUserLocation(String userLocation) {
        this.userLocation = userLocation;
    }

    public Integer getUserAttribute() {
        return userAttribute;
    }

    public void setUserAttribute(Integer userAttribute) {
        this.userAttribute = userAttribute;
    }

    public Integer getUserType() {
        return userType;
    }

    public void setUserType(Integer userType) {
        this.userType = userType;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    public Integer getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(Integer userLikes) {
        this.userLikes = userLikes;
    }

    public Integer getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(Integer userLevel) {
        this.userLevel = userLevel;
    }

    public Integer getUserExperience() {
        return userExperience;
    }

    public void setUserExperience(Integer userExperience) {
        this.userExperience = userExperience;
    }

    public String getUserRegistrationTime() {
        return userRegistrationTime;
    }

    public void setUserRegistrationTime(String userRegistrationTime) {
        this.userRegistrationTime = userRegistrationTime;
    }

    public String getUserUpdateTime() {
        return userUpdateTime;
    }

    public void setUserUpdateTime(String userUpdateTime) {
        this.userUpdateTime = userUpdateTime;
    }

    public Integer getUserSignIn() {
        return userSignIn;
    }

    public void setUserSignIn(Integer userSignIn) {
        this.userSignIn = userSignIn;
    }

    public String getUserLoginCount() {
        return userLoginCount;
    }

    public void setUserLoginCount(String userLoginCount) {
        this.userLoginCount = userLoginCount;
    }

    public String getUserLoginTime() {
        return userLoginTime;
    }

    public void setUserLoginTime(String userLoginTime) {
        this.userLoginTime = userLoginTime;
    }

}

