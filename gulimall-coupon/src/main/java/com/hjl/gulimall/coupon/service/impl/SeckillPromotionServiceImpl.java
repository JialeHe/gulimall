package com.hjl.gulimall.coupon.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjl.gulimall.common.utils.PageUtils;
import com.hjl.gulimall.common.utils.Query;
import com.hjl.gulimall.coupon.dao.SeckillPromotionDao;
import com.hjl.gulimall.coupon.entity.SeckillPromotionEntity;
import com.hjl.gulimall.coupon.service.SeckillPromotionService;

@Service("seckillPromotionService")
public class SeckillPromotionServiceImpl extends ServiceImpl<SeckillPromotionDao, SeckillPromotionEntity>
        implements SeckillPromotionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillPromotionEntity> page = this.page(new Query<SeckillPromotionEntity>().getPage(params),
                new QueryWrapper<>());

        return new PageUtils(page);
    }

}