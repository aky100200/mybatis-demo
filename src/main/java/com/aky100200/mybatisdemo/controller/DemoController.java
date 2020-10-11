package com.aky100200.mybatisdemo.controller;

import com.aky100200.mybatisdemo.entity.UserInfo;
import com.aky100200.mybatisdemo.mapper.UserInfoMapper;
import com.aky100200.mybatisdemo.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {

    @Autowired
    UserInfoMapper userInfoMapper;
    @Autowired
    UserInfoRepository userInfoRepository;

    @GetMapping("/")
    public String index() {
        List<UserInfo> list = userInfoMapper.selectAll();
        StringBuilder sb = new StringBuilder();
        sb.append("Mybatis:\n\n");
        list.forEach(user -> {
            sb.append("user.getId() -> " + user.getId() + "\n");
            sb.append("user.getName() -> " + user.getName() + "\n");
            sb.append("user.getSex() -> " + user.getSex() + "\n");
        });
        return sb.toString();
    }
    @GetMapping("/jpa")
    public String indexByJpa() {
        StringBuilder sb = new StringBuilder();
        sb.append("JPA:\n");

        sb.append("\nfindAll() -> \n");
        List<UserInfo> list = userInfoRepository.findAll();
        list.forEach(user -> {
            sb.append(" user.getId() -> " + user.getId() + "\n");
            sb.append(" user.getName() -> " + user.getName() + "\n");
            sb.append(" user.getSex() -> " + user.getSex() + "\n");
        });

        sb.append("\nfindUserInfoByName() -> \n");
        list = userInfoRepository.findUserInfoByName("小野寺梓");
        list.forEach(user -> {
            sb.append(" user.getId() -> " + user.getId() + "\n");
            sb.append(" user.getName() -> " + user.getName() + "\n");
            sb.append(" user.getSex() -> " + user.getSex() + "\n");
        });

        sb.append("\nfindById() -> \n");
        UserInfo userInfo = userInfoRepository.findById("00001").orElse(new UserInfo());
        sb.append(" user.getId() -> " + userInfo.getId() + "\n");
        sb.append(" user.getName() -> " + userInfo.getName() + "\n");
        sb.append(" user.getSex() -> " + userInfo.getSex() + "\n");

        return sb.toString();
    }
}