package com.entity.view;

import com.entity.YewuqingkuangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业务情况
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
@TableName("yewuqingkuang")
public class YewuqingkuangView  extends YewuqingkuangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YewuqingkuangView(){
	}
 
 	public YewuqingkuangView(YewuqingkuangEntity yewuqingkuangEntity){
 	try {
			BeanUtils.copyProperties(this, yewuqingkuangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
