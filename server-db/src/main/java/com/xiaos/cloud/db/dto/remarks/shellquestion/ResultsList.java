package com.xiaos.cloud.db.dto.remarks.shellquestion;


/**
 *
 *  * 评分系统接收返回值中得分详情的的参数
 *  * 是RemarksAcceptParam.class 子项
 */
public class ResultsList {
    String id;

    double score;
    String content;

    public ResultsList(String id, double score, String content) {
        this.id = id;
        this.score = score;
        this.content = content;
    }

    public ResultsList() {
    }

    public String getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public String getContent() {
        return content;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ResultsList{" +
                "id='" + id + '\'' +
                ", score=" + score +
                ", content='" + content + '\'' +
                '}';
    }
}
