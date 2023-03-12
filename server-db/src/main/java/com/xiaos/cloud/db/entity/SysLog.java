package com.xiaos.cloud.db.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author xiaos
 * @since 2023-02-20
 */
@TableName("sys_log")
@ApiModel(value = "SysLog对象", description = "")
public class SysLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("uuid")
    private Integer uuid;

    @ApiModelProperty("操作的用户id")
    private String userUuid;

    @ApiModelProperty("具体内容")
    private String logContent;

    @ApiModelProperty("日志时间")
    private LocalDateTime addTime;

    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getLogContent() {
        return logContent;
    }

    public void setLogContent(String logContent) {
        this.logContent = logContent;
    }

    public LocalDateTime getAddTime() {
        return addTime;
    }

    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "SysLog{" +
            "uuid = " + uuid +
            ", userUuid = " + userUuid +
            ", logContent = " + logContent +
            ", addTime = " + addTime +
        "}";
    }
}
