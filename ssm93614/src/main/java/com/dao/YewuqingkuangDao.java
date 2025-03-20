package com.dao;

import com.entity.YewuqingkuangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YewuqingkuangVO;
import com.entity.view.YewuqingkuangView;


/**
 * 业务情况
 * 
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
public interface YewuqingkuangDao extends BaseMapper<YewuqingkuangEntity> {
	
	List<YewuqingkuangVO> selectListVO(@Param("ew") Wrapper<YewuqingkuangEntity> wrapper);
	
	YewuqingkuangVO selectVO(@Param("ew") Wrapper<YewuqingkuangEntity> wrapper);
	
	List<YewuqingkuangView> selectListView(@Param("ew") Wrapper<YewuqingkuangEntity> wrapper);

	List<YewuqingkuangView> selectListView(Pagination page,@Param("ew") Wrapper<YewuqingkuangEntity> wrapper);
	
	YewuqingkuangView selectView(@Param("ew") Wrapper<YewuqingkuangEntity> wrapper);
	
}
