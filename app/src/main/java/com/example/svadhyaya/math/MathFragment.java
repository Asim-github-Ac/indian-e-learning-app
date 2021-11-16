package com.example.svadhyaya.math;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svadhyaya.R;
import com.example.svadhyaya.RetrofitModel.GetAllPackages;
import com.example.svadhyaya.dashboard.fragments.HomeFragment;
import com.example.svadhyaya.math.adapter.CompoundAdapter;
import com.example.svadhyaya.math.adapter.NumberBasedAdapter;
import com.example.svadhyaya.math.adapter.ProportionsAdapter;
import com.example.svadhyaya.math.model.CompoundModel;
import com.example.svadhyaya.math.model.NumberBasedModel;
import com.example.svadhyaya.math.model.ProportionsModel;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;


public class MathFragment extends Fragment {

    public MathFragment() {
        // Required empty public constructor
    }
    //toolbar
    ImageView upBtn;
    TextView subject;
    String subjectname,subjectid,folderid;
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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_math, container, false);

        initilization(view);
        Bundle bundle = this.getArguments();
        if(bundle != null) {
             subjectname = bundle.get("subj").toString();
            subjectid = bundle.get("subjectid").toString();
            folderid=bundle.get("folderid").toString();
            Toast.makeText(getContext(), ""+subjectname, Toast.LENGTH_SHORT).show();
        }
        subject.setText(subjectname);
        upBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new HomeFragment()).commit();
            }
        });
        //1) proportions
        proportionsRecyclerView = view.findViewById(R.id.proportions_recyclerview);
        LinearLayoutManager proportionLayoutManager = new LinearLayoutManager(getContext());
        proportionLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        proportionsRecyclerView.setLayoutManager(proportionLayoutManager);

        proportionsList = new ArrayList<>();
        proportionsList.add(new ProportionsModel(R.drawable.ic_math,"Proportions",30,"5 Lesson"));
        proportionsList.add(new ProportionsModel(R.drawable.ic_calculating,"Reciprocals",95,"8 Lesson"));
        proportionsList.add(new ProportionsModel(R.drawable.ic_math,"Proportions",60,"6 Lesson"));
        proportionsList.add(new ProportionsModel(R.drawable.ic_calculating,"Reciprocals",50,"9 Lesson"));

        proportionsAdapter = new ProportionsAdapter(getContext(),proportionsList);
        proportionsRecyclerView.setAdapter(proportionsAdapter);
        proportionsAdapter.notifyDataSetChanged();

        //2) Compound
        compoundRecyclerView = view.findViewById(R.id.compound_recyclerview);
        LinearLayoutManager compoundLayoutManager = new LinearLayoutManager(getContext());
        compoundLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        compoundRecyclerView.setLayoutManager(compoundLayoutManager);

        compoundList = new ArrayList<>();
        compoundList.add(new CompoundModel(R.drawable.ic_business_and_finance,"Simple Interest",90,"8 Lesson"));
        compoundList.add(new CompoundModel(R.drawable.ic_test_3,"Compound Interest",20,"8 Lesson"));
        compoundList.add(new CompoundModel(R.drawable.ic_business_and_finance,"Simple Interest",50,"5 Lesson"));
        compoundList.add(new CompoundModel(R.drawable.ic_test_3,"Compound Interest",80,"5 Lesson"));

        compoundAdapter = new CompoundAdapter(getContext(),compoundList);
        compoundRecyclerView.setAdapter(compoundAdapter);
        compoundAdapter.notifyDataSetChanged();

        //3) number based
        numberBasedRecyclerview = view.findViewById(R.id.number_based_recyclerview);
        LinearLayoutManager numberBasedLayoutManager = new LinearLayoutManager(getContext());
        numberBasedLayoutManager.setOrientation(RecyclerView.HORIZONTAL);
        numberBasedRecyclerview.setLayoutManager(numberBasedLayoutManager);

        numberBasedList = new ArrayList<>();
        numberBasedList.add(new NumberBasedModel(R.drawable.ic_plus,"Plus",20,"5 Lesson"));
        numberBasedList.add(new NumberBasedModel(R.drawable.ic_profit,"Profit",90,"8 Lesson"));
        numberBasedList.add(new NumberBasedModel(R.drawable.ic_plus,"Plus",50,"5 Lesson"));
        numberBasedList.add(new NumberBasedModel(R.drawable.ic_profit,"Profit",80,"5 Lesson"));

        numberBasedAdapter = new NumberBasedAdapter(getContext(),numberBasedList);
        numberBasedRecyclerview.setAdapter(numberBasedAdapter);
        numberBasedAdapter.notifyDataSetChanged();

        return view;
    }
    public void initilization(View view){
        subject=view.findViewById(R.id.subjectnamefragment);
        upBtn = view.findViewById(R.id.math_up_btn);
    }

}