package com.example.mymall.coupon.dao;

import com.example.mymall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-24 14:25:47
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
