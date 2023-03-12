package com.xiaos.cloud.api.modules.student.controller;

import com.xiaos.cloud.db.entity.CompetitionUsers;
import com.xiaos.cloud.db.service.CompetitionUsersService;
import com.xiaos.cloud.db.util.apiResult.ApiResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/student")
@Api(tags = "学生管理")
public class StudentController {
    @Autowired
    CompetitionUsersService studentsService;
    @ApiOperation(value = "获取学生信息")
    @GetMapping("/getAllStudents")
    public ApiResult<List<CompetitionUsers>> getAllStudent(){
        return  ApiResult.ok(studentsService.list());
    }
    @ApiOperation("添加学生")
    @PostMapping("/addStudents")
    public ApiResult<Boolean> addStudent( @RequestBody
                                          @ApiParam(value = "学生列表") List<CompetitionUsers> studentsList){
        return  ApiResult.ok(studentsService.saveBatch(studentsList));
    }
    @ApiOperation("修改学生信息")
    @PostMapping("/upDateStudent")
    public ApiResult<Boolean> upDateStudent(@RequestBody
                                                @ApiParam(value = "学生列表")  List<CompetitionUsers> studentsList){
        return ApiResult.ok(studentsService.updateBatchById(studentsList));
    }
    @ApiOperation("删除学生")
    @PostMapping("/deleteStudent")
    public ApiResult<Boolean> deleteStudents(@RequestBody
                                                 @ApiParam(value = "学生ID列表")  List<String> ids){
        return ApiResult.ok(studentsService.removeByIds(ids));
    }

}
