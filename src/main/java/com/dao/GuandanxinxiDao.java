package com.dao;

import com.entity.GuandanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.GuandanxinxiVO;
import com.entity.view.GuandanxinxiView;


/**
 * 关单信息
 * 
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
public interface GuandanxinxiDao extends BaseMapper<GuandanxinxiEntity> {
	
	List<GuandanxinxiVO> selectListVO(@Param("ew") Wrapper<GuandanxinxiEntity> wrapper);
	
	GuandanxinxiVO selectVO(@Param("ew") Wrapper<GuandanxinxiEntity> wrapper);
	
	List<GuandanxinxiView> selectListView(@Param("ew") Wrapper<GuandanxinxiEntity> wrapper);

	List<GuandanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<GuandanxinxiEntity> wrapper);
	
	GuandanxinxiView selectView(@Param("ew") Wrapper<GuandanxinxiEntity> wrapper);
	

}
