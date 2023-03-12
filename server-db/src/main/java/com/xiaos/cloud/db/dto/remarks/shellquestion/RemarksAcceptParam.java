package com.xiaos.cloud.db.dto.remarks.shellquestion;

import java.util.List;

public class RemarksAcceptParam {

    private  int state;
    private double score;
    private List<ResultsList> data;


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public List<ResultsList> getData() {
        return data;
    }

    public void setData(List<ResultsList> data) {
        this.data = data;
    }

    public RemarksAcceptParam() {
    }

    public RemarksAcceptParam(int state, double score, List<ResultsList> data) {
        this.state = state;
        this.score = score;
        this.data = data;
    }

    @Override
    public String toString() {
        return "RemarksAcceptParam{" +
                "state=" + state +
                ", score=" + score +
                ", data=" + data +
                '}';
    }
}
