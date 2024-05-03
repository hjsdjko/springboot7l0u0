package com.dao;

import com.entity.ChukoufapiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChukoufapiaoVO;
import com.entity.view.ChukoufapiaoView;


/**
 * 出口发票
 * 
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
public interface ChukoufapiaoDao extends BaseMapper<ChukoufapiaoEntity> {
	
	List<ChukoufapiaoVO> selectListVO(@Param("ew") Wrapper<ChukoufapiaoEntity> wrapper);
	
	ChukoufapiaoVO selectVO(@Param("ew") Wrapper<ChukoufapiaoEntity> wrapper);
	
	List<ChukoufapiaoView> selectListView(@Param("ew") Wrapper<ChukoufapiaoEntity> wrapper);

	List<ChukoufapiaoView> selectListView(Pagination page,@Param("ew") Wrapper<ChukoufapiaoEntity> wrapper);
	
	ChukoufapiaoView selectView(@Param("ew") Wrapper<ChukoufapiaoEntity> wrapper);
	

}
