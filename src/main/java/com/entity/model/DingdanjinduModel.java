package com.entity.model;

import com.entity.DingdanjinduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 订单进度
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
public class DingdanjinduModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 衣服数量
	 */
	
	private String yifushuliang;
		
	/**
	 * 当前进度
	 */
	
	private String dangqianjindu;
		
	/**
	 * 店家账号
	 */
	
	private String dianjiazhanghao;
		
	/**
	 * 店家姓名
	 */
	
	private String dianjiaxingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 顾客账号
	 */
	
	private String gukezhanghao;
		
	/**
	 * 顾客姓名
	 */
	
	private String gukexingming;
		
	/**
	 * 更新时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date gengxinshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
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
	 * 设置：当前进度
	 */
	 
	public void setDangqianjindu(String dangqianjindu) {
		this.dangqianjindu = dangqianjindu;
	}
	
	/**
	 * 获取：当前进度
	 */
	public String getDangqianjindu() {
		return dangqianjindu;
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
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
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
	 * 设置：更新时间
	 */
	 
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
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
			
}
