package com.cloud.alibaba.gateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.server.ServerWebExchange;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/6/30 7:58 下午
 */
@Configuration
public class GatewayConfig {

  /**
   * API路由设置
   *
   * @param routeLocatorBuilder
   * @return
   */
  @Bean
  public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder) {
    RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
    routes
        .route("path_route_atguigu",
            r -> r.path("/guonei")
                .uri("http://news.baidu.com/guonei"))
        .route("user-rute",
            predicateSpec -> predicateSpec.path("/user/**").uri("lb://user-service"))
        .build();
    return routes.build();
  }


}
