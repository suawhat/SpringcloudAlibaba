package com.cloud.alibaba.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/7/8 10:37 下午
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZipkinServerApplication.class,args);
  }

}
