package com.example.svadhyaya.dashboard.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.example.svadhyaya.R;
import com.example.svadhyaya.RetrofitModel.GetAllPackages;
import com.example.svadhyaya.RetrofitModel.SubjectPackage;
import com.example.svadhyaya.math.adapter.SubjectAdapter;
import com.example.svadhyaya.math.adapter.SubjectDetailsAdapter;

import java.util.ArrayList;
import java.util.List;

public class SubjectActivity extends AppCompatActivity {
String  position;
List<SubjectPackage> list=new ArrayList<>();
RecyclerView recyclerView;
public SubjectDetailsAdapter subjectDetailsAdapter;
LinearLayoutManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);
        recyclerView=findViewById(R.id.subjdetailsRv);
        Intent intent=getIntent();
        position=intent.getStringExtra("pos");
        list = (List<SubjectPackage>) intent.getSerializableExtra("List");
        subjectDetailsAdapter = new SubjectDetailsAdapter(this, list,position);
        System.out.println("size)))))))))))))))))"+list.size());
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(subjectDetailsAdapter);
        subjectDetailsAdapter.notifyDataSetChanged();
    }
}