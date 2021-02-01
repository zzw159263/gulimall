package com.itguigu.gulimall.product.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itguigu.common.utils.PageUtils;
import com.itguigu.common.utils.Query;

import com.itguigu.gulimall.product.dao.AttrGroupDao;
import com.itguigu.gulimall.product.entity.AttrGroupEntity;
import com.itguigu.gulimall.product.service.AttrGroupService;


@Service("attrGroupService")
public class AttrGroupServiceImpl extends ServiceImpl<AttrGroupDao, AttrGroupEntity> implements AttrGroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AttrGroupEntity> page = this.page(
                new Query<AttrGroupEntity>().getPage(params),
                new QueryWrapper<>()
        );

        return new PageUtils(page);
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params, Long catelogId) {
        IPage<AttrGroupEntity> page;

        if (catelogId == 0){
            page = this.page(new Query<AttrGroupEntity>().getPage(params), new QueryWrapper<>());
        }else {
            String key = (String)params.get("key");
            QueryWrapper<AttrGroupEntity> wrapper = new QueryWrapper<AttrGroupEntity>().eq("catelog_id", catelogId);
            if (StringUtils.isNotEmpty(key)){
                wrapper.and((obj) -> obj.eq("attr_group_id", key).or().like("attr_group_name", key));
            }
            page = this.page(new Query<AttrGroupEntity>().getPage(params), wrapper);
        }

        return new PageUtils(page);
    }

}