package com.zh.blogspot.core.config.security;

import com.google.gson.Gson;
import com.zh.blogspot.api.bean.ApiResult;
import com.zh.blogspot.api.enums.ErrorCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.session.InvalidSessionStrategy;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
@Slf4j
public class CustomInvalidSessionStrategy implements InvalidSessionStrategy {

    @Override
    public void onInvalidSessionDetected(HttpServletRequest httpServletRequest, HttpServletResponse response) throws IOException, ServletException {
        log.info("session expired");

        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        response.getWriter().write(new Gson().toJson(ApiResult.failedFor(ErrorCode.UNAUTHORIZED.getCode(), "Session expired")));
    }
}
