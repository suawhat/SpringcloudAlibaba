package com.cloud.alibaba.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/6/28 4:23 下午
 */
@SpringBootApplication(scanBasePackages = {"com.cloud.alibaba"})
//@MapperScan("com.hc.mall.db.dao")
//@EnableTransactionManagement
//@EnableScheduling
//@EnableAsync
@EnableDiscoveryClient
public class UserApplication {
  public static void main(String[] args){
   SpringApplication.run(UserApplication.class, args);

   // ConfigurableApplicationContext applicationContext = SpringApplication.run(UserApplication.class, args);

//    while(true) {
//      //When configurations are refreshed dynamically, they will be updated in the Enviroment, therefore here we retrieve configurations from Environment every other second.
//      String info = applicationContext.getEnvironment().getProperty("config.info");
//      System.err.println("info :" + info );
//      TimeUnit.SECONDS.sleep(2);
//    }
  }

}
