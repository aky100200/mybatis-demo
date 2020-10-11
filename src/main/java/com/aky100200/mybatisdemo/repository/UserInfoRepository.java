package com.aky100200.mybatisdemo.repository;

import com.aky100200.mybatisdemo.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

    @Query("SELECT u FROM UserInfo u WHERE u.name = ?1")
    List<UserInfo> findUserInfoByName(String name);
}
