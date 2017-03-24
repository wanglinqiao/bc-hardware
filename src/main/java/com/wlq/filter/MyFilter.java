package com.wlq.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * Created by wang.linqiao on 2017/2/22.
 * 使用注解标注过滤器
 * @version v.0.1
 * @WebFilter将一个实现了javax.servlet.Filter接口的类定义为过滤器 属性filterName声明过滤器的名称, 可选
 * 属性urlPatterns指定要过滤的URL模式,也可使用属性value来声明.(指定要过滤的URL模式是必选属性)
 */
@WebFilter(filterName = "myFilter", urlPatterns = "/*",initParams = {
        @WebInitParam(name = "sessionCookieName",value = "rsid"),
        @WebInitParam(name = "maxInactiveInterval",value = "1800")
})
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器初始化");
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        System.out.println("执行过滤操作");
        chain.doFilter(request, response);
    }
    @Override
    public void destroy() {
        System.out.println("过滤器销毁");
    }
}
