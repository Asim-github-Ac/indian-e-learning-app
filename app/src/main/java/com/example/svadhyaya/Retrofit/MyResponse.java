package com.example.svadhyaya.Retrofit;

import com.google.gson.annotations.SerializedName;

public class MyResponse {
    @SerializedName("status")
    String status;
    @SerializedName("message")
    String message;
    @SerializedName("data")
    String data;
}
