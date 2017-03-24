package com.wlq.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wang.linqiao on 2017/2/20.
 */
@Controller
public class PageResource {
    @RequestMapping("/")
    public String toIndex()throws Exception{
        return "index";
//        return "angularDemo/tableDemo.html";
    }

}
