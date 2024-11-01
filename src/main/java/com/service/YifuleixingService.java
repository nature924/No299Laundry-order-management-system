package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YifuleixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YifuleixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YifuleixingView;


/**
 * 衣服类型
 *
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
public interface YifuleixingService extends IService<YifuleixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YifuleixingVO> selectListVO(Wrapper<YifuleixingEntity> wrapper);
   	
   	YifuleixingVO selectVO(@Param("ew") Wrapper<YifuleixingEntity> wrapper);
   	
   	List<YifuleixingView> selectListView(Wrapper<YifuleixingEntity> wrapper);
   	
   	YifuleixingView selectView(@Param("ew") Wrapper<YifuleixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YifuleixingEntity> wrapper);
   	
}

