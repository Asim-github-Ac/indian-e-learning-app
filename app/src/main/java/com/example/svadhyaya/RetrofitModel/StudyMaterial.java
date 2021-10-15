package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class StudyMaterial {
    String status,message;
    @SerializedName("data")
    @Expose
    List<StudyMaterialDetails> studyMaterialDetails=null;

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

    public List<StudyMaterialDetails> getStudyMaterialDetails() {
        return studyMaterialDetails;
    }

    public void setStudyMaterialDetails(List<StudyMaterialDetails> studyMaterialDetails) {
        this.studyMaterialDetails = studyMaterialDetails;
    }
}
