package com.leo.flowrestrict.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.leo.flowrestrict.Response.RestBaseResp;
import com.leo.flowrestrict.algorithms.Counter;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by leo on 2020/7/21.
 * Description:
 */
@Order(-1)
@WebFilter(urlPatterns = "/counter")
@Slf4j
public class CounterFilter implements Filter {
    @Autowired
    private Counter counter;
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        log.info("[request info...] path info:{}", request.getServletPath());
        if (request.getServletPath().equals("/counter") && !counter.filter()) {
            servletResponse.getWriter().write(objectMapper.writeValueAsString(RestBaseResp.FLOW_RESTRICT));
        } else {
            filterChain.doFilter(request, servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
