package com.dao;

import com.entity.DianpuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DianpuxinxiVO;
import com.entity.view.DianpuxinxiView;


/**
 * 店铺信息
 * 
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
public interface DianpuxinxiDao extends BaseMapper<DianpuxinxiEntity> {
	
	List<DianpuxinxiVO> selectListVO(@Param("ew") Wrapper<DianpuxinxiEntity> wrapper);
	
	DianpuxinxiVO selectVO(@Param("ew") Wrapper<DianpuxinxiEntity> wrapper);
	
	List<DianpuxinxiView> selectListView(@Param("ew") Wrapper<DianpuxinxiEntity> wrapper);

	List<DianpuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DianpuxinxiEntity> wrapper);
	
	DianpuxinxiView selectView(@Param("ew") Wrapper<DianpuxinxiEntity> wrapper);
	
}
