package com.bhjx.accdoctor.fellow.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bhjx.common.utils.PageUtils;
import com.bhjx.common.utils.Query;

import com.bhjx.accdoctor.fellow.dao.FellowDao;
import com.bhjx.accdoctor.fellow.entity.FellowEntity;
import com.bhjx.accdoctor.fellow.service.FellowService;


@Service("fellowService")
public class FellowServiceImpl extends ServiceImpl<FellowDao, FellowEntity> implements FellowService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<FellowEntity> page = this.page(
                new Query<FellowEntity>().getPage(params),
                new QueryWrapper<FellowEntity>()
        );

        return new PageUtils(page);
    }

}