package com.entity.vo;

import com.entity.FangyuanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 房源信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
public class FangyuanxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 房源类型
	 */
	
	private String fangyuanleixing;
		
	/**
	 * 房子户型
	 */
	
	private String fangzihuxing;
		
	/**
	 * 房源位置
	 */
	
	private String fangyuanweizhi;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 房源面积
	 */
	
	private String fangyuanmianji;
		
	/**
	 * 租金
	 */
	
	private Integer zujin;
		
	/**
	 * 租赁期限
	 */
	
	private String zulinqixian;
		
	/**
	 * 房源介绍
	 */
	
	private String fangyuanjieshao;
		
	/**
	 * 房东姓名
	 */
	
	private String fangdongxingming;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 手机
	 */
	
	private String shouji;
		
	/**
	 * 合同文件
	 */
	
	private String hetongwenjian;
		
	/**
	 * 成交时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chengjiaoshijian;
		
	/**
	 * 房源图片
	 */
	
	private String fangyuantupian;
		
	/**
	 * 成交价
	 */
	
	private Integer chengjiaojia;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：房子户型
	 */
	 
	public void setFangzihuxing(String fangzihuxing) {
		this.fangzihuxing = fangzihuxing;
	}
	
	/**
	 * 获取：房子户型
	 */
	public String getFangzihuxing() {
		return fangzihuxing;
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
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：房源面积
	 */
	 
	public void setFangyuanmianji(String fangyuanmianji) {
		this.fangyuanmianji = fangyuanmianji;
	}
	
	/**
	 * 获取：房源面积
	 */
	public String getFangyuanmianji() {
		return fangyuanmianji;
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
	 * 设置：房源介绍
	 */
	 
	public void setFangyuanjieshao(String fangyuanjieshao) {
		this.fangyuanjieshao = fangyuanjieshao;
	}
	
	/**
	 * 获取：房源介绍
	 */
	public String getFangyuanjieshao() {
		return fangyuanjieshao;
	}
				
	
	/**
	 * 设置：房东姓名
	 */
	 
	public void setFangdongxingming(String fangdongxingming) {
		this.fangdongxingming = fangdongxingming;
	}
	
	/**
	 * 获取：房东姓名
	 */
	public String getFangdongxingming() {
		return fangdongxingming;
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
	 * 设置：手机
	 */
	 
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
				
	
	/**
	 * 设置：合同文件
	 */
	 
	public void setHetongwenjian(String hetongwenjian) {
		this.hetongwenjian = hetongwenjian;
	}
	
	/**
	 * 获取：合同文件
	 */
	public String getHetongwenjian() {
		return hetongwenjian;
	}
				
	
	/**
	 * 设置：成交时间
	 */
	 
	public void setChengjiaoshijian(Date chengjiaoshijian) {
		this.chengjiaoshijian = chengjiaoshijian;
	}
	
	/**
	 * 获取：成交时间
	 */
	public Date getChengjiaoshijian() {
		return chengjiaoshijian;
	}
				
	
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
	 * 设置：成交价
	 */
	 
	public void setChengjiaojia(Integer chengjiaojia) {
		this.chengjiaojia = chengjiaojia;
	}
	
	/**
	 * 获取：成交价
	 */
	public Integer getChengjiaojia() {
		return chengjiaojia;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
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
