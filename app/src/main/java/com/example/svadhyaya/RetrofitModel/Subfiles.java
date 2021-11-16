package com.example.svadhyaya.RetrofitModel;

import java.io.Serializable;

public class Subfiles implements Serializable {
    public String document_id;
    public String institute_id;
    public String class_id;
    public String folder_id;
    public String filetype;
    public String document_name;
    public Object file_name;
    public String embedlink;
    public String entry_on;
    public String entry_by;
    public Object modified_on;
    public Object modified_by;
    public String fileurl;

    public String getDocument_id() {
        return document_id;
    }

    public void setDocument_id(String document_id) {
        this.document_id = document_id;
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

    public String getFolder_id() {
        return folder_id;
    }

    public void setFolder_id(String folder_id) {
        this.folder_id = folder_id;
    }

    public String getFiletype() {
        return filetype;
    }

    public void setFiletype(String filetype) {
        this.filetype = filetype;
    }

    public String getDocument_name() {
        return document_name;
    }

    public void setDocument_name(String document_name) {
        this.document_name = document_name;
    }

    public Object getFile_name() {
        return file_name;
    }

    public void setFile_name(Object file_name) {
        this.file_name = file_name;
    }

    public String getEmbedlink() {
        return embedlink;
    }

    public void setEmbedlink(String embedlink) {
        this.embedlink = embedlink;
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

    public Object getModified_by() {
        return modified_by;
    }

    public void setModified_by(Object modified_by) {
        this.modified_by = modified_by;
    }

    public String getFileurl() {
        return fileurl;
    }

    public void setFileurl(String fileurl) {
        this.fileurl = fileurl;
    }
}
