package com.xiaos.cloud.db.mapper;

import com.xiaos.cloud.db.entity.CompetitionStudentDetails;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * <p>
 * 学生做题记录 Mapper 接口
 * </p>
 *
 * @author xiaos
 * @since 2023-02-20
 */
public interface CompetitionStudentDetailsMapper extends BaseMapper<CompetitionStudentDetails> {


    @Select("SELECT * from competition_student_details where student_uuid = #{user_uuid} and competition_uuid = #{competition_uuid} and question_uuid = #{question_uuid}")
    CompetitionStudentDetails getDetailsByUserUuidAndCompetitionUuidAndQuestionUuid(@PathVariable("user_uuid") String user_uuid,
                                                                                    @PathVariable("competition_uuid") String competition_uuid,
                                                                                    @PathVariable("question_uuid") String question_uuid);
}
