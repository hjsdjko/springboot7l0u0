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


import com.dao.ChukoufapiaoDao;
import com.entity.ChukoufapiaoEntity;
import com.service.ChukoufapiaoService;
import com.entity.vo.ChukoufapiaoVO;
import com.entity.view.ChukoufapiaoView;

@Service("chukoufapiaoService")
public class ChukoufapiaoServiceImpl extends ServiceImpl<ChukoufapiaoDao, ChukoufapiaoEntity> implements ChukoufapiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChukoufapiaoEntity> page = this.selectPage(
                new Query<ChukoufapiaoEntity>(params).getPage(),
                new EntityWrapper<ChukoufapiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChukoufapiaoEntity> wrapper) {
		  Page<ChukoufapiaoView> page =new Query<ChukoufapiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChukoufapiaoVO> selectListVO(Wrapper<ChukoufapiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChukoufapiaoVO selectVO(Wrapper<ChukoufapiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChukoufapiaoView> selectListView(Wrapper<ChukoufapiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChukoufapiaoView selectView(Wrapper<ChukoufapiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
