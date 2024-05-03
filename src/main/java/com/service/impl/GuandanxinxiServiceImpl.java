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


import com.dao.GuandanxinxiDao;
import com.entity.GuandanxinxiEntity;
import com.service.GuandanxinxiService;
import com.entity.vo.GuandanxinxiVO;
import com.entity.view.GuandanxinxiView;

@Service("guandanxinxiService")
public class GuandanxinxiServiceImpl extends ServiceImpl<GuandanxinxiDao, GuandanxinxiEntity> implements GuandanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GuandanxinxiEntity> page = this.selectPage(
                new Query<GuandanxinxiEntity>(params).getPage(),
                new EntityWrapper<GuandanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GuandanxinxiEntity> wrapper) {
		  Page<GuandanxinxiView> page =new Query<GuandanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GuandanxinxiVO> selectListVO(Wrapper<GuandanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GuandanxinxiVO selectVO(Wrapper<GuandanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GuandanxinxiView> selectListView(Wrapper<GuandanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GuandanxinxiView selectView(Wrapper<GuandanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
