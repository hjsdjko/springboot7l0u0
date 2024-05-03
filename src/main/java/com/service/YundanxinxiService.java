package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YundanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YundanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YundanxinxiView;


/**
 * 运单信息
 *
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
public interface YundanxinxiService extends IService<YundanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YundanxinxiVO> selectListVO(Wrapper<YundanxinxiEntity> wrapper);
   	
   	YundanxinxiVO selectVO(@Param("ew") Wrapper<YundanxinxiEntity> wrapper);
   	
   	List<YundanxinxiView> selectListView(Wrapper<YundanxinxiEntity> wrapper);
   	
   	YundanxinxiView selectView(@Param("ew") Wrapper<YundanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YundanxinxiEntity> wrapper);
   	

}

