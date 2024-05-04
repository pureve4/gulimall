package com.ryb.gulimall.product.dao;

import com.ryb.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ryb
 * @email dsgryb123@gmail.com
 * @date 2024-04-06 01:47:21
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
