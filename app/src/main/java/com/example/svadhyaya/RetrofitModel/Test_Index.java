package com.example.svadhyaya.RetrofitModel;
import com.google.gson.annotations.SerializedName;
import java.util.List;
public class Test_Index {
    @SerializedName("authkey")
    String authkey;
    @SerializedName("status")
    String status;
    @SerializedName("message")
    String message;
    @SerializedName("data")
    public DataTest data;

    public Test_Index(String authkey) {
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

    public DataTest getData() {
        return data;
    }

    public void setData(DataTest data) {
        this.data = data;
    }

    public class DataTest{
        @SerializedName("student_package")
        public StudentPackage student_package;
        @SerializedName("exams")
        public List<Exam> exams;

        public DataTest(StudentPackage student_package, List<Exam> exams) {
            this.student_package = student_package;
            this.exams = exams;
        }

        public StudentPackage getStudent_package() {
            return student_package;
        }

        public void setStudent_package(StudentPackage student_package) {
            this.student_package = student_package;
        }

        public List<Exam> getExams() {
            return exams;
        }

        public void setExams(List<Exam> exams) {
            this.exams = exams;
        }
    }
    public class Exam{
        public String subject_id;
        public String subject_name;
        public String srno;
        public List<Object> exams;

        public Exam(String subject_id, String subject_name, String srno, List<Object> exams) {
            this.subject_id = subject_id;
            this.subject_name = subject_name;
            this.srno = srno;
            this.exams = exams;
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

        public String getSrno() {
            return srno;
        }

        public void setSrno(String srno) {
            this.srno = srno;
        }

        public List<Object> getExams() {
            return exams;
        }

        public void setExams(List<Object> exams) {
            this.exams = exams;
        }
    }

    public class StudentPackage{
        public String student_package_id;
        public String student_id;
        public String package_id;
        public String division_id;
        public String coupon_id;
        public String sold_date;
        public String expiry_date;
        public String package_cost;
        public String payment_mode;
        public String reference_no;
        public String issuing_bank;
        public String transaction_date;
        public String discount;
        public String net_payable;
        public Object comment;
        public String status;
        public Object sold_by;
        public String entry_on;
        public Object entry_by;
        public Object modified_on;
        public Object modified_by;

        public StudentPackage(String student_package_id, String student_id, String package_id, String division_id, String coupon_id, String sold_date, String expiry_date, String package_cost, String payment_mode, String reference_no, String issuing_bank, String transaction_date, String discount, String net_payable, Object comment, String status, Object sold_by, String entry_on, Object entry_by, Object modified_on, Object modified_by) {
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

        public Object getComment() {
            return comment;
        }

        public void setComment(Object comment) {
            this.comment = comment;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Object getSold_by() {
            return sold_by;
        }

        public void setSold_by(Object sold_by) {
            this.sold_by = sold_by;
        }

        public String getEntry_on() {
            return entry_on;
        }

        public void setEntry_on(String entry_on) {
            this.entry_on = entry_on;
        }

        public Object getEntry_by() {
            return entry_by;
        }

        public void setEntry_by(Object entry_by) {
            this.entry_by = entry_by;
        }

        public Object getModified_on() {
            return modified_on;
        }

        public void setModified_on(Object modified_on) {
            this.modified_on = modified_on;
        }

        public Object getModified_by() {
            return modified_by;
        }

        public void setModified_by(Object modified_by) {
            this.modified_by = modified_by;
        }
    }
}
