package com.example.svadhyaya.dashboard.fragments;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.svadhyaya.R;
import com.example.svadhyaya.Retrofit.APIClient;
import com.example.svadhyaya.Retrofit.APIInterface;
import com.example.svadhyaya.Retrofit.Constant;
import com.example.svadhyaya.RetrofitModel.AddPackege;
import com.example.svadhyaya.RetrofitModel.GetAllPackages;
import com.example.svadhyaya.RetrofitModel.LiveClassRoom;
import com.example.svadhyaya.RetrofitModel.PackageParts;
import com.example.svadhyaya.RetrofitModel.StudyFolderList;
import com.example.svadhyaya.RetrofitModel.StudyMaterialFolder;
import com.example.svadhyaya.RetrofitModel.SubjectPackage;
import com.example.svadhyaya.SharedPrefrence.PrefManager;
import com.example.svadhyaya.dashboard.activities.MainActivity;
import com.example.svadhyaya.dashboard.activities.TestActivity;
import com.example.svadhyaya.dashboard.adapter.ClassDialogAdapter;
import com.example.svadhyaya.dashboard.adapter.LiveLessonAdapter;
import com.example.svadhyaya.dashboard.model.ClassDialogModel;
import com.example.svadhyaya.math.adapter.SubjectAdapter;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment {
    //home_toolbar
    private ImageView toolbarDrawer;
    private TextView toolbarTitle;
    private CardView openCustomDialog;
    private TextView mClassTitle;
    ProgressDialog progressDialog;
    private AlertDialog dialog;
    private ArrayList<ClassDialogModel> classList = new ArrayList<>();
    private ClassDialogAdapter classAdapter;
    private String classTitle,listpackid;
    PrefManager prefManager;
    APIInterface apiInterface;
    String packagename,packageid,checkpackname;
    ConstraintLayout constraintLayoutexams;
    ArrayList<String> subjectlist= new ArrayList<>();
    List<PackageParts> allsubj= new ArrayList<>();
    //subject adapter
    RecyclerView recyclerView;
    private SubjectAdapter subjectAdapter;
    List<StudyFolderList> subjectPackageList;
    GridLayoutManager manager;
//dialouge
    //live lessons
    private RecyclerView liveLessonRecyclerView;
    private LinearLayoutManager liveLessonLayoutManager;
    private List<LiveClassRoom.LiveClass2.LiveClassList3> liveClassList3s = new ArrayList<>();
    private LiveLessonAdapter liveLessonAdapter;
    //video libra
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        initView(view);
        prefManager=new PrefManager(getContext());
        mClassTitle.setText(prefManager.getPackname());
        apiInterface = APIClient.getClient().create(APIInterface.class);
        //my live lesson
        liveLessonLayoutManager = new LinearLayoutManager(getContext());
        liveLessonLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        liveLessonRecyclerView.setLayoutManager(liveLessonLayoutManager);
        // subject
        manager = new GridLayoutManager(getContext(),2);
       // manager.setOrientation(RecyclerView.HORIZONTAL);
        recyclerView.setLayoutManager(manager);
        subjectPackageList=new ArrayList<>();
        GetPackages(Constant.insituteId);
        System.out.println("key is________"+prefManager.getWeb_time());
        GetStudyMaterial(prefManager.getWeb_time());
        GetLiveClass(prefManager.getWeb_time());
        Log.d("tag", "onCreateView: em"+prefManager.getSave_Email_InFo());
        //home_toolbar
        toolbarDrawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).openDrawer();
            }
        });
        openCustomDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog();
            }
        });
        constraintLayoutexams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction fr = getFragmentManager().beginTransaction();
                fr.replace(R.id.fragment_container,new TestIntroFragment());
                fr.commit();
            }
        });
        return view;
    }
    private void initView(View view){
        //drawer
        //home_toolbar
        toolbarTitle = view.findViewById(R.id.toolbar_title);
        toolbarDrawer =view.findViewById(R.id.toolbar_drawer);
        openCustomDialog = view.findViewById(R.id.custom_dialog_card);
        mClassTitle = view.findViewById(R.id.class_title);
        //live lesson
        liveLessonRecyclerView = view.findViewById(R.id.live_lesson_recyclerview);
        // subject recyclerview
        recyclerView=view.findViewById(R.id.subjectrecyclerview);
        constraintLayoutexams=view.findViewById(R.id.constaintsexams);
        //video library
     //   mathCard = view.findViewById(R.id.math_card);
    }
    private void customDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        View view = LayoutInflater.from(getContext()).inflate(R.layout.class_custom_dialog, null);
        builder.setView(view);
        final ListView listView = view.findViewById(R.id.class_list);
        Button continueBtn = view.findViewById(R.id.continue_btn);
        TextView quitbtn = view.findViewById(R.id.quit_btn);
        classAdapter = new ClassDialogAdapter(getContext(), classList);
        listView.setAdapter(classAdapter);
        classAdapter.notifyDataSetChanged();
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ClassDialogModel classDialogModel = (ClassDialogModel) adapterView.getAdapter().getItem(i);
                classTitle = classDialogModel.getTitle();
                listpackid = classDialogModel.getPackid();
                prefManager.setSelectedid(listpackid);
                prefManager.setPackname(classTitle);
                prefManager.setList_size(String.valueOf(i));
                Toast.makeText(getContext(), ""+classTitle, Toast.LENGTH_SHORT).show();
            }
        });
        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mClassTitle.setText(prefManager.getPackname());
              //  RefreshPkg(Constant.insituteId,classTitle);
                PackageAdded();
                dialog.dismiss();
            }
        });
        quitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });
        dialog = builder.create();
        //dialog.getWindow().getDecorView().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        setBackground(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
    }
    public void setBackground(Drawable background) {
        //noinspection deprecation
        dialog.getWindow().getDecorView().setBackgroundDrawable(background);
    }
    public  void  GetPackages(String authkey){
        ProgressDialog progressDialog2=new ProgressDialog(getContext());
        progressDialog2.show();
        progressDialog2.setContentView(R.layout.customprogress);
        progressDialog2.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        final GetAllPackages getAllPackages=new GetAllPackages(authkey);
        Call<GetAllPackages> call=apiInterface.getpackages(getAllPackages);
        call.enqueue(new Callback<GetAllPackages>() {
            @Override
            public void onResponse(Call<GetAllPackages> call, Response<GetAllPackages> response) {
                System.out.println("response"+response);
                GetAllPackages getAllPackages1 = response.body();
                System.out.println(getAllPackages1.getMessage());
                if (getAllPackages1 !=null && getAllPackages1.getStatus().equals("true")){
                    allsubj=getAllPackages1.getAllpageslist();
                    System.out.println("list size is    ==="+getAllPackages1.getAllpageslist().size());
                    for (int i = 0;i<getAllPackages1.getAllpageslist().size();i++) {
                        packagename=getAllPackages1.getAllpageslist().get(i).getPackage_name();
                        packageid=getAllPackages1.getAllpageslist().get(i).getPackage_id();
                        classList.add(new ClassDialogModel(packagename,packageid));
                        subjectlist.add(getAllPackages1.getAllpageslist().get(i).getPackage_name());
                    }
                   progressDialog2.dismiss();
                }
                else
                {
                    System.out.println("else part __"+response);
                  progressDialog2.dismiss();
                }
            }
            @Override
            public void onFailure(Call<GetAllPackages> call, Throwable t) {
               progressDialog2.dismiss();
                System.out.println("error failer" +t.getMessage());
            }
        });
    }
    public void GetLiveClass(String authkey){
        ProgressDialog progressDialog1=new ProgressDialog(getContext());
        progressDialog1.show();
        progressDialog1.setContentView(R.layout.home_dialog);
        progressDialog1.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        final LiveClassRoom liveClassRoom=new LiveClassRoom(authkey);
        Call<LiveClassRoom> call=apiInterface.LIVE_CLASS_ROOM_CALL(liveClassRoom);
        call.enqueue(new Callback<LiveClassRoom>() {
            @Override
            public void onResponse(Call<LiveClassRoom> call, Response<LiveClassRoom> response) {
                System.out.println("response"+response);
                LiveClassRoom liveClassRoom1 = response.body();
                System.out.println(liveClassRoom1.getMessage());
                if (liveClassRoom1 !=null && liveClassRoom1.getStatus().equals("true") && liveClassRoom1.getLiveClass2().getLiveClassLists() !=null) {
                    liveClassList3s=liveClassRoom1.getLiveClass2().getLiveClassLists();
                   System.out.println("techer name_____"+liveClassRoom1.getLiveClass2());
                    Log.d("tech", "onResponse: "+liveClassRoom1.getLiveClass2());
                    System.out.println("techer name_____33"+liveClassRoom1.getLiveClass2().getLiveClassLists());
                    liveLessonAdapter = new LiveLessonAdapter(getContext(),liveClassList3s);
                    liveLessonRecyclerView.setAdapter(liveLessonAdapter);
                    liveLessonAdapter.notifyDataSetChanged();
                    progressDialog1.dismiss();
                }
                else{
                    System.out.println("live_____err");
                    progressDialog1.dismiss();
                }
            }
            @Override
            public void onFailure(Call<LiveClassRoom> call, Throwable t) {
                progressDialog1.dismiss();
            }
        });
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        classList.clear();
    }
    @Override
    public void onStart() {
        super.onStart();
        classList.clear();
    }
    public void PackageAdded(){
        progressDialog=new ProgressDialog(getContext());
        progressDialog.show();
        progressDialog.setContentView(R.layout.home_dialog);
        progressDialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        final AddPackege addPackege=new AddPackege(prefManager.getStdid(),prefManager.getSelectedid(),"1","1","2021-10-05","2021-10-05","1","1","1","1","2021-10-05","1","1");
        Call<AddPackege> addPackegeCall=apiInterface.addpack(addPackege);
        addPackegeCall.enqueue(new Callback<AddPackege>() {
            @Override
            public void onResponse(Call<AddPackege> call, Response<AddPackege> response) {
                System.out.println("response"+response);
                AddPackege addPackege1 = response.body();
                System.out.println(addPackege1.getMessage());
                if (addPackege1 !=null && addPackege1.getMessage().equals("Package Added") ) {
                    System.out.println("pack added_________________");
                   progressDialog.dismiss();
                }
                else{
                    System.out.println("live_____err");
                progressDialog.dismiss();
                }
            }

            @Override
            public void onFailure(Call<AddPackege> call, Throwable t) {

            }
        });

    }
    public void  GetStudyMaterial(String authkey){
        ProgressDialog progressDialog3=new ProgressDialog(getContext());
        progressDialog3.show();
        progressDialog3.setContentView(R.layout.home_dialog);
        progressDialog3.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        final StudyMaterialFolder studyMaterialFolder=new StudyMaterialFolder(authkey);
        Call<StudyMaterialFolder> call=apiInterface.studyFolder(studyMaterialFolder);
        call.enqueue(new Callback<StudyMaterialFolder>() {
            @Override
            public void onResponse(Call<StudyMaterialFolder> call, Response<StudyMaterialFolder> response) {
                System.out.println("study_material_fetched"+response);
                StudyMaterialFolder studyMaterialFolder1 = response.body();
                System.out.println(studyMaterialFolder1.getMessage());
                if (studyMaterialFolder1 !=null && studyMaterialFolder1.getStatus().equals("true") ) {
                    System.out.println("studyfetched________________");
                    subjectPackageList=studyMaterialFolder1.getData();
                    subjectAdapter = new SubjectAdapter(getContext(),subjectPackageList);
                    recyclerView.setAdapter(subjectAdapter);
                    subjectAdapter.notifyDataSetChanged();
                   progressDialog3.dismiss();
                }
                else{
                    System.out.println("live_____err");
                    progressDialog3.dismiss();
                }
            }

            @Override
            public void onFailure(Call<StudyMaterialFolder> call, Throwable t) {
        progressDialog3.dismiss();
            }
        });
    }
}