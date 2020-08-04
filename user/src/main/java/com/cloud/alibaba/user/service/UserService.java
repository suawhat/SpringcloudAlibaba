package com.cloud.alibaba.user.service;

import com.cloud.alibaba.user.db.dao.UserMapper;
import com.cloud.alibaba.user.db.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/6/29 11:43 上午
 */
@Service
@RefreshScope
public class UserService {

  @Autowired
  private UserMapper userMapper;

  @Value("${config.info}")
  private String configInfo;

  public String getConfigInfo(){

    return configInfo;
  }

  public Object getUser(){
    return userMapper.selectList(null);
  }

  public User addUser(){
    User user =new User();
    user.setName("haha");
    user.setPassword("123");
    userMapper.insert(user);
    return user;
  }

}
