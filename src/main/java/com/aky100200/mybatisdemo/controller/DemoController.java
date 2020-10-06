package com.aky100200.mybatisdemo.controller;

import com.aky100200.mybatisdemo.entity.UserInfo;
import com.aky100200.mybatisdemo.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @Autowired
    UserInfoMapper userInfoMapper;

    @GetMapping("/")
    public String index() {
        List<UserInfo> list = userInfoMapper.selectAll();

        StringBuilder sb = new StringBuilder();
        list.forEach(user -> {
            sb.append("user.getId() -> " + user.getId() + "\n");
            sb.append("user.getName() -> " + user.getName() + "\n");
            sb.append("user.getSex() -> " + user.getSex() + "\n");
        });

        return sb.toString();
    }
}