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


import com.dao.ChengjiaojiazoushiDao;
import com.entity.ChengjiaojiazoushiEntity;
import com.service.ChengjiaojiazoushiService;
import com.entity.vo.ChengjiaojiazoushiVO;
import com.entity.view.ChengjiaojiazoushiView;

@Service("chengjiaojiazoushiService")
public class ChengjiaojiazoushiServiceImpl extends ServiceImpl<ChengjiaojiazoushiDao, ChengjiaojiazoushiEntity> implements ChengjiaojiazoushiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChengjiaojiazoushiEntity> page = this.selectPage(
                new Query<ChengjiaojiazoushiEntity>(params).getPage(),
                new EntityWrapper<ChengjiaojiazoushiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChengjiaojiazoushiEntity> wrapper) {
		  Page<ChengjiaojiazoushiView> page =new Query<ChengjiaojiazoushiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChengjiaojiazoushiVO> selectListVO(Wrapper<ChengjiaojiazoushiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChengjiaojiazoushiVO selectVO(Wrapper<ChengjiaojiazoushiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChengjiaojiazoushiView> selectListView(Wrapper<ChengjiaojiazoushiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChengjiaojiazoushiView selectView(Wrapper<ChengjiaojiazoushiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
