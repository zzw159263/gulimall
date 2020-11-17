package com.itguigu.gulimall.product.dao;

import com.itguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author Jack Zhai
 * @email 1032983946@qq.com
 * @date 2020-11-17 01:04:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
