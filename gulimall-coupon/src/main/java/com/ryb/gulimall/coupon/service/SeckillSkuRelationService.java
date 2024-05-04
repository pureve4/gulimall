package com.ryb.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ryb.common.utils.PageUtils;
import com.ryb.gulimall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author ryb
 * @email dsgryb123@gmail.com
 * @date 2024-04-06 14:06:26
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

