package com.qiuguan.boot.autoconfigure.date;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @author: qiuguan
 * date: 2022/1/11 - 下午10:49
 */
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long start = System.currentTimeMillis();
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        filterChain.doFilter(servletRequest, servletResponse);

        System.out.println("请求：" + request.getRequestURI() + " 耗时：" + (System.currentTimeMillis() - start));
    }

    @Override
    public void destroy() {

    }
}
