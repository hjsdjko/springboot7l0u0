package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GuandanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GuandanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GuandanxinxiView;


/**
 * 关单信息
 *
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
public interface GuandanxinxiService extends IService<GuandanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GuandanxinxiVO> selectListVO(Wrapper<GuandanxinxiEntity> wrapper);
   	
   	GuandanxinxiVO selectVO(@Param("ew") Wrapper<GuandanxinxiEntity> wrapper);
   	
   	List<GuandanxinxiView> selectListView(Wrapper<GuandanxinxiEntity> wrapper);
   	
   	GuandanxinxiView selectView(@Param("ew") Wrapper<GuandanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GuandanxinxiEntity> wrapper);
   	

}

