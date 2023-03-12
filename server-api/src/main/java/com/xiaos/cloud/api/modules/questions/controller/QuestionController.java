package com.xiaos.cloud.api.modules.questions.controller;


import com.xiaos.cloud.db.dto.questions.GetQuestionsParam;
import com.xiaos.cloud.db.entity.CompetitionQuestions;
import com.xiaos.cloud.db.service.CompetitionQuestionsService;
import com.xiaos.cloud.db.util.apiResult.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "题目管理")
@RestController
@RequestMapping("/question")
public class QuestionController {
    @Autowired
    CompetitionQuestionsService mainQuestionService;


    @ApiOperation("创建题目")
    @PostMapping("/createQuestion")
    public ApiResult<Boolean> createQuestion(@RequestBody @ApiParam(value = "添加的题目列表") List<CompetitionQuestions> questions){
        return ApiResult.ok(mainQuestionService.saveBatch(questions));
    }

    @ApiOperation("修改题目")
    @PostMapping("/updateQuestions")
    public ApiResult<Boolean> updateQuestions(@RequestBody
                                                  @ApiParam(value = "按照ID修改，题目列表") List<CompetitionQuestions> questionList){
        return ApiResult.ok(mainQuestionService.updateBatchById(questionList));
    }


    @ApiOperation("删除题目")
    @PostMapping("/delQuestions")
    public ApiResult<Boolean> delQuestions(@RequestBody
                                               @ApiParam(value = "删除的id列表",example = "['10002','10003']") List<String> questionIdList){
        return ApiResult.ok(mainQuestionService.removeByIds(questionIdList));
    }


    @ApiOperation("查询题目")
    @GetMapping("/selectQuestions")
    public ApiResult<List<CompetitionQuestions>> getQuestions(@RequestBody
                                                          @ApiParam(value = "type-题目类型，petitionId-竞赛场次") GetQuestionsParam getQuestionsParam){
//        return  ApiResult.ok(mainQuestionService.getQuestions(getQuestionsParam));
        return  null;
    }
}
