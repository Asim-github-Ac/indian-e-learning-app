package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class AddPackege implements Serializable {
    @SerializedName("student_id")
    String studentid;
    @SerializedName("package_id")
    String packageid;
    @SerializedName("division_id")
    String devisionid;
    @SerializedName("coupon_id")
    String coupanid;
    @SerializedName("sold_date")
    String soliddate;
    @SerializedName("expiry_date")
    String expirydate;
    @SerializedName("package_cost")
    String packagecost;
    @SerializedName("payment_mode")
    String paymentmode;
    @SerializedName("reference_no")
    String rfrence;
    @SerializedName("issuing_bank")
    String issuebank;
    @SerializedName("transaction_date")
    String trasaction;
    @SerializedName("discount")
    String discount;
    @SerializedName("net_payable")
    String netpayable;
    @SerializedName("message")
    String message;
    @SerializedName("status")
    String status;

    public AddPackege(String studentid, String packageid, String devisionid, String coupanid, String soliddate, String expirydate, String packagecost, String paymentmode, String rfrence, String issuebank, String trasaction, String discount, String netpayable) {
        this.studentid = studentid;
        this.packageid = packageid;
        this.devisionid = devisionid;
        this.coupanid = coupanid;
        this.soliddate = soliddate;
        this.expirydate = expirydate;
        this.packagecost = packagecost;
        this.paymentmode = paymentmode;
        this.rfrence = rfrence;
        this.issuebank = issuebank;
        this.trasaction = trasaction;
        this.discount = discount;
        this.netpayable = netpayable;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getPackageid() {
        return packageid;
    }

    public void setPackageid(String packageid) {
        this.packageid = packageid;
    }

    public String getDevisionid() {
        return devisionid;
    }

    public void setDevisionid(String devisionid) {
        this.devisionid = devisionid;
    }

    public String getCoupanid() {
        return coupanid;
    }

    public void setCoupanid(String coupanid) {
        this.coupanid = coupanid;
    }

    public String getSoliddate() {
        return soliddate;
    }

    public void setSoliddate(String soliddate) {
        this.soliddate = soliddate;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public String getPackagecost() {
        return packagecost;
    }

    public void setPackagecost(String packagecost) {
        this.packagecost = packagecost;
    }

    public String getPaymentmode() {
        return paymentmode;
    }

    public void setPaymentmode(String paymentmode) {
        this.paymentmode = paymentmode;
    }

    public String getRfrence() {
        return rfrence;
    }

    public void setRfrence(String rfrence) {
        this.rfrence = rfrence;
    }

    public String getIssuebank() {
        return issuebank;
    }

    public void setIssuebank(String issuebank) {
        this.issuebank = issuebank;
    }

    public String getTrasaction() {
        return trasaction;
    }

    public void setTrasaction(String trasaction) {
        this.trasaction = trasaction;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public String getNetpayable() {
        return netpayable;
    }

    public void setNetpayable(String netpayable) {
        this.netpayable = netpayable;
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
}
