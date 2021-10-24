package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class StartTestData implements Serializable {
    @SerializedName("test_given_id")
    String testgivenId;
    @SerializedName("remaining_time")
    String remainingtime;
    @SerializedName("question")
    List<QuestionList> questionListList=null;
    @SerializedName("total_attempted")
    public String total_attempted;
    @SerializedName("total_marked")
    public String total_marked;
    @SerializedName("examDetails")
    public ExamDetails examDetails;
    @SerializedName("total_question")
    public int total_question;

    public StartTestData(String testgivenId, String remainingtime, List<QuestionList> questionListList, String total_attempted, String total_marked, ExamDetails examDetails, int total_question) {
        this.testgivenId = testgivenId;
        this.remainingtime = remainingtime;
        this.questionListList = questionListList;
        this.total_attempted = total_attempted;
        this.total_marked = total_marked;
        this.examDetails = examDetails;
        this.total_question = total_question;
    }

    public String getTestgivenId() {
        return testgivenId;
    }

    public void setTestgivenId(String testgivenId) {
        this.testgivenId = testgivenId;
    }

    public String getRemainingtime() {
        return remainingtime;
    }

    public void setRemainingtime(String remainingtime) {
        this.remainingtime = remainingtime;
    }

    public List<QuestionList> getQuestionListList() {
        return questionListList;
    }

    public void setQuestionListList(List<QuestionList> questionListList) {
        this.questionListList = questionListList;
    }

    public String getTotal_attempted() {
        return total_attempted;
    }

    public void setTotal_attempted(String total_attempted) {
        this.total_attempted = total_attempted;
    }

    public String getTotal_marked() {
        return total_marked;
    }

    public void setTotal_marked(String total_marked) {
        this.total_marked = total_marked;
    }

    public ExamDetails getExamDetails() {
        return examDetails;
    }

    public void setExamDetails(ExamDetails examDetails) {
        this.examDetails = examDetails;
    }

    public int getTotal_question() {
        return total_question;
    }

    public void setTotal_question(int total_question) {
        this.total_question = total_question;
    }
}
