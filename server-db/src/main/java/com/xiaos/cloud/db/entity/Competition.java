package com.xiaos.cloud.db.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;

/**
 * <p>
 * 竞赛表
 * </p>
 *
 * @author xiaos
 * @since 2023-02-20
 */
@ApiModel(value = "Competition对象", description = "竞赛表")
public class Competition implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Integer id;


    @TableId(value = "uuid")
    @ApiModelProperty("uuid")
    private String uuid;

    @ApiModelProperty("添加时间")
    private LocalDateTime addTime;

    @ApiModelProperty("竞赛名称")
    private String name;

    @ApiModelProperty("竞赛开始时间")
    private LocalDateTime beginTime;

    @ApiModelProperty("竞赛结束时间")
    private LocalDateTime endTime;

    @ApiModelProperty("竞赛描述")
    private String competitionDescription;

    @ApiModelProperty("竞赛创建者")
    private String createUser;

    @ApiModelProperty("是否开启排行")
    private Integer rank;

    @ApiModelProperty("是否开启失分明细")
    private Integer sorceDetailed;

    @ApiModelProperty("竞赛模式(1:练习模式，2:竞赛模式)")
    private Integer competitionType;

    @ApiModelProperty("竞赛模式下最大提交次数")
    private Integer maxSubmitTimes;
    @TableLogic
    @ApiModelProperty("mbp删除标记")
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

    public LocalDateTime getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(LocalDateTime beginTime) {
        this.beginTime = beginTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getCompetitionDescription() {
        return competitionDescription;
    }

    public void setCompetitionDescription(String competitionDescription) {
        this.competitionDescription = competitionDescription;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getSorceDetailed() {
        return sorceDetailed;
    }

    public void setSorceDetailed(Integer sorceDetailed) {
        this.sorceDetailed = sorceDetailed;
    }

    public Integer getCompetitionType() {
        return competitionType;
    }

    public void setCompetitionType(Integer competitionType) {
        this.competitionType = competitionType;
    }

    public Integer getMaxSubmitTimes() {
        return maxSubmitTimes;
    }

    public void setMaxSubmitTimes(Integer maxSubmitTimes) {
        this.maxSubmitTimes = maxSubmitTimes;
    }

    public Integer getIsDel() {
        return isDel;
    }

    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    @Override
    public String toString() {
        return "Competition{" +
            "id = " + id +
            ", uuid = " + uuid +
            ", addTime = " + addTime +
            ", name = " + name +
            ", beginTime = " + beginTime +
            ", endTime = " + endTime +
            ", competitionDescription = " + competitionDescription +
            ", createUser = " + createUser +
            ", rank = " + rank +
            ", sorceDetailed = " + sorceDetailed +
            ", competitionType = " + competitionType +
            ", maxSubmitTimes = " + maxSubmitTimes +
            ", isDel = " + isDel +
        "}";
    }
}
