package com.xiaos.cloud.db.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 学生做题记录
 * </p>
 *
 * @author xiaos
 * @since 2023-02-20
 */
@TableName("competition_student_details")
@ApiModel(value = "CompetitionStudentDetails对象", description = "学生做题记录")
public class CompetitionStudentDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")

    private Integer id;
    @TableId(value = "uuid")
    @ApiModelProperty("uuid")
    private String uuid;

    @ApiModelProperty("学生uuid")
    private String studentUuid;

    @ApiModelProperty("竞赛uuid")
    private String competitionUuid;

    @ApiModelProperty("题目uuid")
    private String questionUuid;

    @ApiModelProperty("本题获得的分数")
    private double thisScore;

    @ApiModelProperty("正确答案")
    private  String trueAnswer;

    @ApiModelProperty("最后一次学生提交的答案")
    private String submitAnswer;

    @ApiModelProperty("已经提交次数")
    private Integer submitTimes;

    @ApiModelProperty("shell记录")
    private String shellRemark;

    @ApiModelProperty("最后一次提交的时间")
    private String lastTime;


    public String getTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(String trueAnswer) {
        this.trueAnswer = trueAnswer;
    }

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

    public String getStudentUuid() {
        return studentUuid;
    }

    public void setStudentUuid(String studentUuid) {
        this.studentUuid = studentUuid;
    }

    public String getCompetitionUuid() {
        return competitionUuid;
    }

    public void setCompetitionUuid(String competitionUuid) {
        this.competitionUuid = competitionUuid;
    }

    public String getQuestionUuid() {
        return questionUuid;
    }

    public void setQuestionUuid(String questionUuid) {
        this.questionUuid = questionUuid;
    }

    public double getThisScore() {
        return thisScore;
    }

    public void setThisScore(double thisScore) {
        this.thisScore = thisScore;
    }

    public String getSubmitAnswer() {
        return submitAnswer;
    }

    public void setSubmitAnswer(String submitAnswer) {
        this.submitAnswer = submitAnswer;
    }

    public Integer getSubmitTimes() {
        return submitTimes;
    }

    public void setSubmitTimes(Integer submitTimes) {
        this.submitTimes = submitTimes;
    }

    public String getShellRemark() {
        return shellRemark;
    }

    public void setShellRemark(String shellRemark) {
        this.shellRemark = shellRemark;
    }

    public String getLastTime() {
        return lastTime;
    }

    public void setLastTime(String lastTime) {
        this.lastTime = lastTime;
    }

    @Override
    public String toString() {
        return "CompetitionStudentDetails{" +
            "id = " + id +
            ", uuid = " + uuid +
            ", studentUuid = " + studentUuid +
            ", competitionUuid = " + competitionUuid +
            ", questionUuid = " + questionUuid +
            ", thisScore = " + thisScore +
            ", submitAnswer = " + submitAnswer +
            ", submitTimes = " + submitTimes +
            ", shellRemark = " + shellRemark +
            ", lastTime = " + lastTime +
        "}";
    }

    public CompetitionStudentDetails(String studentUuid, String competitionUuid, String questionUuid, double thisScore, String submitAnswer, Integer submitTimes, String shellRemark, String lastTime) {
        this.competitionUuid = competitionUuid;
        this.studentUuid = studentUuid;
        this.questionUuid = questionUuid;
        this.thisScore = thisScore;
        this.submitAnswer = submitAnswer;
        this.submitTimes = submitTimes;
        this.shellRemark = shellRemark;
        this.lastTime = lastTime;
    }

}
