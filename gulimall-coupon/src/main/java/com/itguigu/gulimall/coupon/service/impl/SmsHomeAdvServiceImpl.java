package com.itguigu.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itguigu.gulimall.coupon.dao.SmsHomeAdvDao;
import com.itguigu.gulimall.coupon.entity.SmsHomeAdvEntity;
import com.itguigu.gulimall.coupon.service.SmsHomeAdvService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("smsHomeAdvService")
public class SmsHomeAdvServiceImpl extends ServiceImpl<SmsHomeAdvDao, SmsHomeAdvEntity> implements SmsHomeAdvService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsHomeAdvEntity> page = this.page(
                new Query<SmsHomeAdvEntity>().getPage(params),
                new QueryWrapper<SmsHomeAdvEntity>()
        );

        return new PageUtils(page);
    }

}