package com.dao;

import com.entity.ChengjiaojiazoushiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChengjiaojiazoushiVO;
import com.entity.view.ChengjiaojiazoushiView;


/**
 * 成交价走势
 * 
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
public interface ChengjiaojiazoushiDao extends BaseMapper<ChengjiaojiazoushiEntity> {
	
	List<ChengjiaojiazoushiVO> selectListVO(@Param("ew") Wrapper<ChengjiaojiazoushiEntity> wrapper);
	
	ChengjiaojiazoushiVO selectVO(@Param("ew") Wrapper<ChengjiaojiazoushiEntity> wrapper);
	
	List<ChengjiaojiazoushiView> selectListView(@Param("ew") Wrapper<ChengjiaojiazoushiEntity> wrapper);

	List<ChengjiaojiazoushiView> selectListView(Pagination page,@Param("ew") Wrapper<ChengjiaojiazoushiEntity> wrapper);
	
	ChengjiaojiazoushiView selectView(@Param("ew") Wrapper<ChengjiaojiazoushiEntity> wrapper);
	
}
