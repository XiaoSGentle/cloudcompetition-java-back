package com.xiaos.cloud.db.dto.remarks;


import com.xiaos.cloud.db.dto.remarks.shellquestion.PostRemarksParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "题目接收参数",description = "判题传入参数")
public class QuestionGetParam {

    @ApiModelProperty(value = "竞赛ID",example = "竞赛ID")
    String competitionId;
    @ApiModelProperty(value = "学生ID",example = "学生ID")
    String studentId;
    @ApiModelProperty(value = "题目ID",example = "12001231")
    String questionId;
    @ApiModelProperty(value = "学生答案",example = "A,shell题留空")
    String studentAnswer;
    @ApiModelProperty(value = "目标机器用户名",example = "root")
    private String username;
    @ApiModelProperty(value = "目标机器密码",example = "root")
    private String password;
    @ApiModelProperty(value = "目标机器地址",example = "192.168.1.100")
    private String hosts;

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

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
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

    public String getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(String studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

    public QuestionGetParam() {
    }

    public QuestionGetParam(String competitionId, String studentId, String questionId, String studentAnswer) {
        this.competitionId = competitionId;
        this.studentId = studentId;
        this.questionId = questionId;
        this.studentAnswer = studentAnswer;
    }

    public QuestionGetParam(String competitionId, String studentId, String questionId, String studentAnswer, String username, String password, String hosts) {
        this.competitionId = competitionId;
        this.studentId = studentId;
        this.questionId = questionId;
        this.studentAnswer = studentAnswer;
        this.username = username;
        this.password = password;
        this.hosts = hosts;
    }
}
