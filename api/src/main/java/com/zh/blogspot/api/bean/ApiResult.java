package com.zh.blogspot.api.bean;

import static com.zh.blogspot.api.enums.ErrorCode.SUCCESS;

/**
 * 接口统计返回模型
 *
 * @param <T>
 */
public class ApiResult<T> {

    private int code;

    private String message;

    private boolean success;

    private T data;

    private ApiResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
        success = isSuccess();
    }

    public static <T> ApiResult successWith(T data) {
        return new ApiResult<>(SUCCESS.getCode(), SUCCESS.getMessage(), data);
    }

    public static ApiResult success() {
        return new ApiResult<>(SUCCESS.getCode(), SUCCESS.getMessage(), null);
    }

    public static ApiResult failedFor(int code, String message) {
        return new ApiResult<>(code, message, null);
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public boolean isSuccess() {
        return this.code == SUCCESS.getCode();
    }
}
