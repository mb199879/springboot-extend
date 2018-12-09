package com.example.demo.controller;

import com.example.demo.bean.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by meibo on 18/12/9.
 */
@Controller
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/query")
    @ResponseBody
    public List<UserEntity> selectAllUser() {
        List<UserEntity> list = userService.selectAllUser();
        return list;
    }

//    @RequestMapping("/insert")
//    public List<UserEntity> testInsert() {
//        userService.insertService();
//        return userService.selectAllUser();
//    }
//
//
//    @RequestMapping("/changemoney")
//    public List<User> testchangemoney() {
//        userService.changemoney();
//        return userService.selectAllUser();
//    }
//
//    @RequestMapping("/delete")
//    public String testDelete() {
//        userService.deleteService(3);
//        return "OK";
//    }

}
