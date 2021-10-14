package com.example.svadhyaya.dashboard.fragments;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import com.example.svadhyaya.R;
import com.example.svadhyaya.dashboard.activities.MainActivity;
import com.example.svadhyaya.dashboard.adapter.ClassDialogAdapter;
import com.example.svadhyaya.dashboard.adapter.LiveLessonAdapter;
import com.example.svadhyaya.dashboard.model.ClassDialogModel;
import com.example.svadhyaya.dashboard.model.LiveLessonModel;
import com.example.svadhyaya.math.MathFragment;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    //home_toolbar
    private ImageView toolbarDrawer;
    private TextView toolbarTitle;
    private CardView openCustomDialog;
    private TextView mClassTitle;
    private AlertDialog dialog;
    private ArrayList<ClassDialogModel> classList;
    private ClassDialogAdapter classAdapter;
    private String classTitle;


    //live lessons
    private RecyclerView liveLessonRecyclerView;
    private LinearLayoutManager liveLessonLayoutManager;
    private List<LiveLessonModel> liveLessonList;
    private LiveLessonAdapter liveLessonAdapter;

    //video library
    private ConstraintLayout mathCard,physicsCard,chemistryCard,bioCard;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        initView(view);

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

        //live lesson
        liveLessonLayoutManager = new LinearLayoutManager(getContext());
        liveLessonLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        liveLessonRecyclerView.setLayoutManager(liveLessonLayoutManager);

        liveLessonList = new ArrayList<>();
        liveLessonList.add(new LiveLessonModel(R.drawable.ic_live_lesson_card1,R.mipmap.porgi));
        liveLessonList.add(new LiveLessonModel(R.drawable.ic_live_lesson_card2,R.mipmap.kaka));
        liveLessonList.add(new LiveLessonModel(R.drawable.ic_live_lesson_card1,R.mipmap.porgi));

        liveLessonAdapter = new LiveLessonAdapter(getContext(),liveLessonList);
        liveLessonRecyclerView.setAdapter(liveLessonAdapter);
        liveLessonAdapter.notifyDataSetChanged();


        //video library
        mathCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new MathFragment()).commit();
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

        //video library
        mathCard = view.findViewById(R.id.math_card);
        physicsCard = view.findViewById(R.id.physics_card);
        chemistryCard = view.findViewById(R.id.chemistry_card);
        bioCard = view.findViewById(R.id.bio_card);
    }

    private void customDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

        View view = LayoutInflater.from(getContext()).inflate(R.layout.class_custom_dialog, null);
        builder.setView(view);

        final ListView listView = view.findViewById(R.id.class_list);
        Button continueBtn = view.findViewById(R.id.continue_btn);
        TextView quitbtn = view.findViewById(R.id.quit_btn);

        classList = new ArrayList<>();
        classList.add(new ClassDialogModel("5th Class"));
        classList.add(new ClassDialogModel("6th Class"));
        classList.add(new ClassDialogModel("8th Class"));
        classList.add(new ClassDialogModel("9th Class"));
        classList.add(new ClassDialogModel("10th Class"));

        classAdapter = new ClassDialogAdapter(getContext(), classList);
        listView.setAdapter(classAdapter);
        classAdapter.notifyDataSetChanged();

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ClassDialogModel classDialogModel = (ClassDialogModel) adapterView.getAdapter().getItem(i);
                classTitle = classDialogModel.getTitle();
                //Toast.makeText(MainActivity.this, ""+classTitle, Toast.LENGTH_SHORT).show();
            }
        });

        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mClassTitle.setText(classTitle);
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
}