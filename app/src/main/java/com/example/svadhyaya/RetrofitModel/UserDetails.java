package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.SerializedName;

public class UserDetails {
    @SerializedName("authkey")
    String authkey;
    @SerializedName("name")
    String name;
    @SerializedName("email_id")
    String emaild;
    @SerializedName("profile_pic")
    String profileUrl;
    @SerializedName("is_demo")
    String demo;
    @SerializedName("status")
    String status;
    @SerializedName("profile_updated_status")
    String profilestatus;



    public   UserDetails(){

    }
    public UserDetails(String authkey, String name, String emaild, String profileUrl, String demo, String status, String profilestatus) {
        this.authkey = authkey;
        this.name = name;
        this.emaild = emaild;
        this.profileUrl = profileUrl;
        this.demo = demo;
        this.status = status;
        this.profilestatus = profilestatus;
    }

    public String getAuthkey() {
        return authkey;
    }

    public void setAuthkey(String authkey) {
        this.authkey = authkey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmaild() {
        return emaild;
    }

    public void setEmaild(String emaild) {
        this.emaild = emaild;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getDemo() {
        return demo;
    }

    public void setDemo(String demo) {
        this.demo = demo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProfilestatus() {
        return profilestatus;
    }

    public void setProfilestatus(String profilestatus) {
        this.profilestatus = profilestatus;
    }
}
