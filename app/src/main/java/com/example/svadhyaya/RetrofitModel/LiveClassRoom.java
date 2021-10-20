package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

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

    public class LiveClass2{

        @SerializedName("data")
        @Expose
        List<LiveClassList> liveClassLists= null;
        public  LiveClass2(){}

        public List<LiveClassList> getLiveClassLists() {
            return liveClassLists;
        }

        public void setLiveClassLists(List<LiveClassList> liveClassLists) {
            this.liveClassLists = liveClassLists;
        }
        public class LiveClassList{

            public LiveClassList(){}
        }
    }
}
