package com.example.svadhyaya.RetrofitModel;

import java.io.Serializable;
import java.util.List;

public class SubFolderdata implements Serializable {

    public List<Object> folders;
    public List<Subfiles> files;
    public List<Sublevel> level;

    public List<Object> getFolders() {
        return folders;
    }

    public void setFolders(List<Object> folders) {
        this.folders = folders;
    }

    public List<Subfiles> getFiles() {
        return files;
    }

    public void setFiles(List<Subfiles> files) {
        this.files = files;
    }

    public List<Sublevel> getLevel() {
        return level;
    }

    public void setLevel(List<Sublevel> level) {
        this.level = level;
    }
}
