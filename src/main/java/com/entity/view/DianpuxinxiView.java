package com.entity.view;

import com.entity.DianpuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 店铺信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
@TableName("dianpuxinxi")
public class DianpuxinxiView  extends DianpuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DianpuxinxiView(){
	}
 
 	public DianpuxinxiView(DianpuxinxiEntity dianpuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, dianpuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
