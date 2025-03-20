package com.entity.model;

import com.entity.YewuqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 业务情况
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
public class YewuqingkuangModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 部门
	 */
	
	private String bumen;
		
	/**
	 * 岗位
	 */
	
	private String gangwei;
		
	/**
	 * 工作态度
	 */
	
	private Integer gongzuotaidu;
		
	/**
	 * 业务技能
	 */
	
	private Integer yewujineng;
		
	/**
	 * 工作绩效
	 */
	
	private Integer gongzuojixiao;
		
	/**
	 * 奖惩加减分
	 */
	
	private Integer jiangchengjiajianfen;
		
	/**
	 * 总得分
	 */
	
	private String zongdefen;
		
	/**
	 * 评价等级
	 */
	
	private String pingjiadengji;
		
	/**
	 * 评价月份
	 */
	
	private String pingjiayuefen;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：部门
	 */
	 
	public void setBumen(String bumen) {
		this.bumen = bumen;
	}
	
	/**
	 * 获取：部门
	 */
	public String getBumen() {
		return bumen;
	}
				
	
	/**
	 * 设置：岗位
	 */
	 
	public void setGangwei(String gangwei) {
		this.gangwei = gangwei;
	}
	
	/**
	 * 获取：岗位
	 */
	public String getGangwei() {
		return gangwei;
	}
				
	
	/**
	 * 设置：工作态度
	 */
	 
	public void setGongzuotaidu(Integer gongzuotaidu) {
		this.gongzuotaidu = gongzuotaidu;
	}
	
	/**
	 * 获取：工作态度
	 */
	public Integer getGongzuotaidu() {
		return gongzuotaidu;
	}
				
	
	/**
	 * 设置：业务技能
	 */
	 
	public void setYewujineng(Integer yewujineng) {
		this.yewujineng = yewujineng;
	}
	
	/**
	 * 获取：业务技能
	 */
	public Integer getYewujineng() {
		return yewujineng;
	}
				
	
	/**
	 * 设置：工作绩效
	 */
	 
	public void setGongzuojixiao(Integer gongzuojixiao) {
		this.gongzuojixiao = gongzuojixiao;
	}
	
	/**
	 * 获取：工作绩效
	 */
	public Integer getGongzuojixiao() {
		return gongzuojixiao;
	}
				
	
	/**
	 * 设置：奖惩加减分
	 */
	 
	public void setJiangchengjiajianfen(Integer jiangchengjiajianfen) {
		this.jiangchengjiajianfen = jiangchengjiajianfen;
	}
	
	/**
	 * 获取：奖惩加减分
	 */
	public Integer getJiangchengjiajianfen() {
		return jiangchengjiajianfen;
	}
				
	
	/**
	 * 设置：总得分
	 */
	 
	public void setZongdefen(String zongdefen) {
		this.zongdefen = zongdefen;
	}
	
	/**
	 * 获取：总得分
	 */
	public String getZongdefen() {
		return zongdefen;
	}
				
	
	/**
	 * 设置：评价等级
	 */
	 
	public void setPingjiadengji(String pingjiadengji) {
		this.pingjiadengji = pingjiadengji;
	}
	
	/**
	 * 获取：评价等级
	 */
	public String getPingjiadengji() {
		return pingjiadengji;
	}
				
	
	/**
	 * 设置：评价月份
	 */
	 
	public void setPingjiayuefen(String pingjiayuefen) {
		this.pingjiayuefen = pingjiayuefen;
	}
	
	/**
	 * 获取：评价月份
	 */
	public String getPingjiayuefen() {
		return pingjiayuefen;
	}
			
}
