package com.xiaos.cloud.db.service.impl;

import cn.hutool.core.date.DateUtil;

import com.alibaba.fastjson.JSONArray;
import com.xiaos.cloud.db.dto.remarks.QuestionGetParam;
import com.xiaos.cloud.db.dto.remarks.RemarkReturnVo;
import com.xiaos.cloud.db.dto.remarks.shellquestion.PostQuestionList;
import com.xiaos.cloud.db.dto.remarks.shellquestion.PostRemarksParam;
import com.xiaos.cloud.db.dto.remarks.shellquestion.RemarksAcceptParam;
import com.xiaos.cloud.db.entity.Competition;
import com.xiaos.cloud.db.entity.CompetitionQuestions;
import com.xiaos.cloud.db.entity.CompetitionStudentDetails;
import com.xiaos.cloud.db.mapper.*;
import com.xiaos.cloud.db.service.RemarkService;
import com.xiaos.cloud.db.util.remark.Remark;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;


@Service
public class RemarkServiceImpl implements RemarkService {

    @Autowired
    CompetitionQuestionsMapper competitionQuestionsMapper;

    @Autowired
    CompetitionStudentScoreMapper competitionStudentScoreMapper;
    @Autowired
    CompetitionStudentDetailsMapper competitionStudentDetailsMapper;
    @Autowired
    CompetitionMapper competitionMapper;

    private Logger logger = LoggerFactory.getLogger(RemarkServiceImpl.class);
    @Override
    @Transactional(rollbackFor = Exception.class)
    public RemarkReturnVo remarkQuestion(QuestionGetParam questionGetParam) {
//      获取当前考试类型
        Competition petition = competitionMapper.selectById(questionGetParam.getCompetitionId());
//      设置返回值
        RemarkReturnVo remarkReturnVo  = new RemarkReturnVo(questionGetParam.getCompetitionId(),questionGetParam.getStudentId(),questionGetParam.getQuestionId());
//      定义本体获得的分数
        double nowQuestionScore = 0;
//      定义插入数据量的做题记录
//      UserCompetitionDetails competitionStudentDetails = null;
//      查询是否有提交题目的记录,没有则新建

        CompetitionStudentDetails competitionStudentDetails = competitionStudentDetailsMapper.getDetailsByUserUuidAndCompetitionUuidAndQuestionUuid(questionGetParam.getStudentId(), questionGetParam.getCompetitionId(), questionGetParam.getQuestionId());
        if (competitionStudentDetails == null) {
            competitionStudentDetailsMapper.insert(new CompetitionStudentDetails(
                    questionGetParam.getStudentId(),
                    questionGetParam.getCompetitionId(),
                    questionGetParam.getQuestionId(),
                    0.0,
                    "",
                    0,
                    "",
                    DateUtil.now()));
             competitionStudentDetails = competitionStudentDetailsMapper.getDetailsByUserUuidAndCompetitionUuidAndQuestionUuid(questionGetParam.getStudentId(), questionGetParam.getCompetitionId(), questionGetParam.getQuestionId());
        }
        if (petition.getCompetitionType()==1) {
            if (competitionStudentDetails.getSubmitTimes()>=petition.getMaxSubmitTimes()) {
                return new RemarkReturnVo("超过提交限制次数");
            }
        }
//        减去上次做题分数
        competitionStudentScoreMapper.addScoreByStudentIdAndCompetitionId(questionGetParam.getStudentId(), questionGetParam.getCompetitionId(), -competitionStudentDetails.getThisScore());
//        先获取题目

        CompetitionQuestions questionSelectInSql = competitionQuestionsMapper.selectById(questionGetParam.getQuestionId());

        competitionStudentDetails.setTrueAnswer(questionSelectInSql.getAnswer());
        //        先判断是不是单选题
        if(questionSelectInSql.getType()==1||questionSelectInSql.getType()==2){
//            判断答案对不对?加分：不加

            if (questionGetParam.getStudentAnswer().equals(questionSelectInSql.getAnswer())) {
                nowQuestionScore = questionSelectInSql.getScore();
            } else if(questionSelectInSql.getType() == 2){
//                多选题对其中几个=>获得一半分数
                if(questionSelectInSql.getAnswer().contains(questionGetParam.getStudentAnswer()) ){
                     nowQuestionScore =questionSelectInSql.getScore()*0.5;
                }
            }
        }else {
            PostRemarksParam remarksParam = new PostRemarksParam(questionGetParam.getUsername(), questionGetParam.getPassword(), questionGetParam.getHosts());
//            设置shell检测数据
            remarksParam.setData(JSONArray.parseArray(questionSelectInSql.getAnswer(),PostQuestionList.class) );
//            执行shell检测
            RemarksAcceptParam remarksAcceptParam = Remark.remarkShell(remarksParam);
//            设置shell分数
            nowQuestionScore = questionSelectInSql.getScore();
//            设置学生做题日志的备份
            competitionStudentDetails.setShellRemark(remarksAcceptParam.getData().toString());
        }
//      设置日志中本题获取的分数
        competitionStudentDetails.setThisScore(nowQuestionScore);
//      设置学生当时的选项
        competitionStudentDetails.setSubmitAnswer(questionGetParam.getStudentAnswer());
        competitionStudentDetails.setSubmitTimes(competitionStudentDetails.getSubmitTimes()+1);
//      更新日志
        competitionStudentDetailsMapper.updateById(competitionStudentDetails);

//      更新当前学生的分数
        competitionStudentScoreMapper.addScoreByStudentIdAndCompetitionId(questionGetParam.getStudentId(), questionGetParam.getCompetitionId(), nowQuestionScore);
//      获取当前学生总分
        double getStudentScore = competitionStudentScoreMapper.getAllScoreByUserUuidAndCompetitionUuid(questionGetParam.getStudentId(), questionGetParam.getCompetitionId());
//        设置返回分数信息
        remarkReturnVo.setNowQuestionScore(nowQuestionScore);
        remarkReturnVo.setCompetitionAllScore(String.valueOf(getStudentScore));

        return remarkReturnVo;

    }
}
