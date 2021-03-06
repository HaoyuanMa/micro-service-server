package com.bhjx.accdoctor.fellow.service.impl;

import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bhjx.common.utils.PageUtils;
import com.bhjx.common.utils.Query;

import com.bhjx.accdoctor.fellow.dao.FellowCommentDao;
import com.bhjx.accdoctor.fellow.entity.FellowCommentEntity;
import com.bhjx.accdoctor.fellow.service.FellowCommentService;


@Service("fellowCommentService")
public class FellowCommentServiceImpl extends ServiceImpl<FellowCommentDao, FellowCommentEntity> implements FellowCommentService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        QueryWrapper<FellowCommentEntity> queryWrapper = new QueryWrapper<FellowCommentEntity>();
        int fellowId = Integer.parseInt((String)params.get("fellow_id"));
        int type = Integer.parseInt((String)params.get("type"));
        queryWrapper.eq("fellow_id",fellowId);
        if(type == 1){
            queryWrapper.eq("comment_type",5).or().eq("comment_type",4);
        } else if(type == 2){
            queryWrapper.eq("comment_type",3);
        } else if(type == 3){
            queryWrapper.eq("comment_type",1).or().eq("comment_type",2);
        }
        IPage<FellowCommentEntity> page = this.page(
                new Query<FellowCommentEntity>().getPage(params),
                queryWrapper
        );

        return new PageUtils(page);
    }

    @Override
    public List<FellowCommentEntity> queryList(Map<String, Object> params, Serializable id) {
        QueryWrapper<FellowCommentEntity> queryWrapper = new QueryWrapper<FellowCommentEntity>();
        Long fellowId;
        if (params == null){
            fellowId = (Long) id;
        } else {
            fellowId = Long.parseLong((String)params.get("fellow_id"));
        }

        queryWrapper.eq("fellow_id",fellowId);
        return list(queryWrapper);
    }


}