package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetProfile {
    @SerializedName("authkey")
    String Authkey;
    @SerializedName("status")
    String status;
    @SerializedName("message")
    String message;
    @SerializedName("data")
    @Expose
    ProfileData profileData;

    public GetProfile(String authkey) {
        Authkey = authkey;
    }

    public String getAuthkey() {
        return Authkey;
    }

    public void setAuthkey(String authkey) {
        Authkey = authkey;
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

    public ProfileData getProfileData() {
        return profileData;
    }

    public void setProfileData(ProfileData profileData) {
        this.profileData = profileData;
    }

    public class ProfileData{
        public String first_name;
        public String last_name;
        public String middle_name;
        public String username;
        public String email_id;
        public String gender;
        public String profile_pic;
        public String birth_date;
        public String mobile_no;
        public String address;
        public String zip_code;
        public String city;
        public String city_name;
        public String state;
        public String state_name;
        public String country;
        public String parent_contact;
        public String parent_email_id;

        public ProfileData(String first_name, String last_name, String middle_name, String username, String email_id, String gender, String profile_pic, String birth_date, String mobile_no, String address, String zip_code, String city, String city_name, String state, String state_name, String country, String parent_contact, String parent_email_id) {
            this.first_name = first_name;
            this.last_name = last_name;
            this.middle_name = middle_name;
            this.username = username;
            this.email_id = email_id;
            this.gender = gender;
            this.profile_pic = profile_pic;
            this.birth_date = birth_date;
            this.mobile_no = mobile_no;
            this.address = address;
            this.zip_code = zip_code;
            this.city = city;
            this.city_name = city_name;
            this.state = state;
            this.state_name = state_name;
            this.country = country;
            this.parent_contact = parent_contact;
            this.parent_email_id = parent_email_id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getMiddle_name() {
            return middle_name;
        }

        public void setMiddle_name(String middle_name) {
            this.middle_name = middle_name;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getEmail_id() {
            return email_id;
        }

        public void setEmail_id(String email_id) {
            this.email_id = email_id;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getProfile_pic() {
            return profile_pic;
        }

        public void setProfile_pic(String profile_pic) {
            this.profile_pic = profile_pic;
        }

        public String getBirth_date() {
            return birth_date;
        }

        public void setBirth_date(String birth_date) {
            this.birth_date = birth_date;
        }

        public String getMobile_no() {
            return mobile_no;
        }

        public void setMobile_no(String mobile_no) {
            this.mobile_no = mobile_no;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getZip_code() {
            return zip_code;
        }

        public void setZip_code(String zip_code) {
            this.zip_code = zip_code;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getState_name() {
            return state_name;
        }

        public void setState_name(String state_name) {
            this.state_name = state_name;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getParent_contact() {
            return parent_contact;
        }

        public void setParent_contact(String parent_contact) {
            this.parent_contact = parent_contact;
        }

        public String getParent_email_id() {
            return parent_email_id;
        }

        public void setParent_email_id(String parent_email_id) {
            this.parent_email_id = parent_email_id;
        }
    }
}
