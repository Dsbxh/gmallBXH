package com.bxh.gmalluser.bean;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Data
public class UmsMember implements Serializable {

    @Id  //表示该字段为主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //tkMybatis在进行新增时会返回主键
    private String id;

    private String memberLevelId;

    private String username;

    private String password;

    private String nickname;

    private String phone;

    private int status;

    private Date createTime;

    private String icon;

    private int gender;

    private Date birthday;

    private String city;

    private String job;

    private String personalizedSignature;

    private int sourceType;

    private int integration;

    private int growth;

    private int luckeyCount;

    private int historyIntegration;
}

