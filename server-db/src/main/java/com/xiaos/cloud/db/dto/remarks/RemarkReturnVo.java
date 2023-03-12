package com.xiaos.cloud.db.dto.remarks;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("答题返回对象")
public class RemarkReturnVo {



    @ApiModelProperty("竞赛ID")
    String competitionId;
    @ApiModelProperty("学生ID")
    String studentId;
    @ApiModelProperty("题目ID")
    String questionId;
    @ApiModelProperty("本场竞赛总分")
    String competitionAllScore;
    @ApiModelProperty("本题得分")
    double nowQuestionScore;
    @ApiModelProperty("附加消息")
    String msg;

    @Override
    public String toString() {
        return "RemarkReturnVo{" +
                "competitionId='" + competitionId + '\'' +
                ", studentId='" + studentId + '\'' +
                ", questionId='" + questionId + '\'' +
                ", competitionAllScore='" + competitionAllScore + '\'' +
                ", nowQuestionScore='" + nowQuestionScore + '\'' +
                '}';
    }

    public String getCompetitionId() {
        return competitionId;
    }

    public void setCompetitionId(String competitionId) {
        this.competitionId = competitionId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getCompetitionAllScore() {
        return competitionAllScore;
    }

    public void setCompetitionAllScore(String competitionAllScore) {
        this.competitionAllScore = competitionAllScore;
    }

    public double getNowQuestionScore() {
        return nowQuestionScore;
    }

    public void setNowQuestionScore(double nowQuestionScore) {
        this.nowQuestionScore = nowQuestionScore;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public RemarkReturnVo(String msg) {
        this.msg = msg;
    }

    public RemarkReturnVo() {
    }

    public RemarkReturnVo(String competitionId, String studentId, String questionId) {
        this.competitionId = competitionId;
        this.studentId = studentId;
        this.questionId = questionId;
    }

    public RemarkReturnVo(String competitionId, String studentId, String questionId, String competitionAllScore, double nowQuestionScore) {
        this.competitionId = competitionId;
        this.studentId = studentId;
        this.questionId = questionId;
        this.competitionAllScore = competitionAllScore;
        this.nowQuestionScore = nowQuestionScore;
    }
}
