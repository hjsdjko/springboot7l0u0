package com.dao;

import com.entity.YundanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YundanxinxiVO;
import com.entity.view.YundanxinxiView;


/**
 * 运单信息
 * 
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
public interface YundanxinxiDao extends BaseMapper<YundanxinxiEntity> {
	
	List<YundanxinxiVO> selectListVO(@Param("ew") Wrapper<YundanxinxiEntity> wrapper);
	
	YundanxinxiVO selectVO(@Param("ew") Wrapper<YundanxinxiEntity> wrapper);
	
	List<YundanxinxiView> selectListView(@Param("ew") Wrapper<YundanxinxiEntity> wrapper);

	List<YundanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<YundanxinxiEntity> wrapper);
	
	YundanxinxiView selectView(@Param("ew") Wrapper<YundanxinxiEntity> wrapper);
	

}
