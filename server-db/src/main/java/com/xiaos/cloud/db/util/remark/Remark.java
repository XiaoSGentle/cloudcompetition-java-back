package com.xiaos.cloud.db.util.remark;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import cn.hutool.setting.Setting;
import com.xiaos.cloud.db.dto.remarks.shellquestion.PostRemarksParam;
import com.xiaos.cloud.db.dto.remarks.shellquestion.RemarksAcceptParam;
import org.junit.Test;

public class Remark {
    static Setting setting = new Setting( System.getProperty("user.dir")+"/config.setting");
    /**
     *
     * @param param
     * @return
     */

    public static RemarksAcceptParam remarkShell(PostRemarksParam param){
        String  url = setting.getStr("QUESTION_SHELL_POST_PATH");
        String body = HttpRequest.post(url).body(JSONUtil.toJsonStr(param)).execute().body();
        return JSONUtil.toBean(body, RemarksAcceptParam.class);
    }

    public static boolean createStackFlowUser(){

        return true;
    }
}
