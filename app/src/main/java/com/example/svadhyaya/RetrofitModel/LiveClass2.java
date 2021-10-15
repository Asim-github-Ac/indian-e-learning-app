package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LiveClass2 {

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
}
