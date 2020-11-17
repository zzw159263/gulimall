package io.renren.modules.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.renren.common.utils.PageUtils;
import io.renren.modules.generator.entity.SmsSkuBoundsEntity;

import java.util.Map;

/**
 * 商品sku积分设置
 *
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-11-18 01:26:06
 */
public interface SmsSkuBoundsService extends IService<SmsSkuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

