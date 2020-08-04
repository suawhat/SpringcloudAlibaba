package com.cloud.alibaba.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/6/28 9:54 下午
 */
@SpringBootApplication(scanBasePackages = {"com.cloud.alibaba"})
//@MapperScan("com.hc.mall.db.dao")
//@EnableTransactionManagement
//@EnableScheduling
//@EnableAsync
@EnableDiscoveryClient
@EnableFeignClients
public class ProductApplication {

  public static void main(String[] args) {
    SpringApplication.run(ProductApplication.class, args);
  }

}
