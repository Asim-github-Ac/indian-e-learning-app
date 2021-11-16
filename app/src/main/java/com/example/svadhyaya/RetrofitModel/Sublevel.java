package com.example.svadhyaya.RetrofitModel;

import java.io.Serializable;

public class Sublevel implements Serializable {
    public String folder_id;
    public String parent_folder_id;
    public String folder_name;

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
}
