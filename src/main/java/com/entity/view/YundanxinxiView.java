package com.entity.view;

import com.entity.YundanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 运单信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
@TableName("yundanxinxi")
public class YundanxinxiView  extends YundanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YundanxinxiView(){
	}
 
 	public YundanxinxiView(YundanxinxiEntity yundanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, yundanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
