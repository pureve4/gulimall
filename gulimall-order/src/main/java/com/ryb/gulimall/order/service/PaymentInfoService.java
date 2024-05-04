package com.ryb.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ryb.common.utils.PageUtils;
import com.ryb.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author ryb
 * @email dsgryb123@gmail.com
 * @date 2024-04-06 14:26:21
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

