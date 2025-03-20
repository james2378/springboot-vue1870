package com.dao;

import com.entity.HetongwenjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HetongwenjianVO;
import com.entity.view.HetongwenjianView;


/**
 * 合同文件
 * 
 * @author 
 * @email 
 * @date 2021-04-24 23:32:26
 */
public interface HetongwenjianDao extends BaseMapper<HetongwenjianEntity> {
	
	List<HetongwenjianVO> selectListVO(@Param("ew") Wrapper<HetongwenjianEntity> wrapper);
	
	HetongwenjianVO selectVO(@Param("ew") Wrapper<HetongwenjianEntity> wrapper);
	
	List<HetongwenjianView> selectListView(@Param("ew") Wrapper<HetongwenjianEntity> wrapper);

	List<HetongwenjianView> selectListView(Pagination page,@Param("ew") Wrapper<HetongwenjianEntity> wrapper);
	
	HetongwenjianView selectView(@Param("ew") Wrapper<HetongwenjianEntity> wrapper);
	
}
