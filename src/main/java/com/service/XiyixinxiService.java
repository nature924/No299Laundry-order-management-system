package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiyixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiyixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiyixinxiView;


/**
 * 洗衣信息
 *
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
public interface XiyixinxiService extends IService<XiyixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiyixinxiVO> selectListVO(Wrapper<XiyixinxiEntity> wrapper);
   	
   	XiyixinxiVO selectVO(@Param("ew") Wrapper<XiyixinxiEntity> wrapper);
   	
   	List<XiyixinxiView> selectListView(Wrapper<XiyixinxiEntity> wrapper);
   	
   	XiyixinxiView selectView(@Param("ew") Wrapper<XiyixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiyixinxiEntity> wrapper);
   	
}

