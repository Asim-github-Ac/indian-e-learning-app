package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class City {
    String status,message;
    @SerializedName("data")
    @Expose
    List<AllCity> studyMaterialDetails=null;
}
