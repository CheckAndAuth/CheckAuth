package com.check.auth.g3.hessian.checkauth.controller;

import com.check.auth.g3.core.checkauth.entity.AuthInstDetailEntity;
import com.check.auth.g3.core.checkauth.entity.AuthInstEntity;
import com.check.auth.g3.core.checkauth.entity.query.InstQuery;
import com.check.auth.g3.core.checkauth.service.AuthInstDetailService;
import com.check.auth.g3.core.checkauth.service.AuthInstService;
import com.check.auth.g3.core.checkauth.utils.tools.UtilMisc;
import com.check.auth.g3.facade.checkauth.facade.dto.PageDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/authInst")
public class AuthInstController extends BaseController {

    @Autowired
    private AuthInstService authInstService;
    @Autowired
    private AuthInstDetailService authInstDetailService;

    @RequestMapping("/list")
    @ResponseBody
    public String authInstList(HttpServletRequest request) {
        return "index";
    }

    @RequestMapping("/query")
    @ResponseBody
    public Map<String,Object> queryByInstCode(HttpServletRequest request, String instCode) {
        Map<String,Object> retMap=null;
        if(StringUtils.isBlank(instCode)){
            retMap=UtilMisc.toMap("retCode","01","retMsg","instCode不能为空！");
            return retMap;
        }else{
            AuthInstEntity authInstEntity=authInstService.selectAuthInstByInstCode(instCode);
            if(authInstEntity==null){
                retMap=UtilMisc.toMap("retCode", "02", "retMsg", "没有找到对应记录！");
            }else{
                retMap=UtilMisc.toMap("retCode", "00", "retMsg", "请求处理成功");
                retMap.put("data",authInstEntity);
            }
            return retMap;
        }
    }

    @RequestMapping("/fuzzyQuery")
    @ResponseBody
    public Map<String, Object> fuzzyQuery(HttpServletRequest request, InstQuery instQuery) {
        Map<String, Object> retMap = null;
        if(StringUtils.isBlank(instQuery.getQueryFlag())) {
            retMap = UtilMisc.toMap("retCode", "01", "retMsg", "检索类型不能为空！");
            return retMap;
        }else{
            Map<String, Object> reqMap=adjustQueryKey(instQuery);
            reqMap.put("fuzzy", "true");
            reqMap.put("pageNum",instQuery.getPageNum());
            reqMap.put("pageSize",instQuery.getPageSize());
            PageDTO<AuthInstEntity> pageList = authInstService.selectListByPage(reqMap);
            retMap = UtilMisc.toMap("retCode", "00", "retMsg", "请求处理成功");
            retMap.put("data", pageList);
            return retMap;
        }
    }

    @RequestMapping("/fuzzyQueryDetail")
    @ResponseBody
    public Map<String, Object> fuzzyQueryDetail(HttpServletRequest request, InstQuery instQuery) {
        Map<String, Object> retMap = null;
        if(StringUtils.isBlank(instQuery.getQueryFlag())) {
            retMap = UtilMisc.toMap("retCode", "01", "retMsg", "检索类型不能为空！");
            return retMap;
        }else{
            Map<String, Object> reqMap = adjustQueryKey(instQuery);
            reqMap.put("fuzzy", "true");
            reqMap.put("pageNum", instQuery.getPageNum());
            reqMap.put("pageSize", instQuery.getPageSize());
            PageDTO<AuthInstDetailEntity> pageList = authInstDetailService.selectListByPage(reqMap);
            retMap = UtilMisc.toMap("retCode", "00", "retMsg", "请求处理成功");
            retMap.put("data", pageList);
            return retMap;
        }
    }
    /**
     *
     * @param request
     * @param instQuery 输入的搜索词,queryFlag 标识, 1表示CCC认证机构, 2表示有机认证机构, 3表示ISO9001认证机构, 4表示CNAS认可机构,5表示按成立年限排序,6表示按证书量排序
     * @return
     */
    @RequestMapping("/hotQuery")
    @ResponseBody
    public Map<String,Object> hotQuery(HttpServletRequest request, InstQuery instQuery){
    	Map<String,Object> retMap=null;
        if(StringUtils.isBlank(instQuery.getQueryFlag())){
            retMap=UtilMisc.toMap("retCode","01","retMsg","content不能为空！");
            return retMap;
        }else{
        	Map<String, Object> reqMap = adjustHotQueryKey(instQuery);
        	reqMap.put("pageNum", instQuery.getPageNum());
            reqMap.put("pageSize", instQuery.getPageSize());
            PageDTO<AuthInstDetailEntity> pageList = authInstDetailService.selectListByPage(reqMap);
            retMap = UtilMisc.toMap("retCode", "00", "retMsg", "请求处理成功");
            retMap.put("data", pageList);
            return retMap;
        }
    }
    @RequestMapping("/queryDetailByInstCode")
    @ResponseBody
    public Map<String, Object> queryDetailByInstCode(HttpServletRequest request, String instCode){
    	Map<String,Object> retMap=null;
        if(StringUtils.isBlank(instCode)){
            retMap=UtilMisc.toMap("retCode","01","retMsg","instCode不能为空！");
            return retMap;
        }else{
            AuthInstDetailEntity authInstDetailEntity=authInstDetailService.queryInstDetailByInstCode(instCode);
            if(authInstDetailEntity==null){
                retMap=UtilMisc.toMap("retCode", "02", "retMsg", "没有找到对应记录！");
            }else{
            	authInstDetailService.updatePageViewByInstCode(authInstDetailEntity.getPageView()+1, instCode);
                retMap=UtilMisc.toMap("retCode", "00", "retMsg", "请求处理成功");
                retMap.put("data", authInstDetailEntity);
            }
            return retMap;
        }
    }

    private Map<String,Object> adjustQueryKey(InstQuery instQuery){
        Map<String, Object> map = new HashMap<String, Object>();
        String queryFlag=instQuery.getQueryFlag();
        if(StringUtils.isNotBlank(queryFlag)) {
            if("1".equals(queryFlag)) {
                map.put("instName",instQuery.getQueryContent());
            }else if ("2".equals(queryFlag)) {
                map.put("busiScope", instQuery.getQueryContent());
            }else if ("3".equals(queryFlag)) {
                map.put("districtCodeName", instQuery.getQueryContent());
            }else if ("4".equals(queryFlag)){//认可情况
                map.put("rec", instQuery.getQueryContent());
            }else if("0".equals(queryFlag)){
            	map.put("instName1",instQuery.getQueryContent());
            	map.put("busiScope1", instQuery.getQueryContent());
            	map.put("districtCodeName1", instQuery.getQueryContent());
            	map.put("rec1", instQuery.getQueryContent());
            }else {
                throw new IllegalArgumentException("检索类型参数不能为空");
            }
            return map;
        }else{
            return map;
        }
    }
    
    private Map<String,Object> adjustHotQueryKey(InstQuery instQuery){
    	Map<String, Object> map = new HashMap<String, Object>();
    	String queryFlag=instQuery.getQueryFlag();
    	if(StringUtils.isNotBlank(queryFlag)) {
    		if("0".equals(queryFlag)) {//3C认证机构
    			map.put("isCCCInst","是");
    		}else if ("1".equals(queryFlag)) {//有机认证机构
    			map.put("isOrganicInst", "1");
    		}else if ("2".equals(queryFlag)) {//ISO9001认证机构
    			map.put("isISO9001Inst", "1");
    		}else if ("3".equals(queryFlag)){//CNAS认可机构
    			map.put("cnasRec", "认可");
    		}else if("4".equals(queryFlag)){//按成立年限排序
    			map.put("extTime", "1");
    		}else if ("5".equals(queryFlag)) {//按证书数量排序
				map.put("authCount", "1");
			}else {
    			throw new IllegalArgumentException("检索类型参数不能为空");
    		}
    		return map;
    	}else{
    		return map;
    	}
    }
    
    
    @RequestMapping("/getTopN")
    @ResponseBody
    public Map<String, Object> getTopN(HttpServletRequest request) {
    	Map<String,Object> retMap=new HashMap<String,Object>();
    	List<AuthInstDetailEntity> list=authInstDetailService.selectTopN();
    	retMap=UtilMisc.toMap("retCode", "00", "retMsg", "请求处理成功");
    	retMap.put("data", list);
    	return retMap;
	}

}
