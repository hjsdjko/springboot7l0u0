package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinyudingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinyudingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinyudingView;


/**
 * 商品预订
 *
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
public interface ShangpinyudingService extends IService<ShangpinyudingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinyudingVO> selectListVO(Wrapper<ShangpinyudingEntity> wrapper);
   	
   	ShangpinyudingVO selectVO(@Param("ew") Wrapper<ShangpinyudingEntity> wrapper);
   	
   	List<ShangpinyudingView> selectListView(Wrapper<ShangpinyudingEntity> wrapper);
   	
   	ShangpinyudingView selectView(@Param("ew") Wrapper<ShangpinyudingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinyudingEntity> wrapper);
   	

}

