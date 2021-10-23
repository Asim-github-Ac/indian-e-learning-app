package com.example.svadhyaya.dashboard.fragments;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.svadhyaya.R;
import com.example.svadhyaya.Retrofit.APIClient;
import com.example.svadhyaya.Retrofit.APIInterface;
import com.example.svadhyaya.RetrofitModel.ContactUs;
import com.google.android.material.snackbar.Snackbar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ContactUsFragment extends Fragment {
    EditText name,email,mobile,course,message;
    Button submit;
    APIInterface apiInterface;
    ConstraintLayout constraintLayout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact_us, container, false);
        apiInterface = APIClient.getRetrofit().create(APIInterface.class);
        initiliazation(view);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendDataContact(name.getText().toString(),email.getText().toString(),mobile.getText().toString(),course.getText().toString(),message.getText().toString());
            }
        });
        return view;
    }

    public void SendDataContact(String name,String email,String number,String course,String message){
                final ProgressDialog progressDialog = new ProgressDialog(getContext());
                progressDialog.setMessage("Loading...");
                progressDialog.show();
                final ContactUs contactUs=new ContactUs(name,email,number,course,message);
        Call<ContactUs> call= apiInterface.contactnow(contactUs);
        call.enqueue(new Callback<ContactUs>() {
            @Override
            public void onResponse(Call<ContactUs> call, Response<ContactUs> response) {
                    System.out.println("response"+response);
                    ContactUs contactUs1 = response.body();
                    System.out.println(contactUs1.getMessage());
                    if (contactUs1 != null && contactUs1.getStatus().equals("true")){
                        SnackBar("Thanks for Your precious time");
                        progressDialog.dismiss();
                    }else {
                        System.out.println("error within response_________");
                        SnackBar("Something Went Wrong Please Try again");
                        progressDialog.dismiss();
                    }
            }
            @Override
            public void onFailure(Call<ContactUs> call, Throwable t) {
                SnackBar("Developer Errors");
                progressDialog.dismiss();
            }
        });
    }
    public void SnackBar(String msg){
        Snackbar snackbar = Snackbar
                .make(constraintLayout, msg, Snackbar.LENGTH_LONG)
                .setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Snackbar snackbar1 = Snackbar.make(constraintLayout, "Wrong!", Snackbar.LENGTH_SHORT);
                        snackbar1.show();
                    }
                });
        snackbar.show();
    }
    public void initiliazation(View view){
        name=view.findViewById(R.id.nameis);
        email=view.findViewById(R.id.emailis);
        mobile=view.findViewById(R.id.numberis);
        course=view.findViewById(R.id.courseis);
        message=view.findViewById(R.id.messageis);
        submit=view.findViewById(R.id.submitis);
        constraintLayout=view.findViewById(R.id.constrantlayoutcontactus);
    }
}