package com.jhm.service;

import com.jhm.pojo.User;


public interface UserService {
    //检查用户登录
    User usercheck(String username, String password);

}
