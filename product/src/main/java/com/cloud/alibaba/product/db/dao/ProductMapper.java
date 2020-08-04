package com.cloud.alibaba.product.db.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cloud.alibaba.product.db.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

/**
 * @author liyu
 * @version 1.0
 * @date 2020/7/5 2:00 下午
 */
@Mapper
public interface ProductMapper extends BaseMapper<Product> {

}
