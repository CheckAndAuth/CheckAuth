package com.check.auth.g3.core.checkauth.service.impl;

import com.check.auth.g3.core.checkauth.dao.AuthInstDetailMapper;
import com.check.auth.g3.core.checkauth.dao.AuthStaticsMapper;
import com.check.auth.g3.core.checkauth.entity.AuthInstDetailEntity;
import com.check.auth.g3.core.checkauth.entity.AuthInstStaticsEntity;
import com.check.auth.g3.core.checkauth.entity.query.BusiScope;
import com.check.auth.g3.core.checkauth.service.AuthInstDetailService;
import com.check.auth.g3.facade.checkauth.facade.dto.PageDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Map;
@Service("authInstDetailService")
public class AuthInstDetailServiceImpl implements AuthInstDetailService {

	@Autowired
    AuthInstDetailMapper authInstDetailMapper;

    @Autowired
    AuthStaticsMapper authStaticsMapper;

    private ObjectMapper mapper = new ObjectMapper();
	@Override
	public void insert(AuthInstDetailEntity authInstMainInfoEntity) {
		authInstDetailMapper.insert(authInstMainInfoEntity);
	}

	@Override
	public List<AuthInstDetailEntity> selectDetailListByFuzzy(Map<String,Object> map) {
		return authInstDetailMapper.selectDetailListByFuzzyMap(map);
	}

    @Override
    public List<AuthInstDetailEntity> selectDetailListByHot(Map<String, String> map) {
        return null;
    }

	@Override
	public AuthInstDetailEntity queryInstDetailByInstCode(String instCode) {
        AuthInstDetailEntity detailEntity = authInstDetailMapper.selectDetailByInstCode(instCode);
        if(detailEntity!=null){
            int instDetailId = detailEntity.getId();
            AuthInstStaticsEntity staticsEntity = authStaticsMapper.selectStaticsByInstDetailId(instDetailId);
            adjustBusiScope(detailEntity);
            if(staticsEntity!=null){
                List<Map<String, Object>> staticsMap = null;
                staticsMap = authStaticsMapper.getGroupStaticsByInstDetailId(detailEntity.getId());
                staticsEntity.setGroupStaticsList(staticsMap);
            }/*else{
                staticsEntity.setGroupStaticsList(null);
            }*/
            detailEntity.setAuthInstStaticsEntity(staticsEntity);
        }
		return detailEntity;
	}

    @Override
    public PageDTO<AuthInstDetailEntity> selectListByPage(Map<String, Object> queryMap) {
        int pageNum = (Integer) queryMap.get("pageNum");
        int pageSize = (Integer) queryMap.get("pageSize");
        long count = 0;
        List<AuthInstDetailEntity> authList = null;
        if (queryMap.containsKey("fuzzy")) {
            count = authInstDetailMapper.selectCountByFuzzyMap(queryMap);
        } else {
           // count = authInstDetailMapper.selectCountByMap(queryMap);
        }
        PageDTO<AuthInstDetailEntity> page = new PageDTO<AuthInstDetailEntity>(count, pageNum, pageSize);
        queryMap.put("offset", page.getOffset());
        queryMap.put("limit", page.getPageSize());

        if (queryMap.containsKey("fuzzy")) {
            authList = authInstDetailMapper.selectDetailListByFuzzyMap(queryMap);
            if(authList!=null){
                for(AuthInstDetailEntity instDetail: authList){
                    adjustBusiScope(instDetail);
                }
            }
        } else {
            //authList = authInstDetailMapper.selectAuthInstByMap(queryMap);

        }
        page.setPageList(authList);
        return page;
    }

	@Override
	public int updatePageViewByInstCode(int pageView, String instCode) {
		return authInstDetailMapper.updatePageViewByInstCode(pageView, instCode);
	}

	public void adjustBusiScope(AuthInstDetailEntity instDetail){
        if (StringUtils.isNotBlank(instDetail.getBusiScope())){
            try{
                List<BusiScope> busiScopeList=mapper.readValue(instDetail.getBusiScope(), List.class);
                instDetail.setBusiScopeName(busiScopeList);
                instDetail.setBusiScope(null);
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

}
