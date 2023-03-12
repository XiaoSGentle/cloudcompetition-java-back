package com.xiaos.cloud.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 题目
 * </p>
 *
 * @author xiaos
 * @since 2023-02-20
 */
@TableName("competition_questions")
@ApiModel(value = "CompetitionQuestions对象", description = "题目")
public class CompetitionQuestions implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Integer id;
    @TableId(value = "uuid")
    @ApiModelProperty("uuid")
    private String uuid;

    @ApiModelProperty("题目标题")
    private String title;

    @ApiModelProperty("题目内容")
    private String content;

    @ApiModelProperty("题目类型")
    private Integer type;

    @ApiModelProperty("题目分值")
    private double score;

    @ApiModelProperty("难度等级")
    private Integer level;

    @ApiModelProperty("选项json")
    private String options;

    @ApiModelProperty("答案json")
    private String answer;

    @ApiModelProperty("添加时间")
    private LocalDateTime addTime;

    @ApiModelProperty("mbp逻辑删除")
    private Integer idDel;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double sorce) {
        this.score = sorce;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public LocalDateTime getAddTime() {
        return addTime;
    }

    public void setAddTime(LocalDateTime addTime) {
        this.addTime = addTime;
    }

    public Integer getIdDel() {
        return idDel;
    }

    public void setIdDel(Integer idDel) {
        this.idDel = idDel;
    }

    @Override
    public String toString() {
        return "CompetitionQuestions{" +
            "id = " + id +
            ", uuid = " + uuid +
            ", title = " + title +
            ", content = " + content +
            ", type = " + type +
            ", score = " + score +
            ", level = " + level +
            ", options = " + options +
            ", answer = " + answer +
            ", addTime = " + addTime +
            ", idDel = " + idDel +
        "}";
    }
}
