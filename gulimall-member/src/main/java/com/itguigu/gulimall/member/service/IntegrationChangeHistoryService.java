package com.itguigu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itguigu.common.utils.PageUtils;
import com.itguigu.gulimall.member.entity.IntegrationChangeHistoryEntity;

import java.util.Map;

/**
 * 积分变化历史记录
 *
 * @author 
 * @email 
 * @date 2020-11-19 01:23:34
 */
public interface IntegrationChangeHistoryService extends IService<IntegrationChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

