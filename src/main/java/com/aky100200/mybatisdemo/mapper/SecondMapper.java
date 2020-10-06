package com.aky100200.mybatisdemo.mapper;

import com.aky100200.mybatisdemo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SecondMapper {
    UserInfo selectOne();
}