package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Start_test implements Serializable {
    @SerializedName("authkey")
    String authkey;
    @SerializedName("test_id")
    String testid;
    @SerializedName("status")
    String status;
    @SerializedName("message")
    String message;
    @SerializedName("data")
    StartTestData  starttestdata;

    public Start_test(String authkey, String testid) {
        this.authkey = authkey;
        this.testid = testid;
    }

    public String getAuthkey() {
        return authkey;
    }

    public void setAuthkey(String authkey) {
        this.authkey = authkey;
    }

    public String getTestid() {
        return testid;
    }

    public void setTestid(String testid) {
        this.testid = testid;
    }

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

    public StartTestData getStarttestdata() {
        return starttestdata;
    }

    public void setStarttestdata(StartTestData starttestdata) {
        this.starttestdata = starttestdata;
    }
}
