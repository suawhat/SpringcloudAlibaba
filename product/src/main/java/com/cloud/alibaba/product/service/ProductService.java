package com.cloud.alibaba.product.service;

import com.cloud.alibaba.product.db.dao.ProductMapper;
import com.cloud.alibaba.product.db.entity.Product;
import com.cloud.alibaba.product.feign.UserFeign;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/7/5 2:04 下午
 */
@Service
public class ProductService {

  @Autowired
  private UserFeign userFeign;

  @Autowired
  private ProductMapper productMapper;

  public Object getList(){
    return productMapper.selectList(null);
  }

  /**
   * 测试 seata
   * @return
   */
  @GlobalTransactional(name = "product",rollbackFor = Exception.class)
  public Object addProduct(){
    Product product= new Product();
    product.setName("11111");
    product.setNumber(10);
    productMapper.insert(product);

    userFeign.addUser();

    return product;
  }

}
