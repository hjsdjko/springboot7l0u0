package com.entity.vo;

import com.entity.GuandanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 关单信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
public class GuandanxinxiVO  implements Serializable {
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
	 * 关单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guandanshijian;
		
	/**
	 * 关单备注
	 */
	
	private String guandanbeizhu;
		
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
	 * 设置：关单时间
	 */
	 
	public void setGuandanshijian(Date guandanshijian) {
		this.guandanshijian = guandanshijian;
	}
	
	/**
	 * 获取：关单时间
	 */
	public Date getGuandanshijian() {
		return guandanshijian;
	}
				
	
	/**
	 * 设置：关单备注
	 */
	 
	public void setGuandanbeizhu(String guandanbeizhu) {
		this.guandanbeizhu = guandanbeizhu;
	}
	
	/**
	 * 获取：关单备注
	 */
	public String getGuandanbeizhu() {
		return guandanbeizhu;
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
