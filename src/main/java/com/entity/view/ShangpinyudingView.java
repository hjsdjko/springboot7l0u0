package com.entity.view;

import com.entity.ShangpinyudingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 商品预订
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
@TableName("shangpinyuding")
public class ShangpinyudingView  extends ShangpinyudingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinyudingView(){
	}
 
 	public ShangpinyudingView(ShangpinyudingEntity shangpinyudingEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinyudingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
