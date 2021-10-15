package com.example.svadhyaya.RetrofitModel;

public class SubjectPackage {

    public String subject_id;
    public String institute_id;
    public String package_id;
    public String subject_name;
    public String srno;
    public String entry_on;
    public String entry_by;
    public Object modified_on;
    public String modified_by;

    public SubjectPackage(){

    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public String getInstitute_id() {
        return institute_id;
    }

    public void setInstitute_id(String institute_id) {
        this.institute_id = institute_id;
    }

    public String getPackage_id() {
        return package_id;
    }

    public void setPackage_id(String package_id) {
        this.package_id = package_id;
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

    public Object getModified_on() {
        return modified_on;
    }

    public void setModified_on(Object modified_on) {
        this.modified_on = modified_on;
    }

    public String getModified_by() {
        return modified_by;
    }

    public void setModified_by(String modified_by) {
        this.modified_by = modified_by;
    }
}
