package com.ryb.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ryb.common.utils.PageUtils;
import com.ryb.gulimall.ware.entity.WareOrderTaskDetailEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author ryb
 * @email dsgryb123@gmail.com
 * @date 2024-04-06 14:36:42
 */
public interface WareOrderTaskDetailService extends IService<WareOrderTaskDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

