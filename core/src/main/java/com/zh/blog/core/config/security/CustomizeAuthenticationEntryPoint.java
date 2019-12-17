package com.zh.blog.core.config.security;

import com.google.gson.Gson;
import com.zh.blog.api.bean.ApiResult;
import com.zh.blog.api.enums.ErrorCode;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 解决匿名用户访问无权限资源时的异常
 */
@Component
public class CustomizeAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        response.getWriter()
                .write(new Gson().toJson(ApiResult.failedFor(ErrorCode.UNAUTHORIZED.getCode(), "Authentication failure")));
    }
}
