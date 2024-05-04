package com.ryb.gulimall.order.dao;

import com.ryb.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ryb
 * @email dsgryb123@gmail.com
 * @date 2024-04-06 14:26:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
