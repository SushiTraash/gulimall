package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author deweihuang
 * @email deweihuang@gmail.com
 * @date 2021-06-14 03:12:28
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
