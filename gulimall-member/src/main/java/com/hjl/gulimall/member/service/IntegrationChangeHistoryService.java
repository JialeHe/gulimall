package com.hjl.gulimall.member.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjl.gulimall.common.utils.PageUtils;
import com.hjl.gulimall.member.entity.IntegrationChangeHistoryEntity;

/**
 * 积分变化历史记录
 *
 * @author hejiale
 * @email 965374246@qq.com
 * @date 2022-10-15 15:11:48
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
