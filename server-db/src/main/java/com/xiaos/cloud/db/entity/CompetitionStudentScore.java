package com.xiaos.cloud.db.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 当场竞赛得分
 * </p>
 *
 * @author xiaos
 * @since 2023-02-20
 */
@TableName("competition_student_score")
@ApiModel(value = "CompetitionStudentScore对象", description = "当场竞赛得分")
public class CompetitionStudentScore implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")

    private Integer id;
    @TableId(value = "uuid")
    @ApiModelProperty("uuid")
    private String uuid;

    @ApiModelProperty("竞赛uuid")
    private String competitionUuid;

    @ApiModelProperty("用户uuid")
    private String userUuid;

    @ApiModelProperty("竞赛总分")
    private String studentScore;

    @ApiModelProperty("最后更新时间")
    private LocalDateTime lastUpdatetime;

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

    public String getUserUuid() {
        return userUuid;
    }

    public void setUserUuid(String userUuid) {
        this.userUuid = userUuid;
    }

    public String getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(String studentScore) {
        this.studentScore = studentScore;
    }

    public LocalDateTime getLastUpdatetime() {
        return lastUpdatetime;
    }

    public void setLastUpdatetime(LocalDateTime lastUpdatetime) {
        this.lastUpdatetime = lastUpdatetime;
    }

    @Override
    public String toString() {
        return "CompetitionStudentScore{" +
            "id = " + id +
            ", uuid = " + uuid +
            ", competitionUuid = " + competitionUuid +
            ", userUuid = " + userUuid +
            ", studentSorce = " + studentScore +
            ", lastUpdateti = " + lastUpdatetime +
        "}";
    }
}
