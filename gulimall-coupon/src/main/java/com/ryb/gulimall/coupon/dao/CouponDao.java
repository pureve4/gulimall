package com.ryb.gulimall.coupon.dao;

import com.ryb.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author ryb
 * @email dsgryb123@gmail.com
 * @date 2024-04-06 14:06:26
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
