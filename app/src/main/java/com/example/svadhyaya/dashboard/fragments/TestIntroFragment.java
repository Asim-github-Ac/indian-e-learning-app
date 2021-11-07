package com.example.svadhyaya.dashboard.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.svadhyaya.R;
import com.example.svadhyaya.Retrofit.APIClient;
import com.example.svadhyaya.Retrofit.APIInterface;
import com.example.svadhyaya.RetrofitModel.QuestionList;
import com.example.svadhyaya.RetrofitModel.Start_test;
import com.example.svadhyaya.SharedPrefrence.PrefManager;
import com.example.svadhyaya.dashboard.activities.TestActivity;
import com.example.svadhyaya.dashboard.adapter.TestAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class TestIntroFragment extends Fragment  {
Button btn;
    APIInterface apiInterface;
    PrefManager prefManager;
    ProgressBar progressBar;
    TextView totaltime,totalques;
    LinearLayoutManager liveLessonLayoutManager;
    List<QuestionList> questionListList=new ArrayList<>();
    TestAdapter testAdapter;
    CountDownTimer cdt = null;
    public int counter =10;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_test_intro, container, false);
        initilization(view);
        apiInterface = APIClient.getClient().create(APIInterface.class);
        prefManager=new PrefManager(getContext());
        GetQuestion("57316020e03f24759dce0fedeab4caa6","1");

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent=new Intent(getContext(), TestActivity.class);

               startActivity(intent);
           }
       });
        return view;
    }
    public void GetQuestion(String authkey,String testid){
        progressBar.setVisibility(View.VISIBLE);
        final Start_test start_test=new Start_test(authkey,testid);
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
                        totaltime.setText(start_test1.getStarttestdata().getRemainingtime());
                        totalques.setText(questionListList.size());
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
    public void initilization(View view){
       progressBar=view.findViewById(R.id.testprogress);
        btn=view.findViewById(R.id.teststart);
        totaltime=view.findViewById(R.id.totaltime);
        totalques=view.findViewById(R.id.totalquestions);
    }
}