package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.SerializedName;

public class ContactUs {

    String name,email,mobile_no,course,message;
    //response
    String status;
    @SerializedName("message")
    String ReplyMessage;

    public ContactUs(String name, String email, String mobile_no, String course, String message) {
        this.name = name;
        this.email = email;
        this.mobile_no = mobile_no;
        this.course = course;
        this.message = message;
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
}
