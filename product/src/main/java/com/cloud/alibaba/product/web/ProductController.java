package com.cloud.alibaba.product.web;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cloud.alibaba.product.feign.UserFeign;
import com.cloud.alibaba.product.service.ProductService;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/6/28 9:55 下午
 */
@RestController
@RequestMapping("/product")
public class ProductController {

  @Autowired
  private UserFeign userFeign;

  @Resource
  private RestTemplate restTemplate;

  @Value("${service-url.nacos-user-service}")
  private String userServiceUrl;

  @GetMapping("/test")
  public String test() {
    return "test";
  }

  @GetMapping("/consume/{id}")
  @SentinelResource(value = "fallBack",
      blockHandler = "blockHandler",
      fallback = "handlerfallback",
      exceptionsToIgnore = IllegalArgumentException.class)//忽略异常
  public String consumeUser(@PathVariable("id") Integer id) {
    return restTemplate.getForObject(userServiceUrl + "/user/" + id, String.class);
  }

  public String handlerfallback(@PathVariable("id") Integer id, Throwable e) {
    return "handlerfallback" + e.getMessage();
  }

  public String blockHandler(@PathVariable("id") Integer id, BlockException e) {
    return "blockHandler" + e.getMessage();
  }

  @GetMapping("/feign/{id}")
  public String testFeign(@PathVariable("id") Integer id) {
    return userFeign.test(id);
  }





  @Autowired
  private ProductService productService;

  @GetMapping("/list")
  public Object getProduct(){
    return productService.getList();
  }

  @GetMapping("/add")
  public Object add(){
    return productService.addProduct();
  }
}
