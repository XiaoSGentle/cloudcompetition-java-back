
package com.xiaos.cloud.api.modules.remarks.controller;


import com.xiaos.cloud.db.dto.remarks.QuestionGetParam;
import com.xiaos.cloud.db.dto.remarks.RemarkReturnVo;
import com.xiaos.cloud.db.service.RemarkService;
import com.xiaos.cloud.db.util.apiResult.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController

@Api(tags = "批阅题目")
public class RemarksController {


    @Autowired
    RemarkService remarkService;

    @PostMapping("/remark")
    @ApiOperation(value = "修改题目",tags = "批阅题目")
    public ApiResult<RemarkReturnVo> remark(@ApiParam(value = "批阅题目接收参数") @RequestBody QuestionGetParam param){
        return ApiResult.ok(remarkService.remarkQuestion(param));
    }

}
