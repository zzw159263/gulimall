package io.renren.modules.generator.dao;

import io.renren.modules.generator.entity.SmsMemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2020-11-18 01:26:06
 */
@Mapper
public interface SmsMemberPriceDao extends BaseMapper<SmsMemberPriceEntity> {
	
}
