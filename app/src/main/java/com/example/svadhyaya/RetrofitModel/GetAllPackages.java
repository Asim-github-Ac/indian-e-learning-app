package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetAllPackages {

    @SerializedName("institute_id")
    String institute_id;
    @SerializedName("status")
    String status;
    @SerializedName("message")
    String message;
    @SerializedName("data")
    @Expose
    List<PackageParts> list = null;

    public GetAllPackages(String institute_id) {
        this.institute_id = institute_id;
    }

    public String getInstitute_id() {
        return institute_id;
    }

    public void setInstitute_id(String institute_id) {
        this.institute_id = institute_id;
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

    public List<PackageParts> getList() {
        return list;
    }

    public void setList(List<PackageParts> list) {
        this.list = list;
    }
}
