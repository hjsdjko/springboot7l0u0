package com.dao;

import com.entity.SongcangshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SongcangshenqingVO;
import com.entity.view.SongcangshenqingView;


/**
 * 送仓申请
 * 
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
public interface SongcangshenqingDao extends BaseMapper<SongcangshenqingEntity> {
	
	List<SongcangshenqingVO> selectListVO(@Param("ew") Wrapper<SongcangshenqingEntity> wrapper);
	
	SongcangshenqingVO selectVO(@Param("ew") Wrapper<SongcangshenqingEntity> wrapper);
	
	List<SongcangshenqingView> selectListView(@Param("ew") Wrapper<SongcangshenqingEntity> wrapper);

	List<SongcangshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<SongcangshenqingEntity> wrapper);
	
	SongcangshenqingView selectView(@Param("ew") Wrapper<SongcangshenqingEntity> wrapper);
	

}
