package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PakagesDetails {
    @SerializedName("authkey")
    String authkey;
    @SerializedName("status")
    String Status;
    @SerializedName("message")
    String message;
    @SerializedName("data")
    @Expose
    private MorePakData morePakData;

    public PakagesDetails(String authkey) {
        this.authkey = authkey;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MorePakData getMorePakData() {
        return morePakData;
    }

    public void setMorePakData(MorePakData morePakData) {
        this.morePakData = morePakData;
    }

    public String getAuthkey() {
        return authkey;
    }

    public void setAuthkey(String authkey) {
        this.authkey = authkey;
    }
public class  MorePakData{
    @SerializedName("authkey")
    String authkey;
    @SerializedName("data")
    @Expose
    private PackMoreDetails packMoreDetails;

    public MorePakData(){
    }

    public String getAuthkey() {
        return authkey;
    }

    public void setAuthkey(String authkey) {
        this.authkey = authkey;
    }

    public PackMoreDetails getPackMoreDetails() {
        return packMoreDetails;
    }

    public void setPackMoreDetails(PackMoreDetails packMoreDetails) {
        this.packMoreDetails = packMoreDetails;
    }

    public class PackMoreDetails{
        String student_id,institute_id,center,parent_name,phone_no,first_name,last_name,middle_name,username,email_id,password,gender,profile_pic,birth_date,reg_date,mobile_no,address,zip_code,city,state,country,doubt,parent_contact,parent_email_id,other_info,status,profile_updated_status,expiry_date,is_demo,entry_on,entry_by,modified_on,modified_by;
        @SerializedName("pkData")
        @Expose
        private PackageData packdata;

        public PackMoreDetails(){

        }
        public PackMoreDetails(String student_id, String institute_id, String center, String parent_name, String phone_no, String first_name, String last_name, String middle_name, String username, String email_id, String password, String gender, String profile_pic, String birth_date, String reg_date, String mobile_no, String address, String zip_code, String city, String state, String country, String doubt, String parent_contact, String parent_email_id, String other_info, String status, String profile_updated_status, String expiry_date, String is_demo, String entry_on, String entry_by, String modified_on, String modified_by) {
            this.student_id = student_id;
            this.institute_id = institute_id;
            this.center = center;
            this.parent_name = parent_name;
            this.phone_no = phone_no;
            this.first_name = first_name;
            this.last_name = last_name;
            this.middle_name = middle_name;
            this.username = username;
            this.email_id = email_id;
            this.password = password;
            this.gender = gender;
            this.profile_pic = profile_pic;
            this.birth_date = birth_date;
            this.reg_date = reg_date;
            this.mobile_no = mobile_no;
            this.address = address;
            this.zip_code = zip_code;
            this.city = city;
            this.state = state;
            this.country = country;
            this.doubt = doubt;
            this.parent_contact = parent_contact;
            this.parent_email_id = parent_email_id;
            this.other_info = other_info;
            this.status = status;
            this.profile_updated_status = profile_updated_status;
            this.expiry_date = expiry_date;
            this.is_demo = is_demo;
            this.entry_on = entry_on;
            this.entry_by = entry_by;
            this.modified_on = modified_on;
            this.modified_by = modified_by;
        }

        public String getStudent_id() {
            return student_id;
        }

        public void setStudent_id(String student_id) {
            this.student_id = student_id;
        }

        public String getInstitute_id() {
            return institute_id;
        }

        public void setInstitute_id(String institute_id) {
            this.institute_id = institute_id;
        }

        public String getCenter() {
            return center;
        }

        public void setCenter(String center) {
            this.center = center;
        }

        public String getParent_name() {
            return parent_name;
        }

        public void setParent_name(String parent_name) {
            this.parent_name = parent_name;
        }

        public String getPhone_no() {
            return phone_no;
        }

        public void setPhone_no(String phone_no) {
            this.phone_no = phone_no;
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

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
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

        public String getReg_date() {
            return reg_date;
        }

        public void setReg_date(String reg_date) {
            this.reg_date = reg_date;
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

        public String getDoubt() {
            return doubt;
        }

        public void setDoubt(String doubt) {
            this.doubt = doubt;
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

        public String getOther_info() {
            return other_info;
        }

        public void setOther_info(String other_info) {
            this.other_info = other_info;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getProfile_updated_status() {
            return profile_updated_status;
        }

        public void setProfile_updated_status(String profile_updated_status) {
            this.profile_updated_status = profile_updated_status;
        }

        public String getExpiry_date() {
            return expiry_date;
        }

        public void setExpiry_date(String expiry_date) {
            this.expiry_date = expiry_date;
        }

        public String getIs_demo() {
            return is_demo;
        }

        public void setIs_demo(String is_demo) {
            this.is_demo = is_demo;
        }

        public String getEntry_on() {
            return entry_on;
        }

        public void setEntry_on(String entry_on) {
            this.entry_on = entry_on;
        }

        public String getEntry_by() {
            return entry_by;
        }

        public void setEntry_by(String entry_by) {
            this.entry_by = entry_by;
        }

        public String getModified_on() {
            return modified_on;
        }

        public void setModified_on(String modified_on) {
            this.modified_on = modified_on;
        }

        public String getModified_by() {
            return modified_by;
        }

        public void setModified_by(String modified_by) {
            this.modified_by = modified_by;
        }

        public PackageData getPackdata() {
            return packdata;
        }

        public void setPackdata(PackageData packdata) {
            this.packdata = packdata;
        }
        public class PackageData{

            String student_package_id,student_id,package_id,division_id,coupon_id,sold_date,expiry_date,package_cost,payment_mode,reference_no,issuing_bank,transaction_date,discount,net_payable,comment,status,sold_by,entry_on,entry_by,modified_on,modified_by,institute_id,package_name,description,expirydate;

            public PackageData(){
            }

            public PackageData(String student_package_id, String student_id, String package_id, String division_id, String coupon_id, String sold_date, String expiry_date, String package_cost, String payment_mode, String reference_no, String issuing_bank, String transaction_date, String discount, String net_payable, String comment, String status, String sold_by, String entry_on, String entry_by, String modified_on, String modified_by, String institute_id, String package_name, String description, String expirydate) {
                this.student_package_id = student_package_id;
                this.student_id = student_id;
                this.package_id = package_id;
                this.division_id = division_id;
                this.coupon_id = coupon_id;
                this.sold_date = sold_date;
                this.expiry_date = expiry_date;
                this.package_cost = package_cost;
                this.payment_mode = payment_mode;
                this.reference_no = reference_no;
                this.issuing_bank = issuing_bank;
                this.transaction_date = transaction_date;
                this.discount = discount;
                this.net_payable = net_payable;
                this.comment = comment;
                this.status = status;
                this.sold_by = sold_by;
                this.entry_on = entry_on;
                this.entry_by = entry_by;
                this.modified_on = modified_on;
                this.modified_by = modified_by;
                this.institute_id = institute_id;
                this.package_name = package_name;
                this.description = description;
                this.expirydate = expirydate;
            }

            public String getStudent_package_id() {
                return student_package_id;
            }

            public void setStudent_package_id(String student_package_id) {
                this.student_package_id = student_package_id;
            }

            public String getStudent_id() {
                return student_id;
            }

            public void setStudent_id(String student_id) {
                this.student_id = student_id;
            }

            public String getPackage_id() {
                return package_id;
            }

            public void setPackage_id(String package_id) {
                this.package_id = package_id;
            }

            public String getDivision_id() {
                return division_id;
            }

            public void setDivision_id(String division_id) {
                this.division_id = division_id;
            }

            public String getCoupon_id() {
                return coupon_id;
            }

            public void setCoupon_id(String coupon_id) {
                this.coupon_id = coupon_id;
            }

            public String getSold_date() {
                return sold_date;
            }

            public void setSold_date(String sold_date) {
                this.sold_date = sold_date;
            }

            public String getExpiry_date() {
                return expiry_date;
            }

            public void setExpiry_date(String expiry_date) {
                this.expiry_date = expiry_date;
            }

            public String getPackage_cost() {
                return package_cost;
            }

            public void setPackage_cost(String package_cost) {
                this.package_cost = package_cost;
            }

            public String getPayment_mode() {
                return payment_mode;
            }

            public void setPayment_mode(String payment_mode) {
                this.payment_mode = payment_mode;
            }

            public String getReference_no() {
                return reference_no;
            }

            public void setReference_no(String reference_no) {
                this.reference_no = reference_no;
            }

            public String getIssuing_bank() {
                return issuing_bank;
            }

            public void setIssuing_bank(String issuing_bank) {
                this.issuing_bank = issuing_bank;
            }

            public String getTransaction_date() {
                return transaction_date;
            }

            public void setTransaction_date(String transaction_date) {
                this.transaction_date = transaction_date;
            }

            public String getDiscount() {
                return discount;
            }

            public void setDiscount(String discount) {
                this.discount = discount;
            }

            public String getNet_payable() {
                return net_payable;
            }

            public void setNet_payable(String net_payable) {
                this.net_payable = net_payable;
            }

            public String getComment() {
                return comment;
            }

            public void setComment(String comment) {
                this.comment = comment;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getSold_by() {
                return sold_by;
            }

            public void setSold_by(String sold_by) {
                this.sold_by = sold_by;
            }

            public String getEntry_on() {
                return entry_on;
            }

            public void setEntry_on(String entry_on) {
                this.entry_on = entry_on;
            }

            public String getEntry_by() {
                return entry_by;
            }

            public void setEntry_by(String entry_by) {
                this.entry_by = entry_by;
            }

            public String getModified_on() {
                return modified_on;
            }

            public void setModified_on(String modified_on) {
                this.modified_on = modified_on;
            }

            public String getModified_by() {
                return modified_by;
            }

            public void setModified_by(String modified_by) {
                this.modified_by = modified_by;
            }

            public String getInstitute_id() {
                return institute_id;
            }

            public void setInstitute_id(String institute_id) {
                this.institute_id = institute_id;
            }

            public String getPackage_name() {
                return package_name;
            }

            public void setPackage_name(String package_name) {
                this.package_name = package_name;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getExpirydate() {
                return expirydate;
            }

            public void setExpirydate(String expirydate) {
                this.expirydate = expirydate;
            }
        }
            }
    }
}
