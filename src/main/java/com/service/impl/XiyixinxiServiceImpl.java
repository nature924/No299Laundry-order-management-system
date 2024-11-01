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


import com.dao.XiyixinxiDao;
import com.entity.XiyixinxiEntity;
import com.service.XiyixinxiService;
import com.entity.vo.XiyixinxiVO;
import com.entity.view.XiyixinxiView;

@Service("xiyixinxiService")
public class XiyixinxiServiceImpl extends ServiceImpl<XiyixinxiDao, XiyixinxiEntity> implements XiyixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiyixinxiEntity> page = this.selectPage(
                new Query<XiyixinxiEntity>(params).getPage(),
                new EntityWrapper<XiyixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiyixinxiEntity> wrapper) {
		  Page<XiyixinxiView> page =new Query<XiyixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiyixinxiVO> selectListVO(Wrapper<XiyixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiyixinxiVO selectVO(Wrapper<XiyixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiyixinxiView> selectListView(Wrapper<XiyixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiyixinxiView selectView(Wrapper<XiyixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
