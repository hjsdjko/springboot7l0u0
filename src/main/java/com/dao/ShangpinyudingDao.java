package com.dao;

import com.entity.ShangpinyudingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinyudingVO;
import com.entity.view.ShangpinyudingView;


/**
 * 商品预订
 * 
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
public interface ShangpinyudingDao extends BaseMapper<ShangpinyudingEntity> {
	
	List<ShangpinyudingVO> selectListVO(@Param("ew") Wrapper<ShangpinyudingEntity> wrapper);
	
	ShangpinyudingVO selectVO(@Param("ew") Wrapper<ShangpinyudingEntity> wrapper);
	
	List<ShangpinyudingView> selectListView(@Param("ew") Wrapper<ShangpinyudingEntity> wrapper);

	List<ShangpinyudingView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinyudingEntity> wrapper);
	
	ShangpinyudingView selectView(@Param("ew") Wrapper<ShangpinyudingEntity> wrapper);
	

}
