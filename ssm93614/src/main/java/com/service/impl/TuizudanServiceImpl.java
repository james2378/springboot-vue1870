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


import com.dao.TuizudanDao;
import com.entity.TuizudanEntity;
import com.service.TuizudanService;
import com.entity.vo.TuizudanVO;
import com.entity.view.TuizudanView;

@Service("tuizudanService")
public class TuizudanServiceImpl extends ServiceImpl<TuizudanDao, TuizudanEntity> implements TuizudanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TuizudanEntity> page = this.selectPage(
                new Query<TuizudanEntity>(params).getPage(),
                new EntityWrapper<TuizudanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TuizudanEntity> wrapper) {
		  Page<TuizudanView> page =new Query<TuizudanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TuizudanVO> selectListVO(Wrapper<TuizudanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TuizudanVO selectVO(Wrapper<TuizudanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TuizudanView> selectListView(Wrapper<TuizudanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TuizudanView selectView(Wrapper<TuizudanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
