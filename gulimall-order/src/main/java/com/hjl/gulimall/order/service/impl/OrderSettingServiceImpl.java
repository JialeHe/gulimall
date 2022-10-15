package com.hjl.gulimall.order.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjl.gulimall.common.utils.PageUtils;
import com.hjl.gulimall.common.utils.Query;
import com.hjl.gulimall.order.dao.OrderSettingDao;
import com.hjl.gulimall.order.entity.OrderSettingEntity;
import com.hjl.gulimall.order.service.OrderSettingService;

@Service("orderSettingService")
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingDao, OrderSettingEntity>
        implements OrderSettingService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderSettingEntity> page = this.page(new Query<OrderSettingEntity>().getPage(params),
                new QueryWrapper<OrderSettingEntity>());

        return new PageUtils(page);
    }

}