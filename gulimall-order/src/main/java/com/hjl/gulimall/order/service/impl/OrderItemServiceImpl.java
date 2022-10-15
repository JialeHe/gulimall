package com.hjl.gulimall.order.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjl.gulimall.common.utils.PageUtils;
import com.hjl.gulimall.common.utils.Query;
import com.hjl.gulimall.order.dao.OrderItemDao;
import com.hjl.gulimall.order.entity.OrderItemEntity;
import com.hjl.gulimall.order.service.OrderItemService;

@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItemEntity> implements OrderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderItemEntity> page = this.page(new Query<OrderItemEntity>().getPage(params),
                new QueryWrapper<OrderItemEntity>());

        return new PageUtils(page);
    }

}