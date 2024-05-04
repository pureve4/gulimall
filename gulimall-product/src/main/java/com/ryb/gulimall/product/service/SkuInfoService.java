package com.ryb.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ryb.common.utils.PageUtils;
import com.ryb.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author ryb
 * @email dsgryb123@gmail.com
 * @date 2024-04-06 01:47:21
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

