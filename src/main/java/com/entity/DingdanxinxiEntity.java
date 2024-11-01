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
 * 订单信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
@TableName("dingdanxinxi")
public class DingdanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DingdanxinxiEntity() {
		
	}
	
	public DingdanxinxiEntity(T t) {
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
	 * 衣服类型
	 */
					
	private String yifuleixing;
	
	/**
	 * 衣服数量
	 */
					
	private String yifushuliang;
	
	/**
	 * 店家账号
	 */
					
	private String dianjiazhanghao;
	
	/**
	 * 店家姓名
	 */
					
	private String dianjiaxingming;
	
	/**
	 * 顾客账号
	 */
					
	private String gukezhanghao;
	
	/**
	 * 顾客姓名
	 */
					
	private String gukexingming;
	
	/**
	 * 家庭地址
	 */
					
	private String jiatingdizhi;
	
	/**
	 * 支付凭证
	 */
					
	private String zhifupingzheng;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：衣服类型
	 */
	public void setYifuleixing(String yifuleixing) {
		this.yifuleixing = yifuleixing;
	}
	/**
	 * 获取：衣服类型
	 */
	public String getYifuleixing() {
		return yifuleixing;
	}
	/**
	 * 设置：衣服数量
	 */
	public void setYifushuliang(String yifushuliang) {
		this.yifushuliang = yifushuliang;
	}
	/**
	 * 获取：衣服数量
	 */
	public String getYifushuliang() {
		return yifushuliang;
	}
	/**
	 * 设置：店家账号
	 */
	public void setDianjiazhanghao(String dianjiazhanghao) {
		this.dianjiazhanghao = dianjiazhanghao;
	}
	/**
	 * 获取：店家账号
	 */
	public String getDianjiazhanghao() {
		return dianjiazhanghao;
	}
	/**
	 * 设置：店家姓名
	 */
	public void setDianjiaxingming(String dianjiaxingming) {
		this.dianjiaxingming = dianjiaxingming;
	}
	/**
	 * 获取：店家姓名
	 */
	public String getDianjiaxingming() {
		return dianjiaxingming;
	}
	/**
	 * 设置：顾客账号
	 */
	public void setGukezhanghao(String gukezhanghao) {
		this.gukezhanghao = gukezhanghao;
	}
	/**
	 * 获取：顾客账号
	 */
	public String getGukezhanghao() {
		return gukezhanghao;
	}
	/**
	 * 设置：顾客姓名
	 */
	public void setGukexingming(String gukexingming) {
		this.gukexingming = gukexingming;
	}
	/**
	 * 获取：顾客姓名
	 */
	public String getGukexingming() {
		return gukexingming;
	}
	/**
	 * 设置：家庭地址
	 */
	public void setJiatingdizhi(String jiatingdizhi) {
		this.jiatingdizhi = jiatingdizhi;
	}
	/**
	 * 获取：家庭地址
	 */
	public String getJiatingdizhi() {
		return jiatingdizhi;
	}
	/**
	 * 设置：支付凭证
	 */
	public void setZhifupingzheng(String zhifupingzheng) {
		this.zhifupingzheng = zhifupingzheng;
	}
	/**
	 * 获取：支付凭证
	 */
	public String getZhifupingzheng() {
		return zhifupingzheng;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
