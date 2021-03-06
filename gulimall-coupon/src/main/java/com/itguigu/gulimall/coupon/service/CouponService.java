package com.itguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.common.utils.PageUtils;
import com.itguigu.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author 
 * @email 
 * @date 2020-11-19 00:54:28
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

