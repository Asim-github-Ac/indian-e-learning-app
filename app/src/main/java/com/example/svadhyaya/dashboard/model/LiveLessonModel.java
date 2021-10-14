package com.example.svadhyaya.dashboard.model;

public class LiveLessonModel {

    private int background;
    private int image;

    public LiveLessonModel(int background, int image) {
        this.background = background;
        this.image = image;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
