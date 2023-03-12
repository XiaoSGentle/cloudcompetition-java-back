package com.xiaos.cloud.db.dto.remarks.shellquestion;


/**
 * 向评分系统发送的题目列表
 * 是PostRemarksParam.class 子项
 */
public   class PostQuestionList {

    private String id;
    private String shell;
    private String answer;
    private int score;


    public String getId() {
        return id;
    }

    public String getShell() {
        return shell;
    }

    public String getAnswer() {
        return answer;
    }

    public int getScore() {
        return score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setShell(String shell) {
        this.shell = shell;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public PostQuestionList() {
    }

    public PostQuestionList(String id, String shell, String answer, int score) {

        this.id = id;
        this.shell = shell;
        this.answer = answer;
        this.score = score;
    }

    @Override
    public String toString() {
        return "PostQuestionList{" +
                "id='" + id + '\'' +
                ", shell='" + shell + '\'' +
                ", answer='" + answer + '\'' +
                ", score=" + score +
                '}';
    }
}
