package com.xiaos.cloud.db.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 竞赛关系表
 * </p>
 *
 * @author xiaos
 * @since 2023-02-20
 */
@TableName("competition_relationships")
@ApiModel(value = "CompetitionRelationships对象", description = "竞赛关系表")
public class CompetitionRelationships implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Integer id;

    @TableId(value = "uuid")
    @ApiModelProperty("uuid")
    private String uuid;

    @ApiModelProperty("竞赛uuid")
    private String competitionUuid;

    @ApiModelProperty("题目uuid列表")
    private String questionUuidList;

    @ApiModelProperty("学生uuid列表")
    private String studentUuidList;

    @ApiModelProperty("团队uuid列表")
    private String teamUuidList;

    @ApiModelProperty("班级uuid列表")
    private String classUuidList;

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

    public String getCompetitionUuid() {
        return competitionUuid;
    }

    public void setCompetitionUuid(String competitionUuid) {
        this.competitionUuid = competitionUuid;
    }

    public String getQuestionUuidList() {
        return questionUuidList;
    }

    public void setQuestionUuidList(String questionUuidList) {
        this.questionUuidList = questionUuidList;
    }

    public String getStudentUuidList() {
        return studentUuidList;
    }

    public void setStudentUuidList(String studentUuidList) {
        this.studentUuidList = studentUuidList;
    }

    public String getTeamUuidList() {
        return teamUuidList;
    }

    public void setTeamUuidList(String teamUuidList) {
        this.teamUuidList = teamUuidList;
    }

    public String getClassUuidList() {
        return classUuidList;
    }

    public void setClassUuidList(String classUuidList) {
        this.classUuidList = classUuidList;
    }

    @Override
    public String toString() {
        return "CompetitionRelationships{" +
            "id = " + id +
            ", uuid = " + uuid +
            ", competitionUuid = " + competitionUuid +
            ", questionUuidList = " + questionUuidList +
            ", studentUuidList = " + studentUuidList +
            ", teamUuidList = " + teamUuidList +
            ", classUuidList = " + classUuidList +
        "}";
    }
}
