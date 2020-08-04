package com.cloud.alibaba.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/6/30 2:42 下午
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
  public static void main(String[] args) {
    SpringApplication.run(GatewayApplication.class,args);
  }

}
