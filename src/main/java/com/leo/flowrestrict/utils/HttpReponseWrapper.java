package com.leo.flowrestrict.utils;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

/**
 * Created by leo on 2020/7/21.
 * Description:
 */
public class HttpReponseWrapper extends HttpServletResponseWrapper{

    public HttpReponseWrapper(HttpServletResponse response) {
        super(response);
    }
}
