package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChukoufapiaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChukoufapiaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChukoufapiaoView;


/**
 * 出口发票
 *
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
public interface ChukoufapiaoService extends IService<ChukoufapiaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChukoufapiaoVO> selectListVO(Wrapper<ChukoufapiaoEntity> wrapper);
   	
   	ChukoufapiaoVO selectVO(@Param("ew") Wrapper<ChukoufapiaoEntity> wrapper);
   	
   	List<ChukoufapiaoView> selectListView(Wrapper<ChukoufapiaoEntity> wrapper);
   	
   	ChukoufapiaoView selectView(@Param("ew") Wrapper<ChukoufapiaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChukoufapiaoEntity> wrapper);
   	

}

