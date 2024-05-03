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


import com.dao.ShangpinyudingDao;
import com.entity.ShangpinyudingEntity;
import com.service.ShangpinyudingService;
import com.entity.vo.ShangpinyudingVO;
import com.entity.view.ShangpinyudingView;

@Service("shangpinyudingService")
public class ShangpinyudingServiceImpl extends ServiceImpl<ShangpinyudingDao, ShangpinyudingEntity> implements ShangpinyudingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinyudingEntity> page = this.selectPage(
                new Query<ShangpinyudingEntity>(params).getPage(),
                new EntityWrapper<ShangpinyudingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinyudingEntity> wrapper) {
		  Page<ShangpinyudingView> page =new Query<ShangpinyudingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShangpinyudingVO> selectListVO(Wrapper<ShangpinyudingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinyudingVO selectVO(Wrapper<ShangpinyudingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinyudingView> selectListView(Wrapper<ShangpinyudingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinyudingView selectView(Wrapper<ShangpinyudingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
