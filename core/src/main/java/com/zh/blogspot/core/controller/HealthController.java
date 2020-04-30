package com.zh.blogspot.core.controller;

import com.zh.blogspot.api.bean.ApiResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "success";
    }

    @RequestMapping("/test")
    public String test(String name) {
        log.info("name:{}", name);
        return name;
    }

    @PostMapping("/body/test")
    public ApiResult test2(@RequestBody String json) {
        return ApiResult.successWith(json);
    }
}
