package com.dao;

import com.entity.TuizudanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TuizudanVO;
import com.entity.view.TuizudanView;


/**
 * 退租单
 * 
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
public interface TuizudanDao extends BaseMapper<TuizudanEntity> {
	
	List<TuizudanVO> selectListVO(@Param("ew") Wrapper<TuizudanEntity> wrapper);
	
	TuizudanVO selectVO(@Param("ew") Wrapper<TuizudanEntity> wrapper);
	
	List<TuizudanView> selectListView(@Param("ew") Wrapper<TuizudanEntity> wrapper);

	List<TuizudanView> selectListView(Pagination page,@Param("ew") Wrapper<TuizudanEntity> wrapper);
	
	TuizudanView selectView(@Param("ew") Wrapper<TuizudanEntity> wrapper);
	
}
