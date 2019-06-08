package com.gdou.survey.entity;

import java.io.Serializable;
import java.util.Date;

//用户类
public class User implements Serializable {
    //用户ID
    private int userId;
    //提交日期
    private Date creatTime;
    //用户名字
    private String userName;
    //用户问题一答案
    private String userQ1;
    //用户问题二答案
    private String userQ2;
    //用户问题三答案
    private String userQ3;
    //用户问题四答案
    private String userQ4;
    //用户问题五答案
    private String userQ5;
    //用户问题六答案
    private String userQ6;
    //用户问题六答案
    private String userQ7;
    //用户手机
    private String userTel;

    public User() {
    }

    public User(int userId, Date creatTime, String userName, String userQ1, String userQ2, String userQ3, String userQ4, String userQ5, String userQ6, String userQ7, String userTel) {
        this.userId = userId;
        this.creatTime = creatTime;
        this.userName = userName;
        this.userQ1 = userQ1;
        this.userQ2 = userQ2;
        this.userQ3 = userQ3;
        this.userQ4 = userQ4;
        this.userQ5 = userQ5;
        this.userQ6 = userQ6;
        this.userQ7 = userQ7;
        this.userTel = userTel;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", creatTime=" + creatTime +
                ", userName='" + userName + '\'' +
                ", userQ1='" + userQ1 + '\'' +
                ", userQ2='" + userQ2 + '\'' +
                ", userQ3='" + userQ3 + '\'' +
                ", userQ4='" + userQ4 + '\'' +
                ", userQ5='" + userQ5 + '\'' +
                ", userQ6='" + userQ6 + '\'' +
                ", userQ7='" + userQ7 + '\'' +
                ", userTel='" + userTel + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getCreatTime() {
        return creatTime;
    }

    public void setCreatTime(Date creatTime) {
        this.creatTime = creatTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserQ1() {
        return userQ1;
    }

    public void setUserQ1(String userQ1) {
        this.userQ1 = userQ1;
    }

    public String getUserQ2() {
        return userQ2;
    }

    public void setUserQ2(String userQ2) {
        this.userQ2 = userQ2;
    }

    public String getUserQ3() {
        return userQ3;
    }

    public void setUserQ3(String userQ3) {
        this.userQ3 = userQ3;
    }

    public String getUserQ4() {
        return userQ4;
    }

    public void setUserQ4(String userQ4) {
        this.userQ4 = userQ4;
    }

    public String getUserQ5() {
        return userQ5;
    }

    public void setUserQ5(String userQ5) {
        this.userQ5 = userQ5;
    }

    public String getUserQ6() {
        return userQ6;
    }

    public void setUserQ6(String userQ6) {
        this.userQ6 = userQ6;
    }

    public String getUserQ7() {
        return userQ7;
    }

    public void setUserQ7(String userQ7) {
        this.userQ7 = userQ7;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }
}
