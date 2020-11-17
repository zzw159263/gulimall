package io.renren.modules.generator.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.Query;

import io.renren.modules.generator.dao.SmsCategoryBoundsDao;
import io.renren.modules.generator.entity.SmsCategoryBoundsEntity;
import io.renren.modules.generator.service.SmsCategoryBoundsService;


@Service("smsCategoryBoundsService")
public class SmsCategoryBoundsServiceImpl extends ServiceImpl<SmsCategoryBoundsDao, SmsCategoryBoundsEntity> implements SmsCategoryBoundsService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCategoryBoundsEntity> page = this.page(
                new Query<SmsCategoryBoundsEntity>().getPage(params),
                new QueryWrapper<SmsCategoryBoundsEntity>()
        );

        return new PageUtils(page);
    }

}