package com.example.svadhyaya.dashboard.adapter;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.svadhyaya.R;
import com.example.svadhyaya.RetrofitModel.QuestionList;
import com.example.svadhyaya.SharedPrefrence.PrefManager;

import org.w3c.dom.Text;

import java.util.List;

public class TestAdapter extends RecyclerView.Adapter<TestAdapter.TestViewHolder> {
    Context context;
    int j=0;
    int correctans =0;
    int wrongans=0;

    ProgressDialog progressDialog;
    List<QuestionList> questionListList;
    PrefManager prefManager;


    public TestAdapter(Context context1,List<QuestionList> questionListList1){
        this.context=context1;
        this.questionListList=questionListList1;
    }

    @NonNull
    @Override
    public TestAdapter.TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.testitems,parent,false);
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage("Loading...");
        progressDialog.show();
        return new TestAdapter.TestViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull TestAdapter.TestViewHolder holder, int position) {
            prefManager=new PrefManager(context);
        QuestionList questionList=questionListList.get(0);
        holder.testquestion.setText(questionList.getQuestion());
        String str =questionList.getOptions().get(0).getOption();
        System.out.println("Before removing HTML Tags: " + str);
        str = str.replaceAll("\\<.*?\\>", "");
        holder.option1.setText("a. "+str);
        holder.option2.setText("b. "+questionList.getOptions().get(1).getOption_id());
        holder.option3.setText("c. "+questionList.getOptions().get(2).getOption_id());
        holder.option4.setText("d. "+questionList.getOptions().get(3).getOption_id());
        progressDialog.dismiss();
        holder.option1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View view) {
                holder.option1.setBackgroundColor(context.getResources().getColor(R.color.correct_ans_clr));
                holder.option2.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                holder.option3.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                holder.option4.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                if (questionList.getOptions().get(0).getIs_correct().equals("YES")){
                    holder.clear.setVisibility(View.VISIBLE);
                    correctans++;

                }
                else {
                    holder.wrong.setVisibility(View.VISIBLE);
                    wrongans++;
                }
            }
        });
        holder.option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                holder.option1.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                holder.option2.setBackgroundColor(context.getResources().getColor(R.color.correct_ans_clr));
                holder.option3.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                holder.option4.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                if (questionList.getOptions().get(1).getIs_correct().equals("YES")){
                    holder.clear.setVisibility(View.VISIBLE);
                    correctans++;
                }
                else {
                    holder.wrong.setVisibility(View.VISIBLE);
                    wrongans++;
                }
            }
        });
        holder.option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option1.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                holder.option2.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                holder.option3.setBackgroundColor(context.getResources().getColor(R.color.correct_ans_clr));
                holder.option4.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));

                if (questionList.getOptions().get(2).getIs_correct().equals("YES")){
                    holder.clear.setVisibility(View.VISIBLE);
                    correctans++;
                }
                else {
                    holder.wrong.setVisibility(View.VISIBLE);
                    wrongans++;
                }
            }
        });
        holder.option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option1.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                holder.option2.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                holder.option3.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                holder.option4.setBackgroundColor(context.getResources().getColor(R.color.correct_ans_clr));
                if (questionList.getOptions().get(3).getIs_correct().equals("YES")){
                    holder.clear.setVisibility(View.VISIBLE);
                    System.out.println("options is ______"+questionList.getOptions().get(3).getIs_correct());
                    correctans++;
                }
                else {
                    holder.wrong.setVisibility(View.VISIBLE);
                    wrongans++;
                }
            }
        });
        holder.next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.option1.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                holder.option2.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                holder.option3.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                holder.option4.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                if (j<questionListList.size() && j>=0) {
                    QuestionList questionListinner = questionListList.get(j);
                    holder.testquestion.setText(questionListinner.getQuestion());
                    String str =questionList.getOptions().get(0).getOption();
                    System.out.println("Before removing HTML Tags: " + str);
                    str = str.replaceAll("\\<.*?\\>", "");
                    holder.option1.setText("a "+str);
                    holder.option2.setText("b "+questionListinner.getOptions().get(1).getOption_id());
                    holder.option3.setText("c "+questionListinner.getOptions().get(2).getOption_id());
                    holder.option4.setText("d "+questionListinner.getOptions().get(3).getOption_id());
                    j++;
                    holder.option1.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            holder.option1.setBackgroundColor(context.getResources().getColor(R.color.correct_ans_clr));
                            holder.option2.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                            holder.option3.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                            holder.option4.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                            if (questionListinner.getOptions().get(0).getIs_correct().equals("YES")){
                                holder.clear.setVisibility(View.VISIBLE);
                                correctans++;
                            }
                            else {
                                holder.wrong.setVisibility(View.VISIBLE);
                                wrongans++;
                            }
                        }
                    });
                    holder.option2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            holder.option2.setBackgroundColor(context.getResources().getColor(R.color.correct_ans_clr));
                            holder.option1.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                            holder.option3.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                            holder.option4.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                            if (questionListinner.getOptions().get(1).getIs_correct().equals("YES")){
                                holder.clear.setVisibility(View.VISIBLE);
                                correctans++;
                            }
                            else {
                                holder.wrong.setVisibility(View.VISIBLE);
                                wrongans++;
                            }
                        }
                    });
                    holder.option3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            holder.option3.setBackgroundColor(context.getResources().getColor(R.color.correct_ans_clr));
                            holder.option2.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                            holder.option1.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                            holder.option4.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                            if (questionListinner.getOptions().get(2).getIs_correct().equals("YES")){
                                holder.clear.setVisibility(View.VISIBLE);
                                correctans++;
                            }
                            else {
                                holder.wrong.setVisibility(View.VISIBLE);
                                wrongans++;
                            }
                        }
                    });
                    holder.option4.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            holder.option1.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                            holder.option2.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                            holder.option3.setBackgroundColor(context.getResources().getColor(R.color.whiteapp));
                            holder.option4.setBackgroundColor(context.getResources().getColor(R.color.correct_ans_clr));
                            if (questionListinner.getOptions().get(3).getIs_correct().equals("YES")){
                                holder.clear.setVisibility(View.VISIBLE);
                                correctans++;
                                System.out.println("options is ______"+questionList.getOptions().get(3).getIs_correct());
                            }
                            else {
                                holder.wrong.setVisibility(View.VISIBLE);
                                correctans++;
                            }
                        }
                    });
                }
                else {
                    System.out.println("ended__________________");
                    Toast.makeText(context, "Ended"+correctans, Toast.LENGTH_SHORT).show();
                    prefManager.setCorrectans(String.valueOf(correctans));
                    prefManager.setWrongAns(String.valueOf(wrongans));
                }
            }
        });
    holder.clear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            holder.clear.setVisibility(View.INVISIBLE);
        }
    });
        holder.wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.wrong.setVisibility(View.INVISIBLE);
            }
        });
    }
    @Override
    public int getItemCount() {
        return 1;
    }
    public class TestViewHolder  extends RecyclerView.ViewHolder {
        TextView testquestion,option1,option2,option3,option4,prevois;
        Button next;
        ConstraintLayout wrong,clear;
        public TestViewHolder(@NonNull View itemView) {
            super(itemView);
            testquestion=itemView.findViewById(R.id.testquestion);
            option1=itemView.findViewById(R.id.option1);
            option2=itemView.findViewById(R.id.option2);
            option3=itemView.findViewById(R.id.option3);
            option4=itemView.findViewById(R.id.option4);
            next=itemView.findViewById(R.id.nextques);
            wrong=itemView.findViewById(R.id.contraintswrong);
            clear=itemView.findViewById(R.id.contraintsclear);
        }
    }
}
