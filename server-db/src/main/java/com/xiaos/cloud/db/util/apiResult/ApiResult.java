package com.xiaos.cloud.db.util.apiResult;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ApiResult<T> implements Serializable {
    private static final long serialVersionUID = 8004487252556526569L;
    @ApiModelProperty("响应码")
    private int status;
    @ApiModelProperty("是否成功：成功true，失败false")
    private boolean success;
    @ApiModelProperty("响应消息")
    private String msg;
    @ApiModelProperty("响应数据")
    private T data;
    @ApiModelProperty("响应时间")
    @JSONField(
            format = "yyyy-MM-dd HH:mm:ss"
    )
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    private Date time;

    public ApiResult() {
        this.time = new Date();
    }

    public static ApiResult<Boolean> result(boolean flag) {
        return flag ? ok() : fail();
    }

    public static ApiResult<Boolean> result(ApiCode apiCode) {
        return result(apiCode, null);
    }

    public static <T> ApiResult<T> result(ApiCode apiCode, T data) {
        return result(apiCode, (String)null, data);
    }

    public static <T> ApiResult<T> result(ApiCode apiCode, String message, T data) {
        boolean success = false;
        if (apiCode.getCode() == ApiCode.SUCCESS.getCode()) {
            success = true;
        }

        if (StringUtils.isBlank(message)) {
            message = apiCode.getMessage();
        }
        return (ApiResult<T>) builder().status(apiCode.getCode()).msg(message).data(data).success(success).time(new Date()).build();
    }

    public static ApiResult<Boolean> ok() {
        return ok(null);
    }

    public static <T> ApiResult<T> ok(T data) {
        return result(ApiCode.SUCCESS, data);
    }

    public static <T> ApiResult<T> ok(T data, String message) {
        return result(ApiCode.SUCCESS, message, data);
    }

    public static ApiResult<Map<String, Object>> okMap(String key, Object value) {
        Map<String, Object> map = new HashMap(1);
        map.put(key, value);
        return ok(map);
    }

    public  static  ApiResult<Boolean> fail(ApiCode apiCode){
        return  result(apiCode,null);
    }
    public static ApiResult<String> fail(String message) {
        return result(ApiCode.FAIL, message, null);
    }

    public static <T> ApiResult<T> fail(ApiCode apiCode, T data) {
        if (ApiCode.SUCCESS == apiCode) {
            throw new RuntimeException("失败结果状态码不能为" + ApiCode.SUCCESS.getCode());
        } else {
            return result(apiCode, data);
        }
    }

    public static ApiResult<String> fail(Integer errorCode, String message) {
        return (new ApiResult()).setSuccess(false).setStatus(errorCode).setMsg(message);
    }

    public static ApiResult<Map<String, Object>> fail(String key, Object value) {
        Map<String, Object> map = new HashMap(1);
        map.put(key, value);
        return result(ApiCode.FAIL, map);
    }

    public static ApiResult<Boolean> fail() {
        return fail(ApiCode.FAIL);
    }

    public static <T> ApiResultBuilder<T> builder() {
        return new ApiResultBuilder();
    }

    public int getStatus() {
        return this.status;
    }

    public boolean isSuccess() {
        return this.success;
    }

    public String getMsg() {
        return this.msg;
    }

    public T getData() {
        return this.data;
    }

    public Date getTime() {
        return this.time;
    }

    public ApiResult<T> setStatus(final int status) {
        this.status = status;
        return this;
    }

    public ApiResult<T> setSuccess(final boolean success) {
        this.success = success;
        return this;
    }

    public ApiResult<T> setMsg(final String msg) {
        this.msg = msg;
        return this;
    }

    public ApiResult<T> setData(final T data) {
        this.data = data;
        return this;
    }

    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )
    public ApiResult<T> setTime(final Date time) {
        this.time = time;
        return this;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ApiResult)) {
            return false;
        } else {
            ApiResult<?> other = (ApiResult)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getStatus() != other.getStatus()) {
                return false;
            } else if (this.isSuccess() != other.isSuccess()) {
                return false;
            } else {
                label52: {
                    Object this$msg = this.getMsg();
                    Object other$msg = other.getMsg();
                    if (this$msg == null) {
                        if (other$msg == null) {
                            break label52;
                        }
                    } else if (this$msg.equals(other$msg)) {
                        break label52;
                    }

                    return false;
                }

                Object this$data = this.getData();
                Object other$data = other.getData();
                if (this$data == null) {
                    if (other$data != null) {
                        return false;
                    }
                } else if (!this$data.equals(other$data)) {
                    return false;
                }

                Object this$time = this.getTime();
                Object other$time = other.getTime();
                if (this$time == null) {
                    if (other$time != null) {
                        return false;
                    }
                } else if (!this$time.equals(other$time)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ApiResult;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getStatus();
        result = result * 59 + (this.isSuccess() ? 79 : 97);
        Object $msg = this.getMsg();
        result = result * 59 + ($msg == null ? 43 : $msg.hashCode());
        Object $data = this.getData();
        result = result * 59 + ($data == null ? 43 : $data.hashCode());
        Object $time = this.getTime();
        result = result * 59 + ($time == null ? 43 : $time.hashCode());
        return result;
    }

    public String toString() {
        return "ApiResult(status=" + this.getStatus() + ", success=" + this.isSuccess() + ", msg=" + this.getMsg() + ", data=" + this.getData() + ", time=" + this.getTime() + ")";
    }

    public ApiResult(final int status, final boolean success, final String msg, final T data, final Date time) {
        this.status = status;
        this.success = success;
        this.msg = msg;
        this.data = data;
        this.time = time;
    }

    public static class ApiResultBuilder<T> {
        private int status;
        private boolean success;
        private String msg;
        private T data;
        private Date time;

        ApiResultBuilder() {
        }

        public ApiResultBuilder<T> status(final int status) {
            this.status = status;
            return this;
        }

        public ApiResultBuilder<T> success(final boolean success) {
            this.success = success;
            return this;
        }

        public ApiResultBuilder<T> msg(final String msg) {
            this.msg = msg;
            return this;
        }

        public ApiResultBuilder<T> data(final T data) {
            this.data = data;
            return this;
        }

        @JsonFormat(
                pattern = "yyyy-MM-dd HH:mm:ss",
                timezone = "GMT+8"
        )
        public ApiResultBuilder<T> time(final Date time) {
            this.time = time;
            return this;
        }

        public ApiResult<T> build() {
            return new ApiResult(this.status, this.success, this.msg, this.data, this.time);
        }

        public String toString() {
            return "ApiResult.ApiResultBuilder(status=" + this.status + ", success=" + this.success + ", msg=" + this.msg + ", data=" + this.data + ", time=" + this.time + ")";
        }
    }
}