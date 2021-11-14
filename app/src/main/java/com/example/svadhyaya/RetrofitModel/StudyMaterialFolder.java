package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class StudyMaterialFolder implements Serializable {
    @SerializedName("authkey")
    String authkey;
    @SerializedName("status")
    public String status;
    @SerializedName("message")
    public String message;
    @SerializedName("data")
    public List<StudyFolderList> data;

    public StudyMaterialFolder(String authkey) {
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

    public List<StudyFolderList> getData() {
        return data;
    }

    public void setData(List<StudyFolderList> data) {
        this.data = data;
    }
}
