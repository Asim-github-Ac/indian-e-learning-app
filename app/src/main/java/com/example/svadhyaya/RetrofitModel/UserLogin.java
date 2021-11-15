package com.example.svadhyaya.RetrofitModel;

import android.service.autofill.UserData;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserLogin {
    @SerializedName("username")
    String username;
    @SerializedName("password")
    String password;
    @SerializedName("device_id")
    String deviceid;
    @SerializedName("status")
    String status;
    @SerializedName("message")
    String message;
    @SerializedName("data")
    @Expose
    private UserDetails user;
    public UserLogin(String username, String password, String deviceid) {
        this.username = username;
        this.password = password;
        this.deviceid = deviceid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
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

    public UserDetails getUser() {
        return user;
    }


}
