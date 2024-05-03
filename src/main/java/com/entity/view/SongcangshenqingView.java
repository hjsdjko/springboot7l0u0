package com.entity.view;

import com.entity.SongcangshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 送仓申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
@TableName("songcangshenqing")
public class SongcangshenqingView  extends SongcangshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SongcangshenqingView(){
	}
 
 	public SongcangshenqingView(SongcangshenqingEntity songcangshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, songcangshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
