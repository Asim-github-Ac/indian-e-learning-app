package com.example.svadhyaya.RetrofitModel;

import java.io.Serializable;

public class LastTestPerformance implements Serializable {
    public String question;
    public String  number;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
