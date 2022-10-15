package com.hjl.gulimall.coupon.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjl.gulimall.common.utils.PageUtils;
import com.hjl.gulimall.common.utils.Query;
import com.hjl.gulimall.coupon.dao.SeckillSkuRelationDao;
import com.hjl.gulimall.coupon.entity.SeckillSkuRelationEntity;
import com.hjl.gulimall.coupon.service.SeckillSkuRelationService;

@Service("seckillSkuRelationService")
public class SeckillSkuRelationServiceImpl extends ServiceImpl<SeckillSkuRelationDao, SeckillSkuRelationEntity>
        implements SeckillSkuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSkuRelationEntity> page = this.page(new Query<SeckillSkuRelationEntity>().getPage(params),
                new QueryWrapper<SeckillSkuRelationEntity>());

        return new PageUtils(page);
    }

}