package com.example.svadhyaya.RetrofitModel;

import java.io.Serializable;
import java.util.List;

public class DashData implements Serializable {
    public String totalTest;
    public String givenTestConunt;
    public String overAllTestPerformance;
    public List<LastTestPerformance> lastTestPerformance;
    public List<MyAllTestPerformance> myAllTestPerformance;
    public String overlallTestTime;

    public DashData(String totalTest, String givenTestConunt, String overAllTestPerformance, List<LastTestPerformance> lastTestPerformance, List<MyAllTestPerformance> myAllTestPerformance, String overlallTestTime) {
        this.totalTest = totalTest;
        this.givenTestConunt = givenTestConunt;
        this.overAllTestPerformance = overAllTestPerformance;
        this.lastTestPerformance = lastTestPerformance;
        this.myAllTestPerformance = myAllTestPerformance;
        this.overlallTestTime = overlallTestTime;
    }

    public String getTotalTest() {
        return totalTest;
    }

    public void setTotalTest(String totalTest) {
        this.totalTest = totalTest;
    }

    public String getGivenTestConunt() {
        return givenTestConunt;
    }

    public void setGivenTestConunt(String givenTestConunt) {
        this.givenTestConunt = givenTestConunt;
    }

    public String getOverAllTestPerformance() {
        return overAllTestPerformance;
    }

    public void setOverAllTestPerformance(String overAllTestPerformance) {
        this.overAllTestPerformance = overAllTestPerformance;
    }

    public List<LastTestPerformance> getLastTestPerformance() {
        return lastTestPerformance;
    }

    public void setLastTestPerformance(List<LastTestPerformance> lastTestPerformance) {
        this.lastTestPerformance = lastTestPerformance;
    }

    public List<MyAllTestPerformance> getMyAllTestPerformance() {
        return myAllTestPerformance;
    }

    public void setMyAllTestPerformance(List<MyAllTestPerformance> myAllTestPerformance) {
        this.myAllTestPerformance = myAllTestPerformance;
    }

    public String getOverlallTestTime() {
        return overlallTestTime;
    }

    public void setOverlallTestTime(String overlallTestTime) {
        this.overlallTestTime = overlallTestTime;
    }
}
