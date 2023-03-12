package com.xiaos.cloud.db.dto.classroom;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

@ApiModel(description = "创建竞赛班级参数")
public class CreateClassParam {
    @ApiModelProperty("添加时间")
    private LocalDateTime addTime;

    @ApiModelProperty("竞赛班级名称")
    private String name;

    @ApiModelProperty("管理者id")
    private String createUuid;

    @ApiModelProperty("班级备注")
    private String classDes;


    public LocalDateTime getAddTime() {
        return addTime;
    }

    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreateUuid() {
        return createUuid;
    }

    public void setCreateUuid(String createUuid) {
        this.createUuid = createUuid;
    }

    public String getClassDes() {
        return classDes;
    }

    public void setClassDes(String classDes) {
        this.classDes = classDes;
    }
}
