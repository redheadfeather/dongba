package com.zl.dongba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ZhuLing
 * @date 2021/11/4 - 15:26
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String index(){
        return "starter";
    }
    @RequestMapping("/{module}/{moduleUI}")
    public String doModuleUI(@PathVariable(value = "module") String module,
                             @PathVariable(value = "moduleUI") String moduleUI){
        return "sys/"+moduleUI;
    }
    @RequestMapping("/doPageUI")
    public String doPageUI(){
        return "common/page";
    }
}
