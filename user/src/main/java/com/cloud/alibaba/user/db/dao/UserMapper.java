package com.cloud.alibaba.user.db.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.alibaba.user.db.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/7/5 1:51 下午
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
