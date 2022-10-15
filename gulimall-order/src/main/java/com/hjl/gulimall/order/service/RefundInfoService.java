package com.hjl.gulimall.order.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjl.gulimall.common.utils.PageUtils;
import com.hjl.gulimall.order.entity.RefundInfoEntity;

/**
 * 退款信息
 *
 * @author hejiale
 * @email 965374246@qq.com
 * @date 2022-10-15 15:32:37
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
