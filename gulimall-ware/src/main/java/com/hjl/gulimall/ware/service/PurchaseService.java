package com.hjl.gulimall.ware.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjl.gulimall.common.utils.PageUtils;
import com.hjl.gulimall.ware.entity.PurchaseEntity;

/**
 * 采购信息
 *
 * @author hejiale
 * @email 965374246@qq.com
 * @date 2022-10-15 15:47:19
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
