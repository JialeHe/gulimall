package com.hjl.gulimall.member.dao;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hjl.gulimall.member.entity.IntegrationChangeHistoryEntity;

/**
 * 积分变化历史记录
 * 
 * @author hejiale
 * @email 965374246@qq.com
 * @date 2022-10-15 15:11:48
 */
@Mapper
public interface IntegrationChangeHistoryDao extends BaseMapper<IntegrationChangeHistoryEntity> {

}
