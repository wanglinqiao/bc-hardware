package com.wlq.resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

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
