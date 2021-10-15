package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class News {
    String status,message;
    @SerializedName("data")
    @Expose
    List<NewsDetails> newsDetails=null;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<NewsDetails> getNewsDetails() {
        return newsDetails;
    }

    public void setNewsDetails(List<NewsDetails> newsDetails) {
        this.newsDetails = newsDetails;
    }
}
