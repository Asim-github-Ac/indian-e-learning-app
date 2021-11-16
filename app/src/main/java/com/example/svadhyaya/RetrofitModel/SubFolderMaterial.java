package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class SubFolderMaterial implements Serializable {
    @SerializedName("authkey")
    String authkey;
    @SerializedName("folder_id")
    String folderid;
    @SerializedName("status")
    public String status;
    @SerializedName("message")
    public String message;
    @SerializedName("data")
    public SubFolderdata data;

    public SubFolderMaterial(String authkey, String folderid) {
        this.authkey = authkey;
        this.folderid = folderid;
    }

    public String getAuthkey() {
        return authkey;
    }

    public void setAuthkey(String authkey) {
        this.authkey = authkey;
    }

    public String getFolderid() {
        return folderid;
    }

    public void setFolderid(String folderid) {
        this.folderid = folderid;
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

    public SubFolderdata getData() {
        return data;
    }

    public void setData(SubFolderdata data) {
        this.data = data;
    }
}
