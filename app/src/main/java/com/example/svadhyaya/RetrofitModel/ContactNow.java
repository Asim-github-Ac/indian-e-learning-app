package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContactNow {

    @SerializedName("name")
    @Expose
    String name;
    @SerializedName("email")
    @Expose
    String email;
    @SerializedName("mobile_no")
    @Expose
    String mobile_no;
    @SerializedName("course")
    @Expose
    String course;
    @SerializedName("message")
    @Expose
    String message;
    //response
    @SerializedName("status")
    @Expose
    String status;
    @SerializedName("message")
    @Expose
    String ReplyMessage;

    public ContactNow(String name, String email, String mobile_no, String course, String message) {
        this.name = name;
        this.email = email;
        this.mobile_no = mobile_no;
        this.course = course;
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReplyMessage() {
        return ReplyMessage;
    }

    public void setReplyMessage(String replyMessage) {
        ReplyMessage = replyMessage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
