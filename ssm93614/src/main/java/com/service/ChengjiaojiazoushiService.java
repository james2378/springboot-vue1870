package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChengjiaojiazoushiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChengjiaojiazoushiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengjiaojiazoushiView;


/**
 * 成交价走势
 *
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
public interface ChengjiaojiazoushiService extends IService<ChengjiaojiazoushiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChengjiaojiazoushiVO> selectListVO(Wrapper<ChengjiaojiazoushiEntity> wrapper);
   	
   	ChengjiaojiazoushiVO selectVO(@Param("ew") Wrapper<ChengjiaojiazoushiEntity> wrapper);
   	
   	List<ChengjiaojiazoushiView> selectListView(Wrapper<ChengjiaojiazoushiEntity> wrapper);
   	
   	ChengjiaojiazoushiView selectView(@Param("ew") Wrapper<ChengjiaojiazoushiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChengjiaojiazoushiEntity> wrapper);
   	
}

