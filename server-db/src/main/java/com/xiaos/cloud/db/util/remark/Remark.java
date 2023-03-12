package com.xiaos.cloud.db.util.remark;

import cn.hutool.http.HttpRequest;
import cn.hutool.json.JSONUtil;
import cn.hutool.setting.Setting;
import com.xiaos.cloud.db.dto.remarks.shellquestion.PostRemarksParam;
import com.xiaos.cloud.db.dto.remarks.shellquestion.RemarksAcceptParam;
import org.junit.Test;

public class Remark {

    public static RemarksAcceptParam remarkShell(PostRemarksParam param){
        Setting setting = new Setting( System.getProperty("user.dir")+"/config.setting");
        String  url = setting.getStr("QUESTION_SHELL_POST_PATH");
//        param.setData(param.getData().replace("'[","[").replace("]'","]"));
                System.out.println("发送的json字符串为"+JSONUtil.toJsonStr(param));
        String body = HttpRequest.post(url).body(JSONUtil.toJsonStr(param)).execute().body();
//        System.out.println(body);
        return JSONUtil.toBean(body, RemarksAcceptParam.class);
    }


    @Test
    public void test(){
        Setting setting = new Setting( System.getProperty("user.dir")+"/config.setting");
        String  url = setting.getStr("QUESTION_SHELL_POST_PATH");
        System.out.println(url);
    }
}
