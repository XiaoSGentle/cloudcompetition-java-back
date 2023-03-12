package com.xiaos.cloud.db.service;

import com.xiaos.cloud.db.dto.remarks.QuestionGetParam;
import com.xiaos.cloud.db.dto.remarks.RemarkReturnVo;
import com.xiaos.cloud.db.dto.remarks.shellquestion.PostRemarksParam;

public interface RemarkService {
    RemarkReturnVo remarkQuestion(QuestionGetParam questionGetParam);
}
