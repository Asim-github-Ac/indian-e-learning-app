package com.example.svadhyaya.math.model;

public class ProportionsModel {

    private int image;
    private String title;
    private int progress;
    private String lesson;

    public ProportionsModel(int image, String title, int progress, String lesson) {
        this.image = image;
        this.title = title;
        this.progress = progress;
        this.lesson = lesson;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }
}
