package com.xiaos.cloud.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 团队与团队成员关系
 * </p>
 *
 * @author xiaos
 * @since 2023-02-20
 */
@TableName("competition_teams")
@ApiModel(value = "CompetitionTeams对象", description = "团队与团队成员关系")
public class CompetitionTeams implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")

    private Integer id;
    @TableId(value = "uuid")
    @ApiModelProperty("uuid")
    private String uuid;

    @ApiModelProperty("学生uuid列表")
    private String studentUuidList;

    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;
    @TableLogic
    @ApiModelProperty("mbp逻辑删除")
    private Integer isDel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getStudentUuidList() {
        return studentUuidList;
    }

    public void setStudentUuidList(String studentUuidList) {
        this.studentUuidList = studentUuidList;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "CompetitionTeams{" +
            "id = " + id +
            ", uuid = " + uuid +
            ", studentUuidList = " + studentUuidList +
            ", createTime = " + createTime +
            ", isDel = " + isDel +
        "}";
    }
}
