package com.cloud.alibaba.product.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/7/5 1:59 下午
 */
@Data
@TableName("product")
public class Product {

  /**
   * 用户ID
   */
  @TableField(value = "id")
  @TableId(value = "id", type = IdType.AUTO)
  private Long id ;
  /**
   * 用户名
   */
  @TableField(value = "name")
  private String name ;
  /**
   * 手机号
   */
  @TableField(value = "number")
  private Integer number ;

}
