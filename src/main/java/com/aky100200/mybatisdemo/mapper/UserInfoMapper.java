package com.aky100200.mybatisdemo.mapper;

import com.aky100200.mybatisdemo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoMapper {
    List<UserInfo> selectAll();

    UserInfo selectId(String id);
}