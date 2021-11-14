package com.example.svadhyaya.RetrofitModel;

import java.io.Serializable;

public class StudyFolderList implements Serializable {
    public String folder_id;
    public String parent_folder_id;
    public String folder_name;
    public String institute_id;
    public String class_id;
    public String subject_id;
    public String topic_id;
    public String entry_on;
    public String entry_by;
    public String modified_on;
    public String modified_by;

    public StudyFolderList(String folder_id, String parent_folder_id, String folder_name, String institute_id, String class_id, String subject_id, String topic_id, String entry_on, String entry_by, String modified_on, String modified_by) {
        this.folder_id = folder_id;
        this.parent_folder_id = parent_folder_id;
        this.folder_name = folder_name;
        this.institute_id = institute_id;
        this.class_id = class_id;
        this.subject_id = subject_id;
        this.topic_id = topic_id;
        this.entry_on = entry_on;
        this.entry_by = entry_by;
        this.modified_on = modified_on;
        this.modified_by = modified_by;
    }

    public String getFolder_id() {
        return folder_id;
    }

    public void setFolder_id(String folder_id) {
        this.folder_id = folder_id;
    }

    public String getParent_folder_id() {
        return parent_folder_id;
    }

    public void setParent_folder_id(String parent_folder_id) {
        this.parent_folder_id = parent_folder_id;
    }

    public String getFolder_name() {
        return folder_name;
    }

    public void setFolder_name(String folder_name) {
        this.folder_name = folder_name;
    }

    public String getInstitute_id() {
        return institute_id;
    }

    public void setInstitute_id(String institute_id) {
        this.institute_id = institute_id;
    }

    public String getClass_id() {
        return class_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public String getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(String topic_id) {
        this.topic_id = topic_id;
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
}
