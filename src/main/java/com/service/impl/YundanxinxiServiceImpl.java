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


import com.dao.YundanxinxiDao;
import com.entity.YundanxinxiEntity;
import com.service.YundanxinxiService;
import com.entity.vo.YundanxinxiVO;
import com.entity.view.YundanxinxiView;

@Service("yundanxinxiService")
public class YundanxinxiServiceImpl extends ServiceImpl<YundanxinxiDao, YundanxinxiEntity> implements YundanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YundanxinxiEntity> page = this.selectPage(
                new Query<YundanxinxiEntity>(params).getPage(),
                new EntityWrapper<YundanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YundanxinxiEntity> wrapper) {
		  Page<YundanxinxiView> page =new Query<YundanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YundanxinxiVO> selectListVO(Wrapper<YundanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YundanxinxiVO selectVO(Wrapper<YundanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YundanxinxiView> selectListView(Wrapper<YundanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YundanxinxiView selectView(Wrapper<YundanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
