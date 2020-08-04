package com.cloud.alibaba.user.web;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.cloud.alibaba.user.db.entity.User;
import com.cloud.alibaba.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/6/28 4:49 下午
 */
@RestController
@RequestMapping("/user")
@RefreshScope
@Slf4j
public class UserController {

 @Autowired
 private Environment environment;
 @Autowired
 private UserService userService;

  @Value("${server.port}")
  private String port;

  @Value("${config.info}")
  private String configInfo;

  @GetMapping("/{id}")
  public String test(@PathVariable("id") Integer id){
    return "查询的服务端口"+port+"id=="+id;
  }

  @GetMapping("test1")
  public String test1(@PathVariable("id") Integer id){
    return "查询的服务端口"+port+"tst1 id=="+id;
  }

  @GetMapping("/config/info")
  public String getConfigInfo(){
    log.info("enviroment读取："+environment.getProperty("config.info"));
    log.info("service读取："+userService.getConfigInfo());
    return "configInfo=="+configInfo;
  }

  @GetMapping("/list")
  public Object getList(){
    return userService.getUser();
  }

  @GetMapping("/addUser")
  public Object addUser(){
   return userService.addUser();
  }
}
