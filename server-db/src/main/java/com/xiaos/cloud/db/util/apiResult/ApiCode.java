package com.xiaos.cloud.db.util.apiResult;

public enum ApiCode {
    SUCCESS(200, "操作成功"),
    UNAUTHORIZED(401, "非法访问"),
    NOT_PERMISSION(403, "没有权限"),
    NOT_FOUND(404, "你请求的资源不存在"),
    FAIL(500, "操作失败"),
    LOGIN_EXCEPTION(4000, "登录失败"),
    SYSTEM_EXCEPTION(5000, "系统异常"),
    PARAMETER_EXCEPTION(5001, "请求参数校验异常"),
    PARAMETER_PARSE_EXCEPTION(5002, "请求参数解析异常"),
    HTTP_MEDIA_TYPE_EXCEPTION(5003, "HTTP内容类型异常"),
    CALF_SYSTEM_EXCEPTION(5100, "系统处理异常"),
    BUSINESS_EXCEPTION(5101, "业务处理异常"),
    DAO_EXCEPTION(5102, "数据库处理异常"),
    VERIFICATION_CODE_EXCEPTION(5103, "验证码校验异常"),
    AUTHENTICATION_EXCEPTION(5104, "登录授权异常"),
    UNAUTHENTICATED_EXCEPTION(5105, "没有访问权限"),
    UNAUTHORIZED_EXCEPTION(5106, "没有访问权限"),
    JWTDECODE_EXCEPTION(5107, "Token解析异常"),
    HTTP_REQUEST_METHOD_NOT_SUPPORTED_EXCEPTION(5108, "METHOD NOT SUPPORTED"),
    BAD_LIMIT_EXCEPTION(5109, "访问次数受限制");

    private final int code;
    private final String message;

    private ApiCode(final int code, final String message) {
        this.code = code;
        this.message = message;
    }

    public static ApiCode getApiCode(int code) {
        ApiCode[] ecs = values();
        ApiCode[] var2 = ecs;
        int var3 = ecs.length;

        for(int var4 = 0; var4 < var3; ++var4) {
            ApiCode ec = var2[var4];
            if (ec.getCode() == code) {
                return ec;
            }
        }

        return SUCCESS;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
