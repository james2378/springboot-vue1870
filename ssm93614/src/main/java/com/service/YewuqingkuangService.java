package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YewuqingkuangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YewuqingkuangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YewuqingkuangView;


/**
 * 业务情况
 *
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
public interface YewuqingkuangService extends IService<YewuqingkuangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YewuqingkuangVO> selectListVO(Wrapper<YewuqingkuangEntity> wrapper);
   	
   	YewuqingkuangVO selectVO(@Param("ew") Wrapper<YewuqingkuangEntity> wrapper);
   	
   	List<YewuqingkuangView> selectListView(Wrapper<YewuqingkuangEntity> wrapper);
   	
   	YewuqingkuangView selectView(@Param("ew") Wrapper<YewuqingkuangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YewuqingkuangEntity> wrapper);
   	
}

