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


import com.dao.YifuleixingDao;
import com.entity.YifuleixingEntity;
import com.service.YifuleixingService;
import com.entity.vo.YifuleixingVO;
import com.entity.view.YifuleixingView;

@Service("yifuleixingService")
public class YifuleixingServiceImpl extends ServiceImpl<YifuleixingDao, YifuleixingEntity> implements YifuleixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YifuleixingEntity> page = this.selectPage(
                new Query<YifuleixingEntity>(params).getPage(),
                new EntityWrapper<YifuleixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YifuleixingEntity> wrapper) {
		  Page<YifuleixingView> page =new Query<YifuleixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YifuleixingVO> selectListVO(Wrapper<YifuleixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YifuleixingVO selectVO(Wrapper<YifuleixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YifuleixingView> selectListView(Wrapper<YifuleixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YifuleixingView selectView(Wrapper<YifuleixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
