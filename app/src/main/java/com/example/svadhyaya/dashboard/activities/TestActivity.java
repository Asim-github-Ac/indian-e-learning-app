package com.example.svadhyaya.dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.svadhyaya.R;
import com.example.svadhyaya.Retrofit.APIClient;
import com.example.svadhyaya.Retrofit.APIInterface;
import com.example.svadhyaya.RetrofitModel.GetAllPackages;
import com.example.svadhyaya.RetrofitModel.QuestionList;
import com.example.svadhyaya.RetrofitModel.Start_test;
import com.example.svadhyaya.SharedPrefrence.PrefManager;
import com.example.svadhyaya.dashboard.adapter.TestAdapter;
import com.example.svadhyaya.dashboard.fragments.ContactUsFragment;
import com.example.svadhyaya.dashboard.fragments.HomeFragment;
import com.example.svadhyaya.math.adapter.SubjectAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TestActivity extends AppCompatActivity {
RecyclerView testrecycler;
TextView timertv;
Button submitbtn;
String  timervalue;
APIInterface apiInterface;
PrefManager prefManager;
ProgressBar progressBar;
LinearLayoutManager liveLessonLayoutManager;
List<QuestionList> questionListList=new ArrayList<>();
TestAdapter testAdapter;
CountDownTimer cdt = null;
public int counter =10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        initilization();
        apiInterface = APIClient.getClient().create(APIInterface.class);
        prefManager=new PrefManager(this);
        GetQuestion("57316020e03f24759dce0fedeab4caa6","1");


    }
    public void GetQuestion(String authkey,String testid){
        progressBar.setVisibility(View.VISIBLE);
        final Start_test  start_test=new Start_test(authkey,testid);
        Call<Start_test> call=apiInterface.START_TEST_CALL(start_test);
        call.enqueue(new Callback<Start_test>() {
            @Override
            public void onResponse(Call<Start_test> call, Response<Start_test> response) {
                System.out.println("response"+response);
                Start_test start_test1 = response.body();
             //   System.out.println(start_test1.getMessage());
               try {
                   if (start_test1 !=null && start_test1.getStatus().equals("true")){
                       questionListList=start_test1.getStarttestdata().getQuestionListList();
                       timervalue=start_test1.getStarttestdata().getRemainingtime();
                       counter=Integer.parseInt(timervalue);
                       testAdapter=new TestAdapter(TestActivity.this,questionListList);
                       liveLessonLayoutManager = new LinearLayoutManager(TestActivity.this);
                       testrecycler.setLayoutManager(liveLessonLayoutManager);
                       testrecycler.setAdapter(testAdapter);
                       testAdapter.notifyDataSetChanged();
                      cdt= new CountDownTimer(counter*1000, 1000){
                           public void onTick(long millisUntilFinished){
                               timertv.setText(String.valueOf(counter));
                               counter--;
                           }
                           public  void onFinish(){
                               timertv.setText("FINISH!!");

                           }
                       }.start();
                      progressBar.setVisibility(View.INVISIBLE);
                   }
                   else
                   {
                       System.out.println("else part __"+response.message());
                       progressBar.setVisibility(View.INVISIBLE);
                   }
               }catch (Exception exception){
                   System.out.println("catch tes___________"+exception);
                   progressBar.setVisibility(View.INVISIBLE);
               }
            }
            @Override
            public void onFailure(Call<Start_test> call, Throwable t) {
                progressBar.setVisibility(View.INVISIBLE);
            }
        });
    }
  public void initilization(){
        testrecycler=findViewById(R.id.testrecyclerview);
        timertv=findViewById(R.id.counttimer);
        submitbtn=findViewById(R.id.submittest);
        progressBar=findViewById(R.id.testprogress);
  }
}