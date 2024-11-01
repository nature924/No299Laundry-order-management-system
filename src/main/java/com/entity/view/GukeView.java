package com.entity.view;

import com.entity.GukeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 顾客
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
@TableName("guke")
public class GukeView  extends GukeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GukeView(){
	}
 
 	public GukeView(GukeEntity gukeEntity){
 	try {
			BeanUtils.copyProperties(this, gukeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
