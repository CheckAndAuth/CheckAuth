package com.check.auth.g3.hessian.checkauth.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.check.auth.g3.core.checkauth.entity.UserAdviceEntity;
import com.check.auth.g3.core.checkauth.service.UserAdviceService;
import com.check.auth.g3.core.checkauth.utils.tools.UtilMisc;

@Controller
@RequestMapping("/userAdvice")
public class UserAdviceController extends BaseController {

    @Autowired
    private UserAdviceService userAdviceService;

    @RequestMapping("/list")
    @ResponseBody
    public String authInstList(HttpServletRequest request) {
        return "index";
    }

    @RequestMapping("/submit")
    @ResponseBody
    public Map<String,Object> queryByInstCode(HttpServletRequest request, UserAdviceEntity userAdviceEntity) {
        Map<String,Object> retMap=null;
        if(null == userAdviceEntity){
            retMap=UtilMisc.toMap("retCode","01","retMsg","提交的内容不能为空！");
            return retMap;
        }else{
            int i = userAdviceService.insert(userAdviceEntity);
            if(i==0){
                retMap=UtilMisc.toMap("retCode", "02", "retMsg", "提交建议失败！");
            }else{
                retMap=UtilMisc.toMap("retCode", "00", "retMsg", "提交建议成功");
                retMap.put("data",i);
            }
            return retMap;
        }
    }


}
