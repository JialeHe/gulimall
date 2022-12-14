package com.hjl.gulimall.member.service.impl;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hjl.gulimall.common.utils.PageUtils;
import com.hjl.gulimall.common.utils.Query;
import com.hjl.gulimall.member.dao.MemberLevelDao;
import com.hjl.gulimall.member.entity.MemberLevelEntity;
import com.hjl.gulimall.member.service.MemberLevelService;

@Service("memberLevelService")
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelDao, MemberLevelEntity>
        implements MemberLevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberLevelEntity> page = this.page(new Query<MemberLevelEntity>().getPage(params),
                new QueryWrapper<MemberLevelEntity>());

        return new PageUtils(page);
    }

}