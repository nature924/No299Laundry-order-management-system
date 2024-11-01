package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DingdanjinduDao;
import com.entity.DingdanjinduEntity;
import com.service.DingdanjinduService;
import com.entity.vo.DingdanjinduVO;
import com.entity.view.DingdanjinduView;

@Service("dingdanjinduService")
public class DingdanjinduServiceImpl extends ServiceImpl<DingdanjinduDao, DingdanjinduEntity> implements DingdanjinduService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdanjinduEntity> page = this.selectPage(
                new Query<DingdanjinduEntity>(params).getPage(),
                new EntityWrapper<DingdanjinduEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdanjinduEntity> wrapper) {
		  Page<DingdanjinduView> page =new Query<DingdanjinduView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingdanjinduVO> selectListVO(Wrapper<DingdanjinduEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingdanjinduVO selectVO(Wrapper<DingdanjinduEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingdanjinduView> selectListView(Wrapper<DingdanjinduEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdanjinduView selectView(Wrapper<DingdanjinduEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
