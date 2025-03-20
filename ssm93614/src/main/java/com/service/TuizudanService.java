package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TuizudanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TuizudanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TuizudanView;


/**
 * 退租单
 *
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
public interface TuizudanService extends IService<TuizudanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TuizudanVO> selectListVO(Wrapper<TuizudanEntity> wrapper);
   	
   	TuizudanVO selectVO(@Param("ew") Wrapper<TuizudanEntity> wrapper);
   	
   	List<TuizudanView> selectListView(Wrapper<TuizudanEntity> wrapper);
   	
   	TuizudanView selectView(@Param("ew") Wrapper<TuizudanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TuizudanEntity> wrapper);
   	
}

