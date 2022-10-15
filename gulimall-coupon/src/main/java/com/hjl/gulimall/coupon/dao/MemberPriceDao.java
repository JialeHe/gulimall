package com.hjl.gulimall.coupon.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjl.gulimall.coupon.entity.MemberPriceEntity;

/**
 * 商品会员价格
 * 
 * @author hejiale
 * @email 965374246@qq.com
 * @date 2022-10-15 14:51:24
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}
