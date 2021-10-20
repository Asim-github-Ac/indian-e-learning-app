package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class PackageParts implements Serializable {

    String package_id,institute_id,package_name,description,entry_on,entry_by,modified_on,modified_by ;
    @SerializedName("subject")
    @Expose
    List<SubjectPackage> subjectClasses = null;

    public PackageParts() {
    }

    public String getPackage_id() {
        return package_id;
    }

    public void setPackage_id(String package_id) {
        this.package_id = package_id;
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

    public List<SubjectPackage> getSubjectClasses() {
        return subjectClasses;
    }

    public void setSubjectClasses(List<SubjectPackage> subjectClasses) {
        this.subjectClasses = subjectClasses;
    }
}
