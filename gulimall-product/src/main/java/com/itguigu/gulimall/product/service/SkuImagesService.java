package com.itguigu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.common.utils.PageUtils;
import com.itguigu.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author 
 * @email 
 * @date 2020-11-19 00:44:40
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

