package com.xiaos.cloud.db.entity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.auth.In;
/**
 * <p>
 * 竞赛班级
 * </p>
 *
 * @author xiaos
 * @since 2023-02-20
 */
@TableName("competition_class")
@ApiModel(value = "CompetitionClass对象", description = "竞赛班级")
public class CompetitionClass implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("id")
    private Integer id;


    @TableId(value = "uuid")
    @ApiModelProperty("uuid")
    private String uuid;

    @ApiModelProperty("添加时间")
    private LocalDateTime addTime;

    @ApiModelProperty("竞赛班级名称")
    private String name;

    @ApiModelProperty("管理者id")
    private String createUuid;

    @ApiModelProperty("班级备注")
    private String classDes;

    @TableLogic
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

    public Integer getIdDel() {
        return idDel;
    }

    public void setIdDel(Integer idDel) {
        this.idDel = idDel;
    }

    @Override
    public String toString() {
        return "CompetitionClass{" +
            "id = " + id +
            ", uuid = " + uuid +
            ", addTime = " + addTime +
            ", name = " + name +
            ", createUuid = " + createUuid +
            ", classDes = " + classDes +
            ", idDel = " + idDel +
        "}";
    }
}
