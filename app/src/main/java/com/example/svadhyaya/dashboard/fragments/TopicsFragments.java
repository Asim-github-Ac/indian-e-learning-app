package com.example.svadhyaya.dashboard.fragments;

import android.app.ProgressDialog;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.svadhyaya.R;
import com.example.svadhyaya.Retrofit.APIClient;
import com.example.svadhyaya.Retrofit.APIInterface;
import com.example.svadhyaya.RetrofitModel.Folder_Lists;
import com.example.svadhyaya.RetrofitModel.StudyMaterialFolder;
import com.example.svadhyaya.RetrofitModel.TopicData;
import com.example.svadhyaya.RetrofitModel.TopicFolder;
import com.example.svadhyaya.SharedPrefrence.PrefManager;
import com.example.svadhyaya.dashboard.adapter.TopicAdapter;
import com.example.svadhyaya.math.adapter.SubjectAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class TopicsFragments extends Fragment {
    String subjectname,subjectid,folderid;
    ProgressDialog progressDialog;
    RecyclerView recyclerView;
    TextView totaltopics;
  //  ConstraintLayout constraintLayout;
    APIInterface apiInterface;
    TextView subject;
    List<Folder_Lists> topiclists=new ArrayList<>();
    PrefManager prefManager;
    private LinearLayoutManager manager;
    TopicAdapter topicAdapter;
    public TopicsFragments() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_topics_fragments, container, false);
        initilization(view);
        Bundle bundle=this.getArguments();
        if(bundle != null) {
            subjectname = bundle.get("subj").toString();
            subjectid = bundle.get("subjectid").toString();
            folderid=bundle.get("folderid").toString();
            prefManager.setSubjectnamevideo(subjectname);
            prefManager.setSubjidvideo(subjectid);
            prefManager.setFolderid(folderid);


        }
        manager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(manager);
        GetTopics(prefManager.getWeb_time(),prefManager.getFolderid());

        return view;
    }
    public void initilization(View view){
      //  constraintLayout=view.findViewById(R.id.constraintsvisible);
        recyclerView=view.findViewById(R.id.topicrecycler);
        subject=view.findViewById(R.id.subjectnamefragment);
        totaltopics=view.findViewById(R.id.totaltopics);
        apiInterface = APIClient.getClient().create(APIInterface.class);
        prefManager=new PrefManager(getContext());

    }
    public void GetTopics(String authkey,String folderid){
        progressDialog=new ProgressDialog(getContext());
        progressDialog.show();
        progressDialog.setContentView(R.layout.home_dialog);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        subject.setText(prefManager.getSubjectnamevideo());
      //  constraintLayout.setVisibility(View.INVISIBLE);
        final TopicFolder topicFolder=new TopicFolder(authkey,folderid);
        Call<TopicFolder> call=apiInterface.topicfolder(topicFolder);
        call.enqueue(new Callback<TopicFolder>() {
            @Override
            public void onResponse(Call<TopicFolder> call, Response<TopicFolder> response) {
                System.out.println("topicfolder fetched"+response);
                TopicFolder topicFolder1 = response.body();
                System.out.println(topicFolder1.getMessage());
                if (topicFolder1 !=null && topicFolder1.getStatus().equals("true") ) {
                    System.out.println("studyfetched________________"+topicFolder1.getTopicData().getFolder_lists());
                    topiclists=topicFolder1.getTopicData().getFolder_lists();
                    System.out.println("length is__________"+topiclists.size());
                    totaltopics.setText(String.valueOf(topiclists.size())+"/");
                    topicAdapter = new TopicAdapter(getContext(),topiclists);
                    recyclerView.setAdapter(topicAdapter);
                    topicAdapter.notifyDataSetChanged();
                   //   constraintLayout.setVisibility(View.VISIBLE);
                     progressDialog.dismiss();

                }
                else{
                    System.out.println("live_____err");
                    progressDialog.dismiss();
                   // constraintLayout.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onFailure(Call<TopicFolder> call, Throwable t) {
            progressDialog.dismiss();
            }
        });
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        progressDialog.dismiss();
    }
}