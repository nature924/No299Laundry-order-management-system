package com.entity.view;

import com.entity.DingdanjinduEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 订单进度
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-14 15:04:48
 */
@TableName("dingdanjindu")
public class DingdanjinduView  extends DingdanjinduEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingdanjinduView(){
	}
 
 	public DingdanjinduView(DingdanjinduEntity dingdanjinduEntity){
 	try {
			BeanUtils.copyProperties(this, dingdanjinduEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
