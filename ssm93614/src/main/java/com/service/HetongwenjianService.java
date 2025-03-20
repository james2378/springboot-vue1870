package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HetongwenjianEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HetongwenjianVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HetongwenjianView;


/**
 * 合同文件
 *
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
public interface HetongwenjianService extends IService<HetongwenjianEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HetongwenjianVO> selectListVO(Wrapper<HetongwenjianEntity> wrapper);
   	
   	HetongwenjianVO selectVO(@Param("ew") Wrapper<HetongwenjianEntity> wrapper);
   	
   	List<HetongwenjianView> selectListView(Wrapper<HetongwenjianEntity> wrapper);
   	
   	HetongwenjianView selectView(@Param("ew") Wrapper<HetongwenjianEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HetongwenjianEntity> wrapper);
   	
}

