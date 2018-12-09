package com.example.demo.bean;

import lombok.Data;

import java.util.Date;

/**
 * Created by meibo on 18/11/8.
 */
@Data
public class UserEntity {
    private Integer userId;
    private String userName;
    private String password;
    private String realName;
    private String phone;
    private String email;
    private String token;
    private Date expireTime;
}
