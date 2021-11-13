package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class DashBoard implements Serializable {
    @SerializedName("authkey")
    String authkey;
    @SerializedName("status")
    public String status;
    @SerializedName("message")
    public String message;
    @SerializedName("data")
    public DashData DashBoardData;

    public DashBoard(String authkey) {
        this.authkey = authkey;
    }

    public String getAuthkey() {
        return authkey;
    }

    public void setAuthkey(String authkey) {
        this.authkey = authkey;
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

    public DashData getDashBoardData() {
        return DashBoardData;
    }

    public void setDashBoardData(DashData dashBoardData) {
        DashBoardData = dashBoardData;
    }
}
