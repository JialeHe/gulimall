package com.hjl.gulimall.order.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjl.gulimall.order.entity.OrderEntity;

/**
 * 订单
 * 
 * @author hejiale
 * @email 965374246@qq.com
 * @date 2022-10-15 15:32:37
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
