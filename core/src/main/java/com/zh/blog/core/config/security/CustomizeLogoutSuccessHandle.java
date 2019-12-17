package com.zh.blog.core.config.security;

import com.google.gson.Gson;
import com.zh.blog.api.bean.ApiResult;
import com.zh.blog.api.enums.ErrorCode;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class CustomizeLogoutSuccessHandle implements LogoutSuccessHandler {

    @Override
    public void onLogoutSuccess(HttpServletRequest httpServletRequest, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        response.getWriter().write(new Gson().toJson(ApiResult.failedFor(ErrorCode.UNAUTHORIZED.getCode(), "Session expired")));
        response.sendRedirect("/");
    }
}
