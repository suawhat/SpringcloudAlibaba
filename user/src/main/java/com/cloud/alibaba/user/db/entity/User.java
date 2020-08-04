package com.cloud.alibaba.user.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/3/30 2:30 下午
 */
@TableName("user")
@Data
public class User implements Serializable {

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
  @TableField(value = "phone")
  private String phone ;
  /**
   *
   */
  @TableField(value = "role_id")
  private Long roleId ;
  /**
   * 登陆密码
   */
  @TableField(value = "password")
  private String password ;
  /**
   *
   */
  @TableField(value = "create_date")
  private String createDate ;
  /**
   *
   */
  @TableField(value = "update_date")
  private String updateDate ;

}
