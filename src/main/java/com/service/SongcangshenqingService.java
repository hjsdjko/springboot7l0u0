package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SongcangshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SongcangshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SongcangshenqingView;


/**
 * 送仓申请
 *
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
public interface SongcangshenqingService extends IService<SongcangshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SongcangshenqingVO> selectListVO(Wrapper<SongcangshenqingEntity> wrapper);
   	
   	SongcangshenqingVO selectVO(@Param("ew") Wrapper<SongcangshenqingEntity> wrapper);
   	
   	List<SongcangshenqingView> selectListView(Wrapper<SongcangshenqingEntity> wrapper);
   	
   	SongcangshenqingView selectView(@Param("ew") Wrapper<SongcangshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SongcangshenqingEntity> wrapper);
   	

}

