package com.check.auth.g3.hessian.checkauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/test")
public class IndexController extends BaseController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        request.setAttribute("messageType", "123");
        return "index";
    }
}
