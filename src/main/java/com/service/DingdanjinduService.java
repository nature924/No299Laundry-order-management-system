package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdanjinduEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdanjinduVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdanjinduView;


/**
 * 订单进度
 *
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
public interface DingdanjinduService extends IService<DingdanjinduEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdanjinduVO> selectListVO(Wrapper<DingdanjinduEntity> wrapper);
   	
   	DingdanjinduVO selectVO(@Param("ew") Wrapper<DingdanjinduEntity> wrapper);
   	
   	List<DingdanjinduView> selectListView(Wrapper<DingdanjinduEntity> wrapper);
   	
   	DingdanjinduView selectView(@Param("ew") Wrapper<DingdanjinduEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdanjinduEntity> wrapper);
   	
}

