package com.jhm.dao;

import com.jhm.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
@Repository
public interface UserDAO extends JpaRepository<User,Long> {    //jpa不用操作数据库，即可用数据库，相对于mybaties来说省去这个步骤

       public User findByUsernameAndPassword(String username,String password);   //根据用户名密码查询数据库

}
