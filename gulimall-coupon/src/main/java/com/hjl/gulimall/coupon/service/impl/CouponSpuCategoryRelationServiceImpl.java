package com.hjl.gulimall.coupon.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjl.gulimall.common.utils.PageUtils;
import com.hjl.gulimall.common.utils.Query;
import com.hjl.gulimall.coupon.dao.CouponSpuCategoryRelationDao;
import com.hjl.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;
import com.hjl.gulimall.coupon.service.CouponSpuCategoryRelationService;

@Service("couponSpuCategoryRelationService")
public class CouponSpuCategoryRelationServiceImpl
        extends ServiceImpl<CouponSpuCategoryRelationDao, CouponSpuCategoryRelationEntity>
        implements CouponSpuCategoryRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CouponSpuCategoryRelationEntity> page = this.page(
                new Query<CouponSpuCategoryRelationEntity>().getPage(params),
                new QueryWrapper<CouponSpuCategoryRelationEntity>());

        return new PageUtils(page);
    }

}