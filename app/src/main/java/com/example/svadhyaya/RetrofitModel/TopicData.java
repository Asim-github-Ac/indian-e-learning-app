package com.example.svadhyaya.RetrofitModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class TopicData implements Serializable {
    @SerializedName("folders")
    @Expose
    public List<Folder_Lists> folder_lists;
    public List<Object> files;
    @SerializedName("level")
    @Expose
    public List<Folders_Level> folders_levels;

    public TopicData(List<Folder_Lists> folder_lists, List<Object> files, List<Folders_Level> folders_levels) {
        this.folder_lists = folder_lists;
        this.files = files;
        this.folders_levels = folders_levels;
    }

    public List<Folder_Lists> getFolder_lists() {
        return folder_lists;
    }

    public void setFolder_lists(List<Folder_Lists> folder_lists) {
        this.folder_lists = folder_lists;
    }

    public List<Object> getFiles() {
        return files;
    }

    public void setFiles(List<Object> files) {
        this.files = files;
    }

    public List<Folders_Level> getFolders_levels() {
        return folders_levels;
    }

    public void setFolders_levels(List<Folders_Level> folders_levels) {
        this.folders_levels = folders_levels;
    }
}
