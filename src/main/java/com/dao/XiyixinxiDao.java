package com.dao;

import com.entity.XiyixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiyixinxiVO;
import com.entity.view.XiyixinxiView;


/**
 * 洗衣信息
 * 
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
public interface XiyixinxiDao extends BaseMapper<XiyixinxiEntity> {
	
	List<XiyixinxiVO> selectListVO(@Param("ew") Wrapper<XiyixinxiEntity> wrapper);
	
	XiyixinxiVO selectVO(@Param("ew") Wrapper<XiyixinxiEntity> wrapper);
	
	List<XiyixinxiView> selectListView(@Param("ew") Wrapper<XiyixinxiEntity> wrapper);

	List<XiyixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiyixinxiEntity> wrapper);
	
	XiyixinxiView selectView(@Param("ew") Wrapper<XiyixinxiEntity> wrapper);
	
}
