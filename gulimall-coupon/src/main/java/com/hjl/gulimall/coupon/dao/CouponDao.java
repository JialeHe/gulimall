package com.hjl.gulimall.coupon.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjl.gulimall.coupon.entity.CouponEntity;

/**
 * 优惠券信息
 * 
 * @author hejiale
 * @email 965374246@qq.com
 * @date 2022-10-15 14:51:24
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {

}
