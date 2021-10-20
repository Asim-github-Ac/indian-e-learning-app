package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class GetAllPackages implements Serializable {

    @SerializedName("institute_id")
    String institute_id;
    @SerializedName("status")
    String status;
    @SerializedName("message")
    String message;
    @SerializedName("data")
    @Expose
    List<PackageParts> allpageslist = null;

    public GetAllPackages() {
    }

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

    public List<PackageParts> getAllpageslist() {
        return allpageslist;
    }

    public void setAllpageslist(List<PackageParts> allpageslist) {
        this.allpageslist = allpageslist;
    }

}
