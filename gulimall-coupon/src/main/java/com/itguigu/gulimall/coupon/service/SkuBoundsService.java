package com.itguigu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.common.utils.PageUtils;
import com.itguigu.gulimall.coupon.entity.SkuBoundsEntity;

import java.util.Map;

/**
 * 商品sku积分设置
 *
 * @author 
 * @email 
 * @date 2020-11-19 00:54:27
 */
public interface SkuBoundsService extends IService<SkuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

