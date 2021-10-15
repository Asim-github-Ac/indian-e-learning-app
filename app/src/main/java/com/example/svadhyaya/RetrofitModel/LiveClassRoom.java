package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LiveClassRoom {
    String authkey,status,message;
    @SerializedName("data")
    @Expose
    private LiveClass2 liveClass2;

    public LiveClassRoom(String authkey) {
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

    public LiveClass2 getLiveClass2() {
        return liveClass2;
    }

    public void setLiveClass2(LiveClass2 liveClass2) {
        this.liveClass2 = liveClass2;
    }
}
