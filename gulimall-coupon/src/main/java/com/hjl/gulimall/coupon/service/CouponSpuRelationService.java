package com.hjl.gulimall.coupon.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjl.gulimall.common.utils.PageUtils;
import com.hjl.gulimall.coupon.entity.CouponSpuRelationEntity;

/**
 * 优惠券与产品关联
 *
 * @author hejiale
 * @email 965374246@qq.com
 * @date 2022-10-15 14:51:24
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
