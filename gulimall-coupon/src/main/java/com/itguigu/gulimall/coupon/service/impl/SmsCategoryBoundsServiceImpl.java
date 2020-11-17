package com.itguigu.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itguigu.gulimall.coupon.dao.SmsCategoryBoundsDao;
import com.itguigu.gulimall.coupon.entity.SmsCategoryBoundsEntity;
import com.itguigu.gulimall.coupon.service.SmsCategoryBoundsService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("smsCategoryBoundsService")
public class SmsCategoryBoundsServiceImpl extends ServiceImpl<SmsCategoryBoundsDao, SmsCategoryBoundsEntity> implements SmsCategoryBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCategoryBoundsEntity> page = this.page(
                new Query<SmsCategoryBoundsEntity>().getPage(params),
                new QueryWrapper<SmsCategoryBoundsEntity>()
        );

        return new PageUtils(page);
    }

}