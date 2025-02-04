package com.zj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

/**
 * @author zhoujian
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ad_user")
public class AdUser {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id",nullable = false)
    private long id;

    @Basic
    @Column(name = "username",nullable = false)
    private String username;
    @Basic
    @Column(name = "token",nullable = false)
    private String token;
    @Basic
    @Column(name = "user_status",nullable = false)
    private Integer userStatus;
    @Basic
    @Column(name = "create_time",nullable = false)
    private Date createTime;
    @Basic
    @Column(name = "update_time",nullable = false)
    private Date updateTime;
//标识为不是数据库的字段
//    @Transient
//    private String outData;

    public AdUser(String username,String token){
        this.username = username;
        this.token = token;
        this.userStatus = Constant.VIAL.getStatus();
        this.createTime = new Date();
        this.updateTime = this.createTime;
    }


}
