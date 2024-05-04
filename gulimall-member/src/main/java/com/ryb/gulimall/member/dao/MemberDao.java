package com.ryb.gulimall.member.dao;

import com.ryb.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ryb
 * @email dsgryb123@gmail.com
 * @date 2024-04-06 14:21:07
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
