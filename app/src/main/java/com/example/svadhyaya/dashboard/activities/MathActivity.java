package com.example.svadhyaya.dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.example.svadhyaya.R;
import com.example.svadhyaya.dashboard.fragments.HomeFragment;
import com.example.svadhyaya.math.adapter.CompoundAdapter;
import com.example.svadhyaya.math.adapter.NumberBasedAdapter;
import com.example.svadhyaya.math.adapter.ProportionsAdapter;
import com.example.svadhyaya.math.model.CompoundModel;
import com.example.svadhyaya.math.model.NumberBasedModel;
import com.example.svadhyaya.math.model.ProportionsModel;

import java.util.ArrayList;
import java.util.List;

public class MathActivity extends AppCompatActivity {
    ImageView upBtn;
    String subjname;

    //1) proportions
    private RecyclerView proportionsRecyclerView;
    private List<ProportionsModel> proportionsList;
    private ProportionsAdapter proportionsAdapter;


    //2) Compound
    private RecyclerView compoundRecyclerView;
    private List<CompoundModel> compoundList;
    private CompoundAdapter compoundAdapter;

    //3) numberbased
    private RecyclerView numberBasedRecyclerview;
    private List<NumberBasedModel> numberBasedList;
    private NumberBasedAdapter numberBasedAdapter;
    Toolbar toolbar;
    TextView tvsubj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math);
        upBtn = findViewById(R.id.math_up_btn);
//        toolbar=findViewById(R.id.math_toolbar);
        tvsubj=findViewById(R.id.subjectname);
        Intent intent=getIntent();
        subjname=intent.getStringExtra("subj");



        tvsubj.setText(subjname);
        upBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        //        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();
            }
        });

        //1) proportions
        proportionsRecyclerView = findViewById(R.id.proportions_recyclerview);
        LinearLayoutManager proportionLayoutManager = new LinearLayoutManager(this);
        proportionLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        proportionsRecyclerView.setLayoutManager(proportionLayoutManager);

        proportionsList = new ArrayList<>();
        proportionsList.add(new ProportionsModel(R.drawable.ic_math,"Proportions",30,"5 Lesson"));
        proportionsList.add(new ProportionsModel(R.drawable.ic_calculating,"Reciprocals",95,"8 Lesson"));
        proportionsList.add(new ProportionsModel(R.drawable.ic_math,"Proportions",60,"6 Lesson"));
        proportionsList.add(new ProportionsModel(R.drawable.ic_calculating,"Reciprocals",50,"9 Lesson"));

        proportionsAdapter = new ProportionsAdapter(this,proportionsList);
        proportionsRecyclerView.setAdapter(proportionsAdapter);
        proportionsAdapter.notifyDataSetChanged();

        //2) Compound
        compoundRecyclerView = findViewById(R.id.compound_recyclerview);
        LinearLayoutManager compoundLayoutManager = new LinearLayoutManager(this);
        compoundLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        compoundRecyclerView.setLayoutManager(compoundLayoutManager);

        compoundList = new ArrayList<>();
        compoundList.add(new CompoundModel(R.drawable.ic_business_and_finance,"Simple Interest",90,"8 Lesson"));
        compoundList.add(new CompoundModel(R.drawable.ic_test_3,"Compound Interest",20,"8 Lesson"));
        compoundList.add(new CompoundModel(R.drawable.ic_business_and_finance,"Simple Interest",50,"5 Lesson"));
        compoundList.add(new CompoundModel(R.drawable.ic_test_3,"Compound Interest",80,"5 Lesson"));

        compoundAdapter = new CompoundAdapter(this,compoundList);
        compoundRecyclerView.setAdapter(compoundAdapter);
        compoundAdapter.notifyDataSetChanged();

        //3) number based
        numberBasedRecyclerview = findViewById(R.id.number_based_recyclerview);
        LinearLayoutManager numberBasedLayoutManager = new LinearLayoutManager(this);
        numberBasedLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        numberBasedRecyclerview.setLayoutManager(numberBasedLayoutManager);

        numberBasedList = new ArrayList<>();
        numberBasedList.add(new NumberBasedModel(R.drawable.ic_plus,"Plus",20,"5 Lesson"));
        numberBasedList.add(new NumberBasedModel(R.drawable.ic_profit,"Profit",90,"8 Lesson"));
        numberBasedList.add(new NumberBasedModel(R.drawable.ic_plus,"Plus",50,"5 Lesson"));
        numberBasedList.add(new NumberBasedModel(R.drawable.ic_profit,"Profit",80,"5 Lesson"));

        numberBasedAdapter = new NumberBasedAdapter(this,numberBasedList);
        numberBasedRecyclerview.setAdapter(numberBasedAdapter);
        numberBasedAdapter.notifyDataSetChanged();
    }
}