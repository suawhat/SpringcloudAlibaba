package com.cloud.alibaba.sentinel.web;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloud.alibaba.sentinel.handler.Myhandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/6/29 12:28 下午
 */
@RestController
@Slf4j
public class SentinelController {

  @GetMapping(value = "/hello")
  @SentinelResource(value = "hello",blockHandlerClass = Myhandler.class,blockHandler = "handlerException")
  public String hello() {
    return "Hello Sentinel";
  }

  @GetMapping(value = "/hello1")
  public String hello1() {
    log.info(System.currentTimeMillis()+"");
    return "Hello Sentinel1111";
  }

  @GetMapping(value = "/testHot")
  @SentinelResource(value = "testHot",blockHandler = "deal_testHot")
  public String testHot(@RequestParam String p1,@RequestParam String p2) {
    return "testHot";
  }

  public String deal_testHot( String p1, String p2, BlockException e){
    return "deal_testHot";
  }

}
