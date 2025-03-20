package com.entity.view;

import com.entity.HetongwenjianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 合同文件
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
@TableName("hetongwenjian")
public class HetongwenjianView  extends HetongwenjianEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HetongwenjianView(){
	}
 
 	public HetongwenjianView(HetongwenjianEntity hetongwenjianEntity){
 	try {
			BeanUtils.copyProperties(this, hetongwenjianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
