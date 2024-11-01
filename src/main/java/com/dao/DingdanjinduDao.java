package com.dao;

import com.entity.DingdanjinduEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingdanjinduVO;
import com.entity.view.DingdanjinduView;


/**
 * 订单进度
 * 
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
public interface DingdanjinduDao extends BaseMapper<DingdanjinduEntity> {
	
	List<DingdanjinduVO> selectListVO(@Param("ew") Wrapper<DingdanjinduEntity> wrapper);
	
	DingdanjinduVO selectVO(@Param("ew") Wrapper<DingdanjinduEntity> wrapper);
	
	List<DingdanjinduView> selectListView(@Param("ew") Wrapper<DingdanjinduEntity> wrapper);

	List<DingdanjinduView> selectListView(Pagination page,@Param("ew") Wrapper<DingdanjinduEntity> wrapper);
	
	DingdanjinduView selectView(@Param("ew") Wrapper<DingdanjinduEntity> wrapper);
	
}
