package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.SerializedName;

public class RegisterModel {
    @SerializedName("first_name")
    public String fname;
    @SerializedName("middle_name")
    public String midlename;
    @SerializedName("last_name")
    public String lastname;
    @SerializedName("email")
    public String email;
    @SerializedName("password")
    public String password;
    @SerializedName("gender")
    public String gender;
    @SerializedName("birth_date")
    public String birthday;
    @SerializedName("mobile_no")
    public String mobnumber;
    @SerializedName("address")
    public String address;
    @SerializedName("city")
    public String city;
    @SerializedName("state")
    public String state;
    @SerializedName("country")
    public String country;
    @SerializedName("parent_contact")
    public String pcon;
    @SerializedName("parent_email_id")
    public String pemail;
    @SerializedName("status")
    public String ResponseCode;
    @SerializedName("message")
    public String ResponseMessage;


    public RegisterModel(String fname, String midlename, String lastname, String email, String password, String gender, String birthday, String mobnumber, String address, String city, String state, String country, String pcon, String pemail) {
        this.fname = fname;
        this.midlename = midlename;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.birthday = birthday;
        this.mobnumber = mobnumber;
        this.address = address;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pcon = pcon;
        this.pemail = pemail;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMidlename() {
        return midlename;
    }

    public void setMidlename(String midlename) {
        this.midlename = midlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMobnumber() {
        return mobnumber;
    }

    public void setMobnumber(String mobnumber) {
        this.mobnumber = mobnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPcon() {
        return pcon;
    }

    public void setPcon(String pcon) {
        this.pcon = pcon;
    }

    public String getPemail() {
        return pemail;
    }

    public void setPemail(String pemail) {
        this.pemail = pemail;
    }

    public String getResponseCode() {
        return ResponseCode;
    }

    public void setResponseCode(String responseCode) {
        ResponseCode = responseCode;
    }

    public String getResponseMessage() {
        return ResponseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        ResponseMessage = responseMessage;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

