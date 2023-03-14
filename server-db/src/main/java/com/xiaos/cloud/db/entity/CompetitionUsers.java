package com.xiaos.cloud.db.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author xiaos
 * @since 2023-02-20
 */
@TableName("competition_users")
@ApiModel(value = "SysUsers对象", description = "用户表")
public class CompetitionUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private String id;


    @TableId(value = "uuid")
    @ApiModelProperty("uuid")
    private String uuid;

    @ApiModelProperty("账号")
    private String username;

    @ApiModelProperty("密码")
    private String password;

    @ApiModelProperty("角色")
    private String role;

    @ApiModelProperty("学生姓名")
    private String name;

    @ApiModelProperty("学生班级")
    private Integer className;

    @ApiModelProperty("账号状态")
    private Integer active;

    @ApiModelProperty("添加时间")
    private LocalDateTime addTime;


    @TableLogic
    @ApiModelProperty(value = "逻辑删除字段",hidden = true)
    private  Integer  isDel;

    public Integer getClassName() {
        return className;
    }

    public void setClassName(Integer class_name) {
        this.className = class_name;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public LocalDateTime getAddTime() {
        return addTime;
    }

    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "CompetitionUsers{" +
                "id='" + id + '\'' +
                ", uuid='" + uuid + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", className=" + className +
                ", active=" + active +
                ", addTime=" + addTime +
                ", isDel=" + isDel +
                '}';
    }
}
