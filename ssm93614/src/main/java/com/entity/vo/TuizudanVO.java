package com.entity.vo;

import com.entity.TuizudanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 退租单
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
public class TuizudanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房源图片
	 */
	
	private String fangyuantupian;
		
	/**
	 * 房源位置
	 */
	
	private String fangyuanweizhi;
		
	/**
	 * 租金
	 */
	
	private Integer zujin;
		
	/**
	 * 租赁期限
	 */
	
	private String zulinqixian;
		
	/**
	 * 租户账号
	 */
	
	private String zuhuzhanghao;
		
	/**
	 * 租户姓名
	 */
	
	private String zuhuxingming;
		
	/**
	 * 退租日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuizuriqi;
		
	/**
	 * 退租备注
	 */
	
	private String tuizubeizhu;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 身份证
	 */
	
	private String shenfenzheng;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：房源图片
	 */
	 
	public void setFangyuantupian(String fangyuantupian) {
		this.fangyuantupian = fangyuantupian;
	}
	
	/**
	 * 获取：房源图片
	 */
	public String getFangyuantupian() {
		return fangyuantupian;
	}
				
	
	/**
	 * 设置：房源位置
	 */
	 
	public void setFangyuanweizhi(String fangyuanweizhi) {
		this.fangyuanweizhi = fangyuanweizhi;
	}
	
	/**
	 * 获取：房源位置
	 */
	public String getFangyuanweizhi() {
		return fangyuanweizhi;
	}
				
	
	/**
	 * 设置：租金
	 */
	 
	public void setZujin(Integer zujin) {
		this.zujin = zujin;
	}
	
	/**
	 * 获取：租金
	 */
	public Integer getZujin() {
		return zujin;
	}
				
	
	/**
	 * 设置：租赁期限
	 */
	 
	public void setZulinqixian(String zulinqixian) {
		this.zulinqixian = zulinqixian;
	}
	
	/**
	 * 获取：租赁期限
	 */
	public String getZulinqixian() {
		return zulinqixian;
	}
				
	
	/**
	 * 设置：租户账号
	 */
	 
	public void setZuhuzhanghao(String zuhuzhanghao) {
		this.zuhuzhanghao = zuhuzhanghao;
	}
	
	/**
	 * 获取：租户账号
	 */
	public String getZuhuzhanghao() {
		return zuhuzhanghao;
	}
				
	
	/**
	 * 设置：租户姓名
	 */
	 
	public void setZuhuxingming(String zuhuxingming) {
		this.zuhuxingming = zuhuxingming;
	}
	
	/**
	 * 获取：租户姓名
	 */
	public String getZuhuxingming() {
		return zuhuxingming;
	}
				
	
	/**
	 * 设置：退租日期
	 */
	 
	public void setTuizuriqi(Date tuizuriqi) {
		this.tuizuriqi = tuizuriqi;
	}
	
	/**
	 * 获取：退租日期
	 */
	public Date getTuizuriqi() {
		return tuizuriqi;
	}
				
	
	/**
	 * 设置：退租备注
	 */
	 
	public void setTuizubeizhu(String tuizubeizhu) {
		this.tuizubeizhu = tuizubeizhu;
	}
	
	/**
	 * 获取：退租备注
	 */
	public String getTuizubeizhu() {
		return tuizubeizhu;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
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
	 * 设置：身份证
	 */
	 
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
