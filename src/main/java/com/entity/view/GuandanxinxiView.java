package com.entity.view;

import com.entity.GuandanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 关单信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
@TableName("guandanxinxi")
public class GuandanxinxiView  extends GuandanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GuandanxinxiView(){
	}
 
 	public GuandanxinxiView(GuandanxinxiEntity guandanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, guandanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
