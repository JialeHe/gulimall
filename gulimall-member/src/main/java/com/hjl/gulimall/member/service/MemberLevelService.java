package com.hjl.gulimall.member.service;

import java.util.Map;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hjl.gulimall.common.utils.PageUtils;
import com.hjl.gulimall.member.entity.MemberLevelEntity;

/**
 * 会员等级
 *
 * @author hejiale
 * @email 965374246@qq.com
 * @date 2022-10-15 15:11:48
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}
