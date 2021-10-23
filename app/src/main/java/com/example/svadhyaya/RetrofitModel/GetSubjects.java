package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class GetSubjects implements Serializable {
    String authkey;
    String status;
    String  message;
    @SerializedName("data")
    List<YourSubjects> yourSubjectsList=null;

    public GetSubjects(String authkey) {
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

    public List<YourSubjects> getYourSubjectsList() {
        return yourSubjectsList;
    }

    public void setYourSubjectsList(List<YourSubjects> yourSubjectsList) {
        this.yourSubjectsList = yourSubjectsList;
    }

    public class YourSubjects{
        String subject_id;
        String subject_name;

        public YourSubjects(String subject_id, String subject_name) {
            this.subject_id = subject_id;
            this.subject_name = subject_name;
        }

        public String getSubject_id() {
            return subject_id;
        }

        public void setSubject_id(String subject_id) {
            this.subject_id = subject_id;
        }

        public String getSubject_name() {
            return subject_name;
        }

        public void setSubject_name(String subject_name) {
            this.subject_name = subject_name;
        }
    }
}
