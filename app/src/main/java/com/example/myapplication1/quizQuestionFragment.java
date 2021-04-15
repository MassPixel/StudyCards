package com.example.myapplication1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication1.data.AppDatabase;
import com.example.myapplication1.data.QuestionDAO;

import java.util.List;


public class quizQuestionFragment extends Fragment {


    public AppDatabase db;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_quiz_question, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        QuestionDAO qDAO = db.questionDAO();
        String pass = getArguments().getString("all");


        view.findViewById(R.id.askAllButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<String> qs = qDAO.getAllQuestions();
                if (qs.isEmpty()) {
                    System.out.println("No questions on record");
                }
            }
        });
    }
}