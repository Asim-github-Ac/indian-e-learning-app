package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MorePakData {

    @SerializedName("authkey")
    String authkey;
    @SerializedName("data")
    @Expose
    private PackMoreDetails packMoreDetails;
    public MorePakData(){
    }

    public String getAuthkey() {
        return authkey;
    }

    public void setAuthkey(String authkey) {
        this.authkey = authkey;
    }

    public PackMoreDetails getPackMoreDetails() {
        return packMoreDetails;
    }

    public void setPackMoreDetails(PackMoreDetails packMoreDetails) {
        this.packMoreDetails = packMoreDetails;
    }
}
