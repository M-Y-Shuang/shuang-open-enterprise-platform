package com.shuang.commons.multi.mybatis.annotation.service;

import com.shuang.commons.multi.mybatis.annotation.bean.User;

import java.util.List;

public interface UserService {

    List<User> getAll1();

    List<User> getAll2();

    void add1(User user);

    void add2(User user);

    void add3(User user);
}