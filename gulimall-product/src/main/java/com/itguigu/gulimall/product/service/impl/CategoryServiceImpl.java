package com.itguigu.gulimall.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itguigu.common.utils.PageUtils;
import com.itguigu.common.utils.Query;
import com.itguigu.gulimall.product.dao.CategoryDao;
import com.itguigu.gulimall.product.entity.CategoryEntity;
import com.itguigu.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> categories = baseMapper.selectList(null);

        List<CategoryEntity> menus = categories.stream().filter(category -> category.getParentCid() == 0
        ).map(menu -> {
            menu.setChildren(getChildrenCategories(menu, categories));
            return menu;
        }).sorted((menu1, menu2) -> {
            return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
        }).collect(Collectors.toList());

        return menus;
    }

    @Override
    public void removeMenuByIds(List<Long> catIds) {
        int i = baseMapper.deleteBatchIds(catIds);
    }

    private List<CategoryEntity> getChildrenCategories(CategoryEntity currentMenu, List<CategoryEntity> all) {
        List<CategoryEntity> children = all.stream().
                filter(categoryEntity -> categoryEntity.getParentCid().equals(currentMenu.getCatId())).
                peek(categoryEntity -> categoryEntity.setChildren(getChildrenCategories(categoryEntity, all))).
                sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                }).
                collect(Collectors.toList());
        return children;
    }
}