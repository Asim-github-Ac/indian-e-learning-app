package com.example.svadhyaya.dashboard.model;

public class ClassDialogModel {

    private String title;
    @SuppressWarnings("package_id")
    private  String Packid;
    public ClassDialogModel() {
    }
    public ClassDialogModel(String title,String pacid) {
        this.title = title;
        this.Packid=pacid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPackid() {
        return Packid;
    }

    public void setPackid(String packid) {
        Packid = packid;
    }
}
