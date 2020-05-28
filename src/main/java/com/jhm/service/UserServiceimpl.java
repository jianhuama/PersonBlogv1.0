package com.jhm.service;

import com.jhm.dao.UserDAO;
import com.jhm.pojo.User;
import com.jhm.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    //可用的service
public class UserServiceimpl implements UserService {
    //自动装配，注入（使用UserDAO）
    @Autowired
    private UserDAO userDAO;

    @Override
    public User usercheck(String username, String password) {
        User user= userDAO.findByUsernameAndPassword(username, MD5Utils.code(password));    //Md5加密方式
        return user;
    }
}
