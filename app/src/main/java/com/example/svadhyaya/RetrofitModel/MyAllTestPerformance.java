package com.example.svadhyaya.RetrofitModel;
import java.io.Serializable;
public class MyAllTestPerformance implements Serializable {
    public String name;
    public String percentage;
    public MyAllTestPerformance(String name, String percentage) {
        this.name = name;
        this.percentage = percentage;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPercentage() {
        return percentage;
    }
    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }
}
