package com.example.svadhyaya.dashboard.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svadhyaya.R;
import com.example.svadhyaya.Retrofit.APIClient;
import com.example.svadhyaya.Retrofit.APIInterface;
import com.example.svadhyaya.RetrofitModel.Folder_Lists;
import com.example.svadhyaya.RetrofitModel.SubFolderMaterial;
import com.example.svadhyaya.RetrofitModel.Subfiles;
import com.example.svadhyaya.RetrofitModel.TopicFolder;
import com.example.svadhyaya.SharedPrefrence.PrefManager;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TopicAdapter extends RecyclerView.Adapter<TopicAdapter.TopicviewHolder> {
    Context context;
    List<Subfiles> sublistfiles=new ArrayList<>();
    List<Folder_Lists> folder_lists;
    public TopicAdapter(Context contex, List<Folder_Lists> folder_lists){
        this.context=contex;
        this.folder_lists=folder_lists;
    }
    @NonNull
    @Override
    public TopicAdapter.TopicviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.topic_item,parent,false);
        return new TopicviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TopicAdapter.TopicviewHolder holder, int position) {
        Folder_Lists folder_lists1=folder_lists.get(position);
        System.out.println("");
        String topicname= folder_lists1.getFolder_name();
        String folderid= folder_lists1.getFolder_id();
        holder.topictext.setText(topicname);
        PrefManager prefManager=new PrefManager(context);
        APIInterface  apiInterface = APIClient.getClient().create(APIInterface.class);
        final SubFolderMaterial subFolderMaterial=new SubFolderMaterial(prefManager.getWeb_time(),folderid);
        Call<SubFolderMaterial> call=apiInterface.SUB_FOLDER_MATERIAL_CALL(subFolderMaterial);
        call.enqueue(new Callback<SubFolderMaterial>() {
            @Override
            public void onResponse(Call<SubFolderMaterial> call, Response<SubFolderMaterial> response) {
                System.out.println("subfolder fetched"+response);
                SubFolderMaterial subFolderMaterial1 = response.body();
                System.out.println(subFolderMaterial1.getMessage());
                if (subFolderMaterial1 !=null && subFolderMaterial1.getStatus().equals("true") ) {
                  //  System.out.println("subfolder fetched"+subFolderMaterial1.getData().getFolders().get(position));
                    sublistfiles=subFolderMaterial1.getData().getFiles();
                    LinearLayoutManager manager;
                    SubFolderAdapter subFolderAdapter=new SubFolderAdapter(context,sublistfiles);
                    manager = new LinearLayoutManager(context);
                    manager.setOrientation(RecyclerView.HORIZONTAL);
                    holder.recyclerView.setLayoutManager(manager);
                    subFolderAdapter = new SubFolderAdapter(context,sublistfiles);
                    holder.recyclerView.setAdapter(subFolderAdapter);
                    subFolderAdapter.notifyDataSetChanged();
                }else {

                }
            }

            @Override
            public void onFailure(Call<SubFolderMaterial> call, Throwable t) {

            }
        });
    //    SubfolderFetch("57316020e03f24759dce0fedeab4caa6",folderid);


    }

    @Override
    public int getItemCount() {
        return folder_lists.size();
    }

    public class TopicviewHolder extends RecyclerView.ViewHolder {
        TextView topictext;
        RecyclerView recyclerView;
        public TopicviewHolder(@NonNull View itemView) {
            super(itemView);
            topictext=itemView.findViewById(R.id.topicname);
            recyclerView=itemView.findViewById(R.id.subfolderrecycler);

        }
    }
    public void SubfolderFetch(String authkey,String subfolderid){


    }
}
