package com.xiaos.cloud.db.mapper;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.xiaos.cloud.db.entity.CompetitionStudentScore;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 * 当场竞赛得分 Mapper 接口
 * </p>
 *
 * @author xiaos
 * @since 2023-02-20
 */
public interface CompetitionStudentScoreMapper extends BaseMapper<CompetitionStudentScore> {
// competitionStudentScoreMapper.addScoreByStudentId(questionGetParam.getStudentId(), questionGetParam.getCompetitionId(), -userCompetitionDetails.getGetScore());


    @Select("UPDATE competition_student_score set student_score = student_score + #{score} where user_uuid = #{student_uuid} AND competition_uuid = #{competition_uuid}")
    void addScoreByStudentIdAndCompetitionId(@PathVariable("student_uuid") String student_uuid,
                            @PathVariable("competition_uuid") String competition_uuid,
                            @PathVariable("score") double score);


    @Select("SELECT competition_student_score.student_score from competition_student_score where user_uuid = #{student_uuid} and competition_uuid = #{competition_uuid}")
    double getAllScoreByUserUuidAndCompetitionUuid(@PathVariable("student_uuid") String student_uuid,
                                                   @PathVariable("competition_uuid") String competition_uuid);
}
