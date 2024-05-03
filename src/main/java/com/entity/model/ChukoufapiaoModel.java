package com.entity.model;

import com.entity.ChukoufapiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 出口发票
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
public class ChukoufapiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 商家账号
	 */
	
	private String shangjiazhanghao;
		
	/**
	 * 商家姓名
	 */
	
	private String shangjiaxingming;
		
	/**
	 * 商品名称
	 */
	
	private String shangpinmingcheng;
		
	/**
	 * 商品分类
	 */
	
	private String shangpinfenlei;
		
	/**
	 * 时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shijian;
		
	/**
	 * 发票信息
	 */
	
	private String fapiaoxinxi;
		
	/**
	 * 买家账号
	 */
	
	private String maijiazhanghao;
		
	/**
	 * 买家姓名
	 */
	
	private String maijiaxingming;
				
	
	/**
	 * 设置：商家账号
	 */
	 
	public void setShangjiazhanghao(String shangjiazhanghao) {
		this.shangjiazhanghao = shangjiazhanghao;
	}
	
	/**
	 * 获取：商家账号
	 */
	public String getShangjiazhanghao() {
		return shangjiazhanghao;
	}
				
	
	/**
	 * 设置：商家姓名
	 */
	 
	public void setShangjiaxingming(String shangjiaxingming) {
		this.shangjiaxingming = shangjiaxingming;
	}
	
	/**
	 * 获取：商家姓名
	 */
	public String getShangjiaxingming() {
		return shangjiaxingming;
	}
				
	
	/**
	 * 设置：商品名称
	 */
	 
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
				
	
	/**
	 * 设置：商品分类
	 */
	 
	public void setShangpinfenlei(String shangpinfenlei) {
		this.shangpinfenlei = shangpinfenlei;
	}
	
	/**
	 * 获取：商品分类
	 */
	public String getShangpinfenlei() {
		return shangpinfenlei;
	}
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(Date shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public Date getShijian() {
		return shijian;
	}
				
	
	/**
	 * 设置：发票信息
	 */
	 
	public void setFapiaoxinxi(String fapiaoxinxi) {
		this.fapiaoxinxi = fapiaoxinxi;
	}
	
	/**
	 * 获取：发票信息
	 */
	public String getFapiaoxinxi() {
		return fapiaoxinxi;
	}
				
	
	/**
	 * 设置：买家账号
	 */
	 
	public void setMaijiazhanghao(String maijiazhanghao) {
		this.maijiazhanghao = maijiazhanghao;
	}
	
	/**
	 * 获取：买家账号
	 */
	public String getMaijiazhanghao() {
		return maijiazhanghao;
	}
				
	
	/**
	 * 设置：买家姓名
	 */
	 
	public void setMaijiaxingming(String maijiaxingming) {
		this.maijiaxingming = maijiaxingming;
	}
	
	/**
	 * 获取：买家姓名
	 */
	public String getMaijiaxingming() {
		return maijiaxingming;
	}
			
}
