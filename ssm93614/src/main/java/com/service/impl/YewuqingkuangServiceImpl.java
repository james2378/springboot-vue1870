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


import com.dao.YewuqingkuangDao;
import com.entity.YewuqingkuangEntity;
import com.service.YewuqingkuangService;
import com.entity.vo.YewuqingkuangVO;
import com.entity.view.YewuqingkuangView;

@Service("yewuqingkuangService")
public class YewuqingkuangServiceImpl extends ServiceImpl<YewuqingkuangDao, YewuqingkuangEntity> implements YewuqingkuangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YewuqingkuangEntity> page = this.selectPage(
                new Query<YewuqingkuangEntity>(params).getPage(),
                new EntityWrapper<YewuqingkuangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YewuqingkuangEntity> wrapper) {
		  Page<YewuqingkuangView> page =new Query<YewuqingkuangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YewuqingkuangVO> selectListVO(Wrapper<YewuqingkuangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YewuqingkuangVO selectVO(Wrapper<YewuqingkuangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YewuqingkuangView> selectListView(Wrapper<YewuqingkuangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YewuqingkuangView selectView(Wrapper<YewuqingkuangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
