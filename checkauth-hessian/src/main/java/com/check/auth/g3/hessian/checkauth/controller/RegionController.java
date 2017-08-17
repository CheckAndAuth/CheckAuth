package com.check.auth.g3.hessian.checkauth.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.check.auth.g3.core.checkauth.entity.RegionEntity;
import com.check.auth.g3.core.checkauth.service.RegionService;
import com.check.auth.g3.core.checkauth.utils.tools.UtilMisc;

@Controller
@RequestMapping("/region")
public class RegionController extends BaseController {

    @Autowired
    private RegionService regionService;

    @RequestMapping("/queryAreaByRegionCode")
    @ResponseBody
    public Map<String,Object> queryAreaByRegionCode(HttpServletRequest request, int regionId) {
    	System.out.println("Request regionId is : "+regionId);
        Map<String,Object> retMap=null;
        if(regionId == 0){
            retMap=UtilMisc.toMap("retCode","01","retMsg","regionCode不能为空！");
            return retMap;
        }else{
        	List<RegionEntity> regionEntities = regionService.selectRegionByParentId(regionId);
            if(regionEntities == null || regionEntities.isEmpty()){
                retMap=UtilMisc.toMap("retCode", "02", "retMsg", "没有找到对应记录！");
            }else{
                retMap=UtilMisc.toMap("retCode", "00", "retMsg", "请求处理成功");
                retMap.put("data",regionEntities);
            }
            return retMap;
        }
    }
}
