package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GukeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GukeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GukeView;


/**
 * 顾客
 *
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
public interface GukeService extends IService<GukeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GukeVO> selectListVO(Wrapper<GukeEntity> wrapper);
   	
   	GukeVO selectVO(@Param("ew") Wrapper<GukeEntity> wrapper);
   	
   	List<GukeView> selectListView(Wrapper<GukeEntity> wrapper);
   	
   	GukeView selectView(@Param("ew") Wrapper<GukeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GukeEntity> wrapper);
   	
}

