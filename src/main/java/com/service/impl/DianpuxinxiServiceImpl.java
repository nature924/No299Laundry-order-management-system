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


import com.dao.DianpuxinxiDao;
import com.entity.DianpuxinxiEntity;
import com.service.DianpuxinxiService;
import com.entity.vo.DianpuxinxiVO;
import com.entity.view.DianpuxinxiView;

@Service("dianpuxinxiService")
public class DianpuxinxiServiceImpl extends ServiceImpl<DianpuxinxiDao, DianpuxinxiEntity> implements DianpuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DianpuxinxiEntity> page = this.selectPage(
                new Query<DianpuxinxiEntity>(params).getPage(),
                new EntityWrapper<DianpuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DianpuxinxiEntity> wrapper) {
		  Page<DianpuxinxiView> page =new Query<DianpuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DianpuxinxiVO> selectListVO(Wrapper<DianpuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DianpuxinxiVO selectVO(Wrapper<DianpuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DianpuxinxiView> selectListView(Wrapper<DianpuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DianpuxinxiView selectView(Wrapper<DianpuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
