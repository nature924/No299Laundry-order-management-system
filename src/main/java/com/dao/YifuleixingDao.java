package com.dao;

import com.entity.YifuleixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YifuleixingVO;
import com.entity.view.YifuleixingView;


/**
 * 衣服类型
 * 
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
public interface YifuleixingDao extends BaseMapper<YifuleixingEntity> {
	
	List<YifuleixingVO> selectListVO(@Param("ew") Wrapper<YifuleixingEntity> wrapper);
	
	YifuleixingVO selectVO(@Param("ew") Wrapper<YifuleixingEntity> wrapper);
	
	List<YifuleixingView> selectListView(@Param("ew") Wrapper<YifuleixingEntity> wrapper);

	List<YifuleixingView> selectListView(Pagination page,@Param("ew") Wrapper<YifuleixingEntity> wrapper);
	
	YifuleixingView selectView(@Param("ew") Wrapper<YifuleixingEntity> wrapper);
	
}
