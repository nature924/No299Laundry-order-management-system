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


import com.dao.GukeDao;
import com.entity.GukeEntity;
import com.service.GukeService;
import com.entity.vo.GukeVO;
import com.entity.view.GukeView;

@Service("gukeService")
public class GukeServiceImpl extends ServiceImpl<GukeDao, GukeEntity> implements GukeService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GukeEntity> page = this.selectPage(
                new Query<GukeEntity>(params).getPage(),
                new EntityWrapper<GukeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GukeEntity> wrapper) {
		  Page<GukeView> page =new Query<GukeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GukeVO> selectListVO(Wrapper<GukeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GukeVO selectVO(Wrapper<GukeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GukeView> selectListView(Wrapper<GukeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GukeView selectView(Wrapper<GukeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
