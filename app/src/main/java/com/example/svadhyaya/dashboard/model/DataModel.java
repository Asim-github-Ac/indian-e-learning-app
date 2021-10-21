package com.example.svadhyaya.dashboard.model;

import com.example.svadhyaya.R;

import java.util.ArrayList;
import java.util.List;

public class DataModel {
    private String title;
    private int imageId;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public static List<DataModel> getData() {
        List<DataModel> dataList = new ArrayList<>();

        int[] imageIds = getImages();
        String[] titles = getTitles();

        for (int i = 0; i < titles.length; i++) {
            DataModel navItem = new DataModel();
            navItem.setTitle(titles[i]);
            navItem.setImageId(imageIds[i]);
            dataList.add(navItem);
        }
        return dataList;
    }
    private static int[] getImages() {
        return new int[]{
                R.drawable.learn_579, R.drawable.learingan_580,
                R.drawable.cam_581, R.drawable.bells_582,
                R.drawable.subs, R.drawable.msg_584, R.drawable.share_585,R.drawable.terms_586};
    }

    private static String[] getTitles() {

        return new String[] {
                "My Lessons", "Learning Analysis", "Ask a Questions", "Notification", "Subscribe", "Contactus", "Share an App" ,"Terms & Condition"
        };
    }
}
