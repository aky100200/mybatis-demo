package com.aky100200.mybatisdemo.entity;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class UserInfo {
    private final String id;
    private final String name;
    private final String sex;
}