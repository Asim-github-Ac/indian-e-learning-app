package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PakagesDetails {
    @SerializedName("authkey")
    String authkey;
    @SerializedName("status")
    String Status;
    @SerializedName("message")
    String message;
    @SerializedName("data")
    @Expose
    private MorePakData user;
    @SerializedName("pkData")
    @Expose
    private PackageData packdata;

    public PakagesDetails(String authkey) {
        this.authkey = authkey;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MorePakData getUser() {
        return user;
    }

    public void setUser(MorePakData user) {
        this.user = user;
    }

    public String getAuthkey() {
        return authkey;
    }

    public void setAuthkey(String authkey) {
        this.authkey = authkey;
    }

    public PackageData getPackdata() {
        return packdata;
    }

    public void setPackdata(PackageData packdata) {
        this.packdata = packdata;
    }
}
