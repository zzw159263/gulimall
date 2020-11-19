package com.itguigu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.common.utils.PageUtils;
import com.itguigu.gulimall.order.entity.OmsPaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author 
 * @email 
 * @date 2020-11-19 01:26:27
 */
public interface OmsPaymentInfoService extends IService<OmsPaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

