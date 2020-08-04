package com.cloud.alibaba.product.feign;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/7/3 9:34 上午
 */
@Component
public class UserFallBackFactory implements FallbackFactory<UserFeign> {

  @Override
  public UserFeign create(Throwable throwable) {
    return new UserFeign() {
      @Override
      public String test(Integer id) {
        return "error";
      }

      @Override
      public String test1(Integer id) {
        return null;
      }
    };
  }
}
