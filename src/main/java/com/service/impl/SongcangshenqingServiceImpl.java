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


import com.dao.SongcangshenqingDao;
import com.entity.SongcangshenqingEntity;
import com.service.SongcangshenqingService;
import com.entity.vo.SongcangshenqingVO;
import com.entity.view.SongcangshenqingView;

@Service("songcangshenqingService")
public class SongcangshenqingServiceImpl extends ServiceImpl<SongcangshenqingDao, SongcangshenqingEntity> implements SongcangshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SongcangshenqingEntity> page = this.selectPage(
                new Query<SongcangshenqingEntity>(params).getPage(),
                new EntityWrapper<SongcangshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SongcangshenqingEntity> wrapper) {
		  Page<SongcangshenqingView> page =new Query<SongcangshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SongcangshenqingVO> selectListVO(Wrapper<SongcangshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SongcangshenqingVO selectVO(Wrapper<SongcangshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SongcangshenqingView> selectListView(Wrapper<SongcangshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SongcangshenqingView selectView(Wrapper<SongcangshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
