package com.example.svadhyaya.dashboard.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import com.example.svadhyaya.R;
import com.example.svadhyaya.dashboard.model.ClassDialogModel;

import java.util.List;


public class ClassDialogAdapter extends BaseAdapter {


    Context context;
    List<ClassDialogModel> classList;

    public ClassDialogAdapter(Context context, List<ClassDialogModel> classList) {
        this.context = context;
        this.classList = classList;
    }

    @Override
    public int getCount() {
        return classList.size();
    }

    @Override
    public Object getItem(int i) {
        return classList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(context).inflate(R.layout.dialog_items,viewGroup,false);

        TextView classTitle = view.findViewById(R.id.class_title);
        final String title = classList.get(i).getTitle();
        classTitle.setText(title);

        return view;
    }
}
