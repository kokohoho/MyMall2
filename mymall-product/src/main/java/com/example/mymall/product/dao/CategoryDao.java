package com.example.mymall.product.dao;

import com.example.mymall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenshun
 * @email sunlightcs@gmail.com
 * @date 2021-04-24 14:07:25
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
