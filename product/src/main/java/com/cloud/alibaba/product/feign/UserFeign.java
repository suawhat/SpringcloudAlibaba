package com.cloud.alibaba.product.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/7/3 9:32 上午
 */
@FeignClient(name = "user-service",fallbackFactory = UserFallBackFactory.class)
public interface UserFeign {

  @GetMapping("/user/{id}")
  public String test(@PathVariable("id") Integer id);

  @GetMapping("/user/test1")
  public String test1(Integer id);

  @GetMapping("/addUser")
  public Object addUser();


}
