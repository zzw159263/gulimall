package com.itguigu.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itguigu.gulimall.coupon.dao.SmsMemberPriceDao;
import com.itguigu.gulimall.coupon.entity.SmsMemberPriceEntity;
import com.itguigu.gulimall.coupon.service.SmsMemberPriceService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("smsMemberPriceService")
public class SmsMemberPriceServiceImpl extends ServiceImpl<SmsMemberPriceDao, SmsMemberPriceEntity> implements SmsMemberPriceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsMemberPriceEntity> page = this.page(
                new Query<SmsMemberPriceEntity>().getPage(params),
                new QueryWrapper<SmsMemberPriceEntity>()
        );

        return new PageUtils(page);
    }

}