package com.xiaos.cloud.db.dto.remarks.shellquestion;

import java.util.List;

public class PostRemarksParam {
    private String username;
    private String password;
    private String hosts;
    private  List<PostQuestionList> data;

    public PostRemarksParam() {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHosts() {
        return hosts;
    }

    public void setHosts(String hosts) {
        this.hosts = hosts;
    }


    public  List<PostQuestionList> getData() {
        return data;
    }

    public void setData( List<PostQuestionList> data) {
        this.data = data;
    }


    public PostRemarksParam(String username, String password, String hosts, List<PostQuestionList> data) {
        this.username = username;
        this.password = password;
        this.hosts = hosts;
        this.data = data;
    }

    public PostRemarksParam(String username, String password, String hosts) {
        this.username = username;
        this.password = password;
        this.hosts = hosts;
    }

    @Override
    public String toString() {
        return "PostRemarksParam{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", hosts='" + hosts + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}