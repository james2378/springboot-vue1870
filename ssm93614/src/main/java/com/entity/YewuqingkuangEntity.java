package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 业务情况
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
@TableName("yewuqingkuang")
public class YewuqingkuangEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YewuqingkuangEntity() {
		
	}
	
	public YewuqingkuangEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
