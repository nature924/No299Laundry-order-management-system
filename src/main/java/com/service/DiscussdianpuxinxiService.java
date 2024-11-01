package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdianpuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdianpuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdianpuxinxiView;


/**
 * 店铺信息评论表
 *
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
public interface DiscussdianpuxinxiService extends IService<DiscussdianpuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdianpuxinxiVO> selectListVO(Wrapper<DiscussdianpuxinxiEntity> wrapper);
   	
   	DiscussdianpuxinxiVO selectVO(@Param("ew") Wrapper<DiscussdianpuxinxiEntity> wrapper);
   	
   	List<DiscussdianpuxinxiView> selectListView(Wrapper<DiscussdianpuxinxiEntity> wrapper);
   	
   	DiscussdianpuxinxiView selectView(@Param("ew") Wrapper<DiscussdianpuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdianpuxinxiEntity> wrapper);
   	
}

