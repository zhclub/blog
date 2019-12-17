package com.zh.blog.api.enums;

public enum ErrorCode {

    SUCCESS(0, "Success"),

    UNAUTHORIZED(401, "Unauthorized");
    ;

    private int code;

    private String message;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
