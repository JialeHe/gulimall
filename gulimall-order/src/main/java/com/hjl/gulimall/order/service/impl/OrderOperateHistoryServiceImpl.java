package com.hjl.gulimall.order.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjl.gulimall.common.utils.PageUtils;
import com.hjl.gulimall.common.utils.Query;
import com.hjl.gulimall.order.dao.OrderOperateHistoryDao;
import com.hjl.gulimall.order.entity.OrderOperateHistoryEntity;
import com.hjl.gulimall.order.service.OrderOperateHistoryService;

@Service("orderOperateHistoryService")
public class OrderOperateHistoryServiceImpl extends ServiceImpl<OrderOperateHistoryDao, OrderOperateHistoryEntity>
        implements OrderOperateHistoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderOperateHistoryEntity> page = this.page(new Query<OrderOperateHistoryEntity>().getPage(params),
                new QueryWrapper<OrderOperateHistoryEntity>());

        return new PageUtils(page);
    }

}