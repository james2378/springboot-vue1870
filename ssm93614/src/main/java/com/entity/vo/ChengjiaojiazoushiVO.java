package com.entity.vo;

import com.entity.ChengjiaojiazoushiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 成交价走势
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
public class ChengjiaojiazoushiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房源类型
	 */
	
	private String fangyuanleixing;
		
	/**
	 * 成交价格
	 */
	
	private Integer chengjiaojiage;
		
	/**
	 * 时间
	 */
	
	private String shijian;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：房源类型
	 */
	 
	public void setFangyuanleixing(String fangyuanleixing) {
		this.fangyuanleixing = fangyuanleixing;
	}
	
	/**
	 * 获取：房源类型
	 */
	public String getFangyuanleixing() {
		return fangyuanleixing;
	}
				
	
	/**
	 * 设置：成交价格
	 */
	 
	public void setChengjiaojiage(Integer chengjiaojiage) {
		this.chengjiaojiage = chengjiaojiage;
	}
	
	/**
	 * 获取：成交价格
	 */
	public Integer getChengjiaojiage() {
		return chengjiaojiage;
	}
				
	
	/**
	 * 设置：时间
	 */
	 
	public void setShijian(String shijian) {
		this.shijian = shijian;
	}
	
	/**
	 * 获取：时间
	 */
	public String getShijian() {
		return shijian;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}
