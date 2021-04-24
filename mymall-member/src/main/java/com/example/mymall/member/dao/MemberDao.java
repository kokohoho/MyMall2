package com.example.mymall.member.dao;

import com.example.mymall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-24 14:29:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
