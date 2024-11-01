package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DianpuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DianpuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DianpuxinxiView;


/**
 * 店铺信息
 *
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
public interface DianpuxinxiService extends IService<DianpuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DianpuxinxiVO> selectListVO(Wrapper<DianpuxinxiEntity> wrapper);
   	
   	DianpuxinxiVO selectVO(@Param("ew") Wrapper<DianpuxinxiEntity> wrapper);
   	
   	List<DianpuxinxiView> selectListView(Wrapper<DianpuxinxiEntity> wrapper);
   	
   	DianpuxinxiView selectView(@Param("ew") Wrapper<DianpuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DianpuxinxiEntity> wrapper);
   	
}

