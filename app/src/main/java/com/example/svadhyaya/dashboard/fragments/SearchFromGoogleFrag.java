package com.example.svadhyaya.dashboard.fragments;

import static android.app.Activity.RESULT_OK;

import android.app.SearchManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.speech.RecognizerIntent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.svadhyaya.R;

import java.util.ArrayList;
import java.util.Locale;

public class SearchFromGoogleFrag extends Fragment {
ImageView micimage;
private final int REQ_CODE = 100;
EditText tv;
ImageView btnsearch;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_search_from_google, container, false);
        initilization(view);

        micimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                        RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
                intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Need to speak");
                try {
                    startActivityForResult(intent, REQ_CODE);
                } catch (ActivityNotFoundException a) {
                    Toast.makeText(getContext(),
                            "Sorry your device not supported",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                    String term = tv.getText().toString();
                    intent.putExtra(SearchManager.QUERY, term);
                    startActivity(intent);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        });

        return  view;
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case REQ_CODE: {
                if (RESULT_OK == resultCode && data != null) {
                    ArrayList result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    tv.setText((CharSequence) result.get(0));
                }
                break;
            }
        }
    }
    public void initilization(View view){
        micimage=view.findViewById(R.id.mic_img);
        tv=view.findViewById(R.id.speachtext);
        btnsearch=view.findViewById(R.id.btnsearch);

    }
}