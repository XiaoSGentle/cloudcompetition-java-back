package com.xiaos.cloud.db.dto.questions;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "查询题目参数，其中有些参数可留空")
public class GetQuestionsParam {


    @ApiModelProperty("题目类型：1-单选，2-多选，3-shell")
    String type;
    @ApiModelProperty("按竞赛查：竞赛id")
    String petitionId;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPetitionId() {
        return petitionId;
    }

    public void setPetitionId(String petitionId) {
        this.petitionId = petitionId;
    }
}
