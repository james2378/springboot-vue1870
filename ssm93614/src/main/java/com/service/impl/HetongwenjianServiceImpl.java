package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.HetongwenjianDao;
import com.entity.HetongwenjianEntity;
import com.service.HetongwenjianService;
import com.entity.vo.HetongwenjianVO;
import com.entity.view.HetongwenjianView;

@Service("hetongwenjianService")
public class HetongwenjianServiceImpl extends ServiceImpl<HetongwenjianDao, HetongwenjianEntity> implements HetongwenjianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HetongwenjianEntity> page = this.selectPage(
                new Query<HetongwenjianEntity>(params).getPage(),
                new EntityWrapper<HetongwenjianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HetongwenjianEntity> wrapper) {
		  Page<HetongwenjianView> page =new Query<HetongwenjianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HetongwenjianVO> selectListVO(Wrapper<HetongwenjianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HetongwenjianVO selectVO(Wrapper<HetongwenjianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HetongwenjianView> selectListView(Wrapper<HetongwenjianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HetongwenjianView selectView(Wrapper<HetongwenjianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
