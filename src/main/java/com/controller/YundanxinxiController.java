package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YundanxinxiEntity;
import com.entity.view.YundanxinxiView;

import com.service.YundanxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 运单信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-04-04 11:31:42
 */
@RestController
@RequestMapping("/yundanxinxi")
public class YundanxinxiController {
    @Autowired
    private YundanxinxiService yundanxinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YundanxinxiEntity yundanxinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			yundanxinxi.setShangjiazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("maijia")) {
			yundanxinxi.setMaijiazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YundanxinxiEntity> ew = new EntityWrapper<YundanxinxiEntity>();
		PageUtils page = yundanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yundanxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YundanxinxiEntity yundanxinxi, 
		HttpServletRequest request){
        EntityWrapper<YundanxinxiEntity> ew = new EntityWrapper<YundanxinxiEntity>();
		PageUtils page = yundanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yundanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YundanxinxiEntity yundanxinxi){
       	EntityWrapper<YundanxinxiEntity> ew = new EntityWrapper<YundanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yundanxinxi, "yundanxinxi")); 
        return R.ok().put("data", yundanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YundanxinxiEntity yundanxinxi){
        EntityWrapper< YundanxinxiEntity> ew = new EntityWrapper< YundanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yundanxinxi, "yundanxinxi")); 
		YundanxinxiView yundanxinxiView =  yundanxinxiService.selectView(ew);
		return R.ok("查询运单信息成功").put("data", yundanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YundanxinxiEntity yundanxinxi = yundanxinxiService.selectById(id);
        return R.ok().put("data", yundanxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YundanxinxiEntity yundanxinxi = yundanxinxiService.selectById(id);
        return R.ok().put("data", yundanxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YundanxinxiEntity yundanxinxi, HttpServletRequest request){
    	yundanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yundanxinxi);
        yundanxinxiService.insert(yundanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YundanxinxiEntity yundanxinxi, HttpServletRequest request){
    	yundanxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yundanxinxi);
        yundanxinxiService.insert(yundanxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YundanxinxiEntity yundanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yundanxinxi);
        yundanxinxiService.updateById(yundanxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yundanxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YundanxinxiEntity> wrapper = new EntityWrapper<YundanxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("shangjia")) {
			wrapper.eq("shangjiazhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("maijia")) {
			wrapper.eq("maijiazhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yundanxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
