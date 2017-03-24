package com.wlq.resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wang.linqiao on 2017/3/2.
 */
@Controller
@RequestMapping("/angular")
public class AngularDemo {

    @RequestMapping("/{type}")
    public String tableDemo(@PathVariable("type") String type,Model model){
        model.addAttribute("length","12.3");
        return "angularDemo/"+type;
    }
}

