package com.cloud.alibaba.sentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/6/29 12:27 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SentinelApplication {

  public static void main(String[] args) {
    SpringApplication.run(SentinelApplication.class,args);
  }

}
