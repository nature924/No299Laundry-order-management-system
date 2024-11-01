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


import com.dao.DiscussdianpuxinxiDao;
import com.entity.DiscussdianpuxinxiEntity;
import com.service.DiscussdianpuxinxiService;
import com.entity.vo.DiscussdianpuxinxiVO;
import com.entity.view.DiscussdianpuxinxiView;

@Service("discussdianpuxinxiService")
public class DiscussdianpuxinxiServiceImpl extends ServiceImpl<DiscussdianpuxinxiDao, DiscussdianpuxinxiEntity> implements DiscussdianpuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdianpuxinxiEntity> page = this.selectPage(
                new Query<DiscussdianpuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussdianpuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdianpuxinxiEntity> wrapper) {
		  Page<DiscussdianpuxinxiView> page =new Query<DiscussdianpuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdianpuxinxiVO> selectListVO(Wrapper<DiscussdianpuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdianpuxinxiVO selectVO(Wrapper<DiscussdianpuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdianpuxinxiView> selectListView(Wrapper<DiscussdianpuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdianpuxinxiView selectView(Wrapper<DiscussdianpuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
