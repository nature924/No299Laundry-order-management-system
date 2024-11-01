package com.dao;

import com.entity.DiscussdianpuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdianpuxinxiVO;
import com.entity.view.DiscussdianpuxinxiView;


/**
 * 店铺信息评论表
 * 
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
public interface DiscussdianpuxinxiDao extends BaseMapper<DiscussdianpuxinxiEntity> {
	
	List<DiscussdianpuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussdianpuxinxiEntity> wrapper);
	
	DiscussdianpuxinxiVO selectVO(@Param("ew") Wrapper<DiscussdianpuxinxiEntity> wrapper);
	
	List<DiscussdianpuxinxiView> selectListView(@Param("ew") Wrapper<DiscussdianpuxinxiEntity> wrapper);

	List<DiscussdianpuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdianpuxinxiEntity> wrapper);
	
	DiscussdianpuxinxiView selectView(@Param("ew") Wrapper<DiscussdianpuxinxiEntity> wrapper);
	
}
